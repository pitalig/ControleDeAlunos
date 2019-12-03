package com.mycompany.controledealunos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.MatriculaBD;
import com.mycompany.controledealunos.modelo.Matricula;

@WebServlet("/matricula/altera")
public class AlteraMatriculaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long ID = Long.parseLong(req.getParameter("ID"));
		Long alunoId = Long.parseLong(req.getParameter("alunoId"));
		Long discId = Long.parseLong(req.getParameter("discId"));

		Matricula matricula = new Matricula(ID, alunoId, discId);
		MatriculaBD bd = new MatriculaBD();
		bd.altera(matricula);
		String response = "Matricula " + matricula.getId() + " alterada com sucesso!";
		req.getSession().setAttribute("Data", response);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
		dispatcher.forward(req, resp);
	}
}
