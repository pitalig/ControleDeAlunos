package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
		PrintWriter out = resp.getWriter();
		// obtem parametros do request
		String opcao = req.getParameter("opcaoBusca");
		if (opcao.equals("todos")) {
			AlunoBD aluno = new AlunoBD();
			List<Aluno> alunos = aluno.getLista();
                        req.getSession().setAttribute("Data",alunos);
                        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/aluno/lista.jsp");
                        dispatcher.forward(req, resp);
		} else {
			String nome = req.getParameter("nomeBusca");
			AlunoBD aluno = new AlunoBD();
			List<Aluno> alunos = aluno.buscaAlunoPeloNome(nome);
			out.println("<html>");
			out.println("<body>");
			for (Aluno a : alunos) {
				out.println("<h2>ID: " + a.getId() + ", Nome: " + a.getNome() + ", Email: " + a.getEmail()
						+ ", Endereco: " + a.getEndereco() + "</h2>");
			}
			out.println("</body>");
			out.println("</html>");
		}
	}
}
