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

@WebServlet("/disciplina/altera")
public class AlteraDisciplinaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long ID = Long.parseLong(req.getParameter("ID"));
		String nome = req.getParameter("nome");
		int creditos = Integer.parseInt(req.getParameter("creditos"));
		int vagas = Integer.parseInt(req.getParameter("vagas"));
		
		Disciplina disciplina = new Disciplina(ID, nome, creditos, vagas);
		DisciplinaBD bd = new DisciplinaBD();
		bd.altera(disciplina);
		String response = "Disciplina " + disciplina.getNome() + " alterada com sucesso!";
		req.getSession().setAttribute("Data", response);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
		dispatcher.forward(req, resp);
	}
}
