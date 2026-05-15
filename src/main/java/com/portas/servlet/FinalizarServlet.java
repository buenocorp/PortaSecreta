package com.portas.servlet;

import com.portas.manager.SalaManager;
import com.portas.model.JogoSessao;
import com.portas.model.RankingEntry;
import com.portas.model.Sala;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/finalizar")
public class FinalizarServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        JogoSessao jogo = (session != null) ? (JogoSessao) session.getAttribute("jogo") : null;

        if (jogo == null) {
            resp.sendRedirect(req.getContextPath() + "/home");
            return;
        }

        if (jogo.getFase() <= 50) {
            resp.sendRedirect(req.getContextPath() + "/portas");
            return;
        }

        long tempoMs = jogo.tempoDecorrido();
        RankingEntry entry = new RankingEntry(jogo.getNomeJogador(), tempoMs, new Date());

        SalaManager mgr = SalaManager.getInstance(getServletContext());
        Sala sala = mgr.getSala(jogo.getCodigoSala());
        List<RankingEntry> rankingList;
        if (sala != null) {
            sala.adicionarResultado(entry);
            rankingList = sala.getRanking();
            if (rankingList.size() > 10) {
                rankingList = rankingList.subList(0, 10);
            }
        } else {
            rankingList = new ArrayList<>();
        }

        req.setAttribute("entry", entry);
        req.setAttribute("ranking", rankingList);
        req.setAttribute("tempoFormatado", entry.getTempoFormatado());
        req.setAttribute("codigoSala", jogo.getCodigoSala());

        session.removeAttribute("jogo");

        req.getRequestDispatcher("/WEB-INF/views/fim.jsp").forward(req, resp);
    }
}
