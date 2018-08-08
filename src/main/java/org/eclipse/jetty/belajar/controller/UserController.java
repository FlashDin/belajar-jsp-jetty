package org.eclipse.jetty.belajar.controller;


import org.eclipse.jetty.belajar.entity.User;
import org.eclipse.jetty.belajar.service.UserService;
import org.eclipse.jetty.belajar.service.dao.UserServiceDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@SuppressWarnings("serial")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserServiceDAO userServiceDAO = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String act = req.getServletPath();
        RequestDispatcher dispatcher;
        switch (act) {
            case "/user":
                List<User> users = userServiceDAO.findAll();
                req.setAttribute("dataSets", users);
                dispatcher = req.getRequestDispatcher("/user/list.jsp");
                dispatcher.forward(req, resp);
                break;
            case "/user/create":
                dispatcher = req.getRequestDispatcher("/user/create.jsp");
                dispatcher.forward(req, resp);
                break;
            case "/user/update":
                User user = new User();
                user.setId(Integer.valueOf(req.getParameter("id")));
                User data = userServiceDAO.findById(user);
                req.setAttribute("dataSets", data);
                dispatcher = req.getRequestDispatcher("/user/update.jsp");
                dispatcher.forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String act = req.getServletPath();
        switch (act) {
            case "/user/create":
                User user = new User();
                user.setUsername(req.getParameter("txtUname"));
                user.setPassword(req.getParameter("txtPass"));
                User data = userServiceDAO.save(user);
                if (data == null) {
                    resp.sendRedirect("/user/create?success=0");
                } else {
                    resp.sendRedirect("/user/create?success=1");
                }
                break;
            case "/user/update":
                this.doPut(req, resp);
                break;
            case "/user/delete":
                this.doDelete(req, resp);
                break;
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUsername(req.getParameter("txtUname"));
        user.setPassword(req.getParameter("txtPass"));
        user.setId(Integer.valueOf(req.getParameter("id")));
        User data = userServiceDAO.update(user);
        if (data == null) {
            resp.sendRedirect("/user?usuccess=0");
        } else {
            resp.sendRedirect("/user?usuccess=1");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setId(Integer.valueOf(req.getParameter("id")));
        int data = userServiceDAO.delete(user);
        if (data == 0) {
            resp.sendRedirect("/user?dsuccess=0");
        } else {
            resp.sendRedirect("/user?dsuccess=1");
        }
    }

}
