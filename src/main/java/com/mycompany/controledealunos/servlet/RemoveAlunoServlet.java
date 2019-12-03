package com.mycompany.controledealunos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.AlunoBD;
import com.mycompany.controledealunos.modelo.Aluno;

@WebServlet("/aluno/remove")
public class RemoveAlunoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // obtem parametros do request
            long id = Long.parseLong(req.getParameter("id"));
            // instancia objeto Aluno
            Aluno aluno = new Aluno();
            aluno.setId(id);
            AlunoBD bd = new AlunoBD();
            bd.remove(aluno); 
            String response = "Aluno removido com sucesso!";
            req.getSession().setAttribute("Data", response);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
            dispatcher.forward(req, resp);
        } catch (RuntimeException ex) {
            if (ex.getMessage().contains("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException")) {
                String response = "Não é permitido remover um aluno com matrí­culas atreladas a ele!";
                req.getSession().setAttribute("Data", response);
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
                dispatcher.forward(req, resp);
            } else {
                throw ex;
            }
        }
    }
}
