package com.portas.servlet;

import com.portas.dao.PerguntaDAO;
import com.portas.model.JogoSessao;
import com.portas.model.Pergunta;
import com.portas.model.TipoTema;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

@WebServlet("/portas")
public class PortasServlet extends HttpServlet {

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

        // Shuffle the 3 themes for this phase display
        List<TipoTema> temas = new ArrayList<>(Arrays.asList(TipoTema.values()));
        Collections.shuffle(temas);
        TipoTema[] temasOrdem = temas.toArray(new TipoTema[3]);
        jogo.setTemasPortas(temasOrdem);

        req.setAttribute("temasOrdem", temasOrdem);
        req.setAttribute("jogo", jogo);
        req.getRequestDispatcher("/WEB-INF/views/portas.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        JogoSessao jogo = (session != null) ? (JogoSessao) session.getAttribute("jogo") : null;

        if (jogo == null) {
            resp.sendRedirect(req.getContextPath() + "/home");
            return;
        }

        String temaParam = req.getParameter("tema");
        if (temaParam == null) {
            resp.sendRedirect(req.getContextPath() + "/portas");
            return;
        }

        TipoTema tema;
        try {
            tema = TipoTema.valueOf(temaParam.toUpperCase());
        } catch (IllegalArgumentException e) {
            resp.sendRedirect(req.getContextPath() + "/portas");
            return;
        }

        Pergunta pergunta = PerguntaDAO.getPerguntaAleatoria(tema, jogo.getPerguntasUsadas());
        if (pergunta == null) {
            // No more questions for this theme — forward with error message
            req.setAttribute("erro", "Não há mais perguntas disponíveis para o tema " + tema + ". Escolha outra porta.");
            req.setAttribute("jogo", jogo);
            req.setAttribute("temasOrdem", jogo.getTemasPortas());
            req.getRequestDispatcher("/WEB-INF/views/portas.jsp").forward(req, resp);
            return;
        }

        jogo.setPerguntaAtual(pergunta);
        resp.sendRedirect(req.getContextPath() + "/pergunta");
    }
}
