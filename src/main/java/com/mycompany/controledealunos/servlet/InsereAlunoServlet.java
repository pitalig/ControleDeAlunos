package com.mycompany.controledealunos.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.mycompany.controledealunos.DAO.AlunoBD;
import com.mycompany.controledealunos.modelo.Aluno;

@WebServlet("/aluno/insere")
public class InsereAlunoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		// obtem parametros do request
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		// instancia objeto Aluno
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setEmail(email);
		aluno.setEndereco(endereco);
		AlunoBD bd = new AlunoBD();
		bd.insere(aluno); // salva no BD
		// escreve a pagina que sera enviada como resposta
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Aluno " + aluno.getNome() + " inserido com sucesso!<h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
