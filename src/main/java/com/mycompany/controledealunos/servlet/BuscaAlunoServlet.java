package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.AlunoBD;
import com.mycompany.controledealunos.modelo.Aluno;
import javax.servlet.RequestDispatcher;

@WebServlet("/aluno/busca")
public class BuscaAlunoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// obtem parametros do request
		String opcao = req.getParameter("opcaoBusca");
		if (opcao.equals("todos")) {
			AlunoBD aluno = new AlunoBD();
			List<Aluno> alunos = aluno.getLista();
			req.getSession().setAttribute("Data", alunos);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/aluno/lista.jsp");
			dispatcher.forward(req, resp);
		} else {
			String nome = req.getParameter("nomeBusca");
			AlunoBD aluno = new AlunoBD();
			List<Aluno> alunos = aluno.buscaAlunoPeloNome(nome);
			req.getSession().setAttribute("Data", alunos);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/aluno/lista.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
