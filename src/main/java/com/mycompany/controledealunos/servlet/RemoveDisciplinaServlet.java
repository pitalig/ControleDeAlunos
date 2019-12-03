package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.DisciplinaBD;
import com.mycompany.controledealunos.modelo.Disciplina;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

@WebServlet("/disciplina/remove")
public class RemoveDisciplinaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PrintWriter out = resp.getWriter();
            // obtem parametros do request
            long id = Long.parseLong(req.getParameter("id"));
            // instancia objeto Disciplina
            Disciplina disciplina = new Disciplina();
            disciplina.setId(id);
            DisciplinaBD bd = new DisciplinaBD();
            bd.remove(disciplina); // salva no BD
            // escreve a pagina que sera enviada como resposta
            out.println("<html>");
            out.println("<body>");
            out.println("<h2>Disciplina removida com sucesso!<h2>");
            out.println("</body>");
            out.println("</html>");
        } catch (RuntimeException ex) {
            if (ex.getMessage().contains("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException")) {
                PrintWriter out = resp.getWriter();
                out.println("<html>");
                out.println("<body>");
                out.println("<h2>Não é permitido remover uma disciplina com matrículas atreladas a ela!<h2>");
                out.println("</body>");
                out.println("</html>");
            } else {
                throw ex;
            }
        }
    }
}
