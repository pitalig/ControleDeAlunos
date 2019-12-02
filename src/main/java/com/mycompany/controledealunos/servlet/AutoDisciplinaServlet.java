package com.mycompany.controledealunos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.controledealunos.DAO.DisciplinaBD;
import com.mycompany.controledealunos.DAO.Utils;

@WebServlet("/disciplina/AutoDisciplina")
public class AutoDisciplinaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String term = req.getParameter("term");
        String q = term.toLowerCase();
        
        DisciplinaBD disciplinaBD = new DisciplinaBD();

        List<String> listaNomes = disciplinaBD.getListaDisciplina();
        List<String> filteredNamesList = Utils.filterListByTerm(listaNomes, q);
        String json = Utils.list2Json(filteredNamesList);

        resp.getWriter().write(json);
    }
}
