package com.mycompany.controledealunos.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.mycompany.controledealunos.DAO.DisciplinaBD;
import com.mycompany.controledealunos.modelo.Disciplina;

@WebServlet("/disciplina/insere")
public class InsereDisciplinaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		String nome = req.getParameter("nome");
		int creditos = Integer.parseInt(req.getParameter("creditos"));
		int vagas = Integer.parseInt(req.getParameter("vagas"));
		
		Disciplina disciplina = new Disciplina(nome, creditos, vagas);
		DisciplinaBD bd = new DisciplinaBD();
		bd.insere(disciplina);
		String response = "Disciplina inserida com sucesso!";
		req.getSession().setAttribute("Data", response);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
		dispatcher.forward(req, resp);
	}
}
