package fr.wildcodeschool.githubtracker;

import fr.wildcodeschool.githubtracker.model.GithuberModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = "/githubers")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<GithuberModel> testlist = new ArrayList<GithuberModel>();
        testlist.add(new GithuberModel("Githuber 1", "git1@wcs.fr", "log1", "URL1", 1));
        testlist.add(new GithuberModel("Githuber 2", "git2@wcs.fr", "log2", "URL2", 2));
        testlist.add(new GithuberModel("Githuber 3", "git3@wcs.fr", "log3", "URL3", 3));
        testlist.add(new GithuberModel("Githuber 4", "git4@wcs.fr", "log4", "URL4", 4));
        testlist.add(new GithuberModel("Githuber 5", "git5@wcs.fr", "log5", "URL5", 5));


        request.setAttribute("githubersList", testlist);
        this.getServletContext().getRequestDispatcher("/githubers.jsp").forward(request,  response);
    }
}
