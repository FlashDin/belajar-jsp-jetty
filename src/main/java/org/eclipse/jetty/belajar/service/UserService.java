package org.eclipse.jetty.belajar.service;

import org.eclipse.jetty.belajar.dao.UserDAO;
import org.eclipse.jetty.belajar.dao.impl.UserDAOImpl;
import org.eclipse.jetty.belajar.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static UserDAO userDAO = (UserDAO) new UserDAOImpl();
    private static User user = new User();
    private static List<User> users = new ArrayList<>();

//    public void init() {
//        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
//        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
//        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
//    }

    // view data
    public void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        users = userDAO.findAll();
        req.setAttribute("dataUser", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/list.jsp");
        dispatcher.forward(req, resp);
    }

    // view form create
    public void viewCreate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/create.jsp");
        dispatcher.forward(req, resp);
    }

    // view form update
    public void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user.setId(Integer.valueOf(req.getParameter("id")));
        User data = userDAO.findById(user);
        req.setAttribute("dataUser", data);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/update.jsp");
        dispatcher.forward(req, resp);
    }

    // save data
    public void save(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user.setUsername(req.getParameter("txtUname"));
        user.setPassword(req.getParameter("txtPass"));
        User data = userDAO.save(user);
        resp.sendRedirect("/user/create?success");
    }

    // update data
    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user.setUsername(req.getParameter("txtUname"));
        user.setPassword(req.getParameter("txtPass"));
        user.setId(Integer.valueOf(req.getParameter("id")));
        User data = userDAO.update(user);
        resp.sendRedirect("/user?success");
    }

    // delete data
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user.setId(Integer.valueOf(req.getParameter("id")));
        int data = userDAO.delete(user);
        resp.sendRedirect("/user?success");
    }

}
