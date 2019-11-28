package com.mycompany.controledealunos.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.mycompany.controledealunos.DAO.DisciplinaBD;
import com.mycompany.controledealunos.modelo.Disciplina;

@WebServlet("/insere-disciplina")
public class InsereDisciplinaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		Long ID = Long.parseLong(req.getParameter("ID"));
		String nome = req.getParameter("nome");
		int creditos = Integer.parseInt(req.getParameter("creditos"));
		int vagas = Integer.parseInt(req.getParameter("vagas"));
		
		Disciplina disciplina = new Disciplina(ID, nome, creditos, vagas);
		DisciplinaBD bd = new DisciplinaBD();
		bd.insere(disciplina);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Disciplina " + disciplina.getNome() + " inserida com sucesso!<h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
