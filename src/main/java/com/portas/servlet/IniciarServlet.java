package com.portas.servlet;

import com.portas.manager.SalaManager;
import com.portas.model.JogoSessao;
import com.portas.model.Sala;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/iniciar")
public class IniciarServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String nome = req.getParameter("nome");
        if (nome == null || nome.trim().isEmpty()) {
            nome = "Anônimo";
        } else {
            nome = nome.trim();
        }

        String codigoParam = req.getParameter("codigo");
        String codigoSala = (codigoParam != null) ? codigoParam.trim().toUpperCase() : "";

        SalaManager mgr = SalaManager.getInstance(getServletContext());
        Sala sala = mgr.getSala(codigoSala);

        if (sala == null) {
            req.setAttribute("erro", "Código de sala inválido ou inexistente: " + codigoSala);
            req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
            return;
        }

        JogoSessao jogo = new JogoSessao(nome, codigoSala, System.currentTimeMillis());

        HttpSession session = req.getSession(true);
        session.setAttribute("jogo", jogo);

        resp.sendRedirect(req.getContextPath() + "/portas");
    }
}
