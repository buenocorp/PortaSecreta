package com.portas.servlet;

import com.portas.manager.SalaManager;
import com.portas.model.RankingEntry;
import com.portas.model.Sala;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ranking")
public class RankingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String codigoParam = req.getParameter("sala");

        if (codigoParam == null || codigoParam.trim().isEmpty()) {
            // No sala code provided — show search form
            req.getRequestDispatcher("/WEB-INF/views/ranking.jsp").forward(req, resp);
            return;
        }

        String codigo = codigoParam.trim().toUpperCase();
        SalaManager mgr = SalaManager.getInstance(getServletContext());
        Sala sala = mgr.getSala(codigo);

        if (sala == null) {
            req.setAttribute("erro", "Sala não encontrada: " + codigo);
            req.setAttribute("ranking", new ArrayList<RankingEntry>());
        } else {
            List<RankingEntry> rankingList = sala.getRanking();
            req.setAttribute("sala", sala);
            req.setAttribute("ranking", rankingList);
        }

        req.getRequestDispatcher("/WEB-INF/views/ranking.jsp").forward(req, resp);
    }
}
