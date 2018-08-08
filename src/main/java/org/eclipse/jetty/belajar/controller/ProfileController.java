package org.eclipse.jetty.belajar.controller;


import org.eclipse.jetty.belajar.entity.Profile;
import org.eclipse.jetty.belajar.service.ProfileService;
import org.eclipse.jetty.belajar.service.impl.ProfileServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@SuppressWarnings("serial")
public class ProfileController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ProfileService profileService = new ProfileServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String act = req.getServletPath();
        RequestDispatcher dispatcher;
        switch (act) {
            case "/profile":
                List<Profile> profiles = profileService.findAll();
                req.setAttribute("dataSets", profiles);
                dispatcher = req.getRequestDispatcher("/profile/list.jsp");
                dispatcher.forward(req, resp);
                break;
            case "/profile/create":
                dispatcher = req.getRequestDispatcher("/profile/create.jsp");
                dispatcher.forward(req, resp);
                break;
            case "/profile/update":
                Profile profile = new Profile();
                profile.setId(Integer.valueOf(req.getParameter("id")));
                Profile data = profileService.findById(profile);
                req.setAttribute("dataSets", data);
                dispatcher = req.getRequestDispatcher("/profile/update.jsp");
                dispatcher.forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String act = req.getServletPath();
        switch (act) {
            case "/profile/create":
                Profile profile = new Profile();
                profile.setNamaLengkap(req.getParameter("txtNama"));
                profile.setAlamat(req.getParameter("txtAlamat"));
                profile.setUmur(Integer.valueOf(req.getParameter("txtUmur")));
                profile.setJk(req.getParameter("cmbJk"));
                Profile data = profileService.save(profile);
                if (data == null) {
                    resp.sendRedirect("/profile/create?success=0");
                } else {
                    resp.sendRedirect("/profile/create?success=1");
                }
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
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Profile profile = new Profile();
        profile.setNamaLengkap(req.getParameter("txtNama"));
        profile.setAlamat(req.getParameter("txtAlamat"));
        profile.setUmur(Integer.valueOf(req.getParameter("txtUmur")));
        profile.setJk(req.getParameter("cmbJk"));
        profile.setId(Integer.valueOf(req.getParameter("id")));
        Profile data = profileService.update(profile);
        if (data == null) {
            resp.sendRedirect("/profile?usuccess=0");
        } else {
            resp.sendRedirect("/profile?usuccess=1");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Profile profile = new Profile();
        profile.setId(Integer.valueOf(req.getParameter("id")));
        int data = profileService.delete(profile);
        if (data == 0) {
            resp.sendRedirect("/profile?dsuccess=0");
        } else {
            resp.sendRedirect("/profile?dsuccess=1");
        }
    }
    
}