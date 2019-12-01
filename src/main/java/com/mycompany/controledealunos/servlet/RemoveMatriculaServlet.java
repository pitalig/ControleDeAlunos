package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.MatriculaBD;
import com.mycompany.controledealunos.modelo.Matricula;

@WebServlet("/matricula/remove")
public class RemoveMatriculaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		long id = Long.parseLong(req.getParameter("id"));
		Matricula matricula = new Matricula();
		matricula.setId(id);
		MatriculaBD bd = new MatriculaBD();
		bd.remove(matricula);
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Matricula removida com sucesso!<h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
