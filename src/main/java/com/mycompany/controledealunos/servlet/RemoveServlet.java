package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.AlunoBD;
import com.mycompany.controledealunos.modelo.Aluno;

@WebServlet("/remove")
public class RemoveServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		// obtem parametros do request
		long id = Long.parseLong(req.getParameter("id"));
		// instancia objeto Aluno
		Aluno aluno = new Aluno();
		aluno.setId(id);
		AlunoBD bd = new AlunoBD();
		bd.remove(aluno); // salva no BD
		// escreve a pagina que sera enviada como resposta
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Aluno removido com sucesso!<h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
