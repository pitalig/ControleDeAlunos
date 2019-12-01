package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		PrintWriter out = resp.getWriter();
		
		MatriculaBD matricula = new MatriculaBD();
		List<Matricula> matriculas = matricula.getLista();
		out.println("<html>");
		out.println("<body>");
		for (Matricula a : matriculas) {
			out.println("<h2>ID: " + a.getId() + ", Aluno: " + a.getAluno().getNome() + ", Disciplina: " + a.getDisc().getNome() + "</h2>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
