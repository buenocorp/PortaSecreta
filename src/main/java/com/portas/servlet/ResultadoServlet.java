package com.portas.servlet;

import com.portas.model.JogoSessao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/resultado")
public class ResultadoServlet extends HttpServlet {

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

        Boolean feedbackCorreto = (Boolean) session.getAttribute("feedbackCorreto");
        String feedbackRespostaCorreta = (String) session.getAttribute("feedbackRespostaCorreta");
        Boolean jogoReiniciadoPorErros = (Boolean) session.getAttribute("jogoReiniciadoPorErros");

        if (feedbackCorreto == null) {
            // Direct access without going through question — redirect to portas
            resp.sendRedirect(req.getContextPath() + "/portas");
            return;
        }

        // Remove feedback from session after reading
        session.removeAttribute("feedbackCorreto");
        session.removeAttribute("feedbackRespostaCorreta");
        session.removeAttribute("jogoReiniciadoPorErros");

        req.setAttribute("feedbackCorreto", feedbackCorreto);
        req.setAttribute("feedbackRespostaCorreta", feedbackRespostaCorreta);
        req.setAttribute("jogoReiniciadoPorErros", jogoReiniciadoPorErros);
        req.setAttribute("jogo", jogo);

        req.getRequestDispatcher("/WEB-INF/views/resultado.jsp").forward(req, resp);
    }
}
