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

@WebServlet("/aluno/altera")
public class AlteraAlunoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// obtem parametros do request
		Long ID = Long.parseLong(req.getParameter("ID"));
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		// instancia objeto Aluno
		Aluno aluno = new Aluno();
		aluno.setId(ID);
		aluno.setNome(nome);
		aluno.setEmail(email);
		aluno.setEndereco(endereco);
		AlunoBD bd = new AlunoBD();
		bd.altera(aluno);
		String response = "Aluno " + aluno.getNome() + " alterado com sucesso!";
		req.getSession().setAttribute("Data", response);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/message.jsp");
		dispatcher.forward(req, resp);
	}
}
