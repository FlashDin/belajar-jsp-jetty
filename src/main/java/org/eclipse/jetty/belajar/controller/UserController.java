package org.eclipse.jetty.belajar.controller;


import org.eclipse.jetty.belajar.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String act = req.getServletPath();
        switch (act) {
            case "/user":
                userService.findAll(req, resp);
                break;
            case "/user/create":
                userService.viewCreate(req, resp);
                break;
            case "/user/update":
                userService.viewUpdate(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String act = req.getServletPath();
        switch (act) {
            case "/user/create":
                userService.save(req, resp);
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
        userService.update(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService.delete(req, resp);
    }
}
