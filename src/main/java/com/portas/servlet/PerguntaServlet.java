package com.portas.servlet;

import com.portas.model.JogoSessao;
import com.portas.model.Pergunta;
import com.portas.model.TipoPergunta;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/pergunta")
public class PerguntaServlet extends HttpServlet {

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

        if (jogo.getPerguntaAtual() == null) {
            resp.sendRedirect(req.getContextPath() + "/portas");
            return;
        }

        req.setAttribute("jogo", jogo);
        req.getRequestDispatcher("/WEB-INF/views/pergunta.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession(false);
        JogoSessao jogo = (session != null) ? (JogoSessao) session.getAttribute("jogo") : null;

        if (jogo == null) {
            resp.sendRedirect(req.getContextPath() + "/home");
            return;
        }

        Pergunta pergunta = jogo.getPerguntaAtual();
        if (pergunta == null) {
            resp.sendRedirect(req.getContextPath() + "/portas");
            return;
        }

        String resposta = req.getParameter("resposta");
        if (resposta == null) {
            resposta = "";
        }
        resposta = resposta.trim();

        boolean correto;
        if (pergunta.getTipo() == TipoPergunta.SQL_LIVRE) {
            String respostaNorm = normalizarSQL(resposta);
            String[] alternativas = pergunta.getRespostaCorreta().split("\\|");
            correto = false;
            for (String alt : alternativas) {
                if (normalizarSQL(alt).equals(respostaNorm)) {
                    correto = true;
                    break;
                }
            }
        } else {
            correto = pergunta.getRespostaCorreta().equalsIgnoreCase(resposta);
        }

        session.setAttribute("feedbackCorreto", correto);
        session.setAttribute("feedbackRespostaCorreta", pergunta.getRespostaCorreta());

        if (correto) {
            jogo.marcarPerguntaUsada(pergunta.getId());
            jogo.incrementarFase();
            jogo.setPerguntaAtual(null);
        }

        resp.sendRedirect(req.getContextPath() + "/resultado");
    }

    private String normalizarSQL(String sql) {
        if (sql == null) return "";
        return sql.trim().toUpperCase().replaceAll("\\s+", " ").replaceAll(";\\s*$", "").trim();
    }
}
