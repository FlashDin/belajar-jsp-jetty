package org.eclipse.jetty.belajar.controller;


import org.eclipse.jetty.belajar.service.ProfileService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
public class ProfileController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ProfileService profileService = new ProfileService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String act = req.getServletPath();
        switch (act) {
            case "/profile":
                profileService.findAll(req, resp);
                break;
            case "/profile/create":
                profileService.viewCreate(req, resp);
                break;
            case "/profile/update":
                profileService.viewUpdate(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String act = req.getServletPath();
        switch (act) {
            case "/profile/create":
                profileService.save(req, resp);
                break;
            case "/profile/update":
                this.doPut(req, resp);
                break;
            case "/profile/delete":
                this.doDelete(req, resp);
                break;
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        profileService.update(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        profileService.delete(req, resp);
    }
}
