package org.eclipse.jetty.belajar.controller;


import org.eclipse.jetty.belajar.dao.UserDAO;
import org.eclipse.jetty.belajar.dao.impl.UserDAOImpl;
import org.eclipse.jetty.belajar.entity.Profile;
import org.eclipse.jetty.belajar.entity.User;
import org.eclipse.jetty.belajar.service.BasicCRUD;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static UserDAO userDAO = (UserDAO) new UserDAOImpl();
    private static User user = new User();
    private static List<User> users = new ArrayList<>();

//    public void init() {
//        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
//        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
//        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
//    }

    // start of do request_response
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String act = req.getServletPath();
        RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
//        resp.setContentType("text/plain");
//        resp.getWriter().println(act);
        switch (act) {
            case "/list_user":
                this.findAll(req, resp);
                break;
            case "/list_user/insert":
                this.save(req, resp);
                break;
            case "/list_user/update":
                this.update(req, resp);
                break;
            case "/list_user/delete":
                this.delete(req, resp);
                break;
            default:
                dispatcher.forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
    // end of do request_response

    // start methods
    private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        users = userDAO.findAll();
        req.setAttribute("dataUser", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/list_user.jsp");
        dispatcher.forward(req, resp);
    }

    private void save(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        users = userDAO.findAll();
//        req.setAttribute("dataUser", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/save_user.jsp");
        dispatcher.forward(req, resp);
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        users = userDAO.findAll();
//        req.setAttribute("dataUser", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/update_user.jsp");
        dispatcher.forward(req, resp);
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        users = userDAO.findAll();
//        req.setAttribute("dataUser", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/delete_user.jsp");
        dispatcher.forward(req, resp);
    }
    // end methods
}
