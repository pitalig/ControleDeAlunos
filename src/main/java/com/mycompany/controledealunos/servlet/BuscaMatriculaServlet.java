package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.MatriculaBD;
import com.mycompany.controledealunos.modelo.Matricula;

@WebServlet("/matricula/busca")
public class BuscaMatriculaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MatriculaBD matricula = new MatriculaBD();
		List<Matricula> matriculas = matricula.getLista();
		req.getSession().setAttribute("Data", matriculas);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/matricula/lista.jsp");
		dispatcher.forward(req, resp);
	}
}
