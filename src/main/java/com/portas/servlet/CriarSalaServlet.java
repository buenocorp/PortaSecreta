package com.portas.servlet;

import com.portas.manager.SalaManager;
import com.portas.model.Sala;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/criar-sala")
public class CriarSalaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/criar_sala.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        SalaManager mgr = SalaManager.getInstance(getServletContext());
        Sala sala = mgr.criarSala();
        req.setAttribute("sala", sala);
        req.getRequestDispatcher("/WEB-INF/views/criar_sala.jsp").forward(req, resp);
    }
}
