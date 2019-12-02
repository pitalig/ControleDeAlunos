package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		PrintWriter out = resp.getWriter();
		
		String opcao = req.getParameter("opcaoBusca");
		if (opcao.equals("todos")) {
			DisciplinaBD disciplina = new DisciplinaBD();
			List<Disciplina> disciplinas = disciplina.getLista();
			out.println("<html>");
			out.println("<body>");
			for (Disciplina a : disciplinas) {
				out.println("<h2>ID: " + a.getId() + ", Nome: " + a.getNome() + ", Creditos: " + a.getCreditos()
						+ ", Vagas: " + a.getVagas() + "</h2>");
			}
			out.println("</body>");
			out.println("</html>");
		} else {
			String nome = req.getParameter("disciplinaBusca");
			DisciplinaBD disciplina = new DisciplinaBD();
			List<Disciplina> disciplinas = disciplina.buscaDisciplinaPeloNome(nome);
			out.println("<html>");
			out.println("<body>");
			for (Disciplina a : disciplinas) {
				out.println("<h2>ID: " + a.getId() + ", Nome: " + a.getNome() + ", Creditos: " + a.getCreditos()
						+ ", Vagas: " + a.getVagas() + "</h2>");
			}
			out.println("</body>");
			out.println("</html>");
		}
	}
}
