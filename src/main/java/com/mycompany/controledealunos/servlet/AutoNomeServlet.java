package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.AlunoBD;
import com.mycompany.controledealunos.DAO.Utils;

@WebServlet("/aluno/AutoNome")
public class AutoNomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String term = req.getParameter("term");
        String q = term.toLowerCase();
        
        AlunoBD alunoBD = new AlunoBD();

        List<String> listaNomes = alunoBD.getListaNome();
        List<String> filteredNamesList = Utils.filterListByTerm(listaNomes, q);
        String json = Utils.list2Json(filteredNamesList);

        resp.getWriter().write(json);
    }
}
