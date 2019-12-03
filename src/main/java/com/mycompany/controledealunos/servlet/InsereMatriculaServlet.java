package com.mycompany.controledealunos.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.mycompany.controledealunos.DAO.MatriculaBD;
import com.mycompany.controledealunos.modelo.Matricula;

@WebServlet("/matricula/insere")
public class InsereMatriculaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long alunoId = Long.parseLong(req.getParameter("alunoId"));
		Long discId = Long.parseLong(req.getParameter("discId"));

		Matricula matricula = new Matricula(alunoId, discId);
		MatriculaBD bd = new MatriculaBD();
		bd.insere(matricula);
		String response = "Matrícula inserida com sucesso!";
		req.getSession().setAttribute("Data", response);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
		dispatcher.forward(req, resp);
	}
}
