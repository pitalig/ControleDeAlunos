package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.DisciplinaBD;
import com.mycompany.controledealunos.modelo.Disciplina;

@WebServlet("/disciplina/busca")
public class BuscaDisciplinaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String opcao = req.getParameter("opcaoBusca");
		DisciplinaBD disciplina = new DisciplinaBD();
		if (opcao.equals("todos")) {
			List<Disciplina> disciplinas = disciplina.getLista();
			req.getSession().setAttribute("Data", disciplinas);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/disciplina/lista.jsp");
			dispatcher.forward(req, resp);
		} else {
			String nome = req.getParameter("disciplinaBusca");
			List<Disciplina> disciplinas = disciplina.buscaDisciplinaPeloNome(nome);
			req.getSession().setAttribute("Data", disciplinas);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/disciplina/lista.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
