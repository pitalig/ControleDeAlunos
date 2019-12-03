package com.mycompany.controledealunos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.DisciplinaBD;
import com.mycompany.controledealunos.modelo.Disciplina;

@WebServlet("/disciplina/remove")
public class RemoveDisciplinaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // obtem parametros do request
            long id = Long.parseLong(req.getParameter("id"));
            // instancia objeto Disciplina
            Disciplina disciplina = new Disciplina();
            disciplina.setId(id);
            DisciplinaBD bd = new DisciplinaBD();
            bd.remove(disciplina);
            String response = "Disciplina removida com sucesso!";
            req.getSession().setAttribute("Data", response);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
            dispatcher.forward(req, resp);
        } catch (RuntimeException ex) {
            if (ex.getMessage().contains("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException")) {
                String response = "Não é permitido remover uma disciplina com matrí­culas atreladas a ela!";
                req.getSession().setAttribute("Data", response);
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
                dispatcher.forward(req, resp);
            } else {
                throw ex;
            }
        }
    }
}
