package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Task;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/new")
public class NewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("_token", request.getSession().getId());

        request.setAttribute("task", new Task());

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/tasks/new.jsp");
        rd.forward(request, response);




    }
}
















        //        EntityManager em = DBUtil.createEntityManager();
//        em.getTransaction().begin();
//
//        Task t = new Task();
//
//        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
//        t.setCreated_at(currentTime);
//        t.setUpdated_at(currentTime);
//
//        String content = "cleaness";
//        t.setContent(content);
//
//        em.persist(t);
//        em.getTransaction().commit();
//
//        response.getWriter().append(Integer.valueOf(t.getId()).toString());
//
//        em.close();

