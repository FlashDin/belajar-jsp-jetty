package org.eclipse.jetty.belajar.controller;


import org.eclipse.jetty.belajar.service.ProfileService;
import org.eclipse.jetty.belajar.service.impl.ProfileServiceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ProfileController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ProfileService profileService = new ProfileServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String act = req.getServletPath();
        switch (act) {
            case "/profile":
                /*profileService.findAll(req, resp);*/
                break;
            case "/profile/create":
                /*profileService.viewCreate(req, resp);*/
                break;
            case "/profile/update":
                /*profileService.viewUpdate(req, resp);*/
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String act = req.getServletPath();
        switch (act) {
            case "/profile/create":
                /*profileService.save(req, resp);*/
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
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) {
        /*profileService.update(req, resp);*/
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {
        /*profileService.delete(req, resp);*/
    }
}


    // TODO Pindah disini, jadi service cuma mengolah data.
    /*public void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Profile> profiles = profileDAO.findAll();
        req.setAttribute("dataSets", profiles);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/profile/list.jsp");
        dispatcher.forward(req, resp);
    }

    public void viewCreate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/profile/create.jsp");
        dispatcher.forward(req, resp);
    }

    public void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Profile profile = new Profile();
        profile.setId(Integer.valueOf(req.getParameter("id")));
        Profile data = profileDAO.findById(profile);
        req.setAttribute("dataSets", data);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/profile/update.jsp");
        dispatcher.forward(req, resp);
    }

    public void save(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Profile profile = new Profile();
        profile.setNamaLengkap(req.getParameter("txtNama"));
        profile.setAlamat(req.getParameter("txtAlamat"));
        profile.setUmur(Integer.valueOf(req.getParameter("txtUmur")));
        profile.setJk(req.getParameter("cmbJk"));
        Profile data = profileDAO.save(profile);
        if (data == null) {
            resp.sendRedirect("/profile/create?success=0");
        } else {
            resp.sendRedirect("/profile/create?success=1");
        }
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Profile profile = new Profile();
        profile.setNamaLengkap(req.getParameter("txtNama"));
        profile.setAlamat(req.getParameter("txtAlamat"));
        profile.setUmur(Integer.valueOf(req.getParameter("txtUmur")));
        profile.setJk(req.getParameter("cmbJk"));
        profile.setId(Integer.valueOf(req.getParameter("id")));
        Profile data = profileDAO.update(profile);
        if (data == null) {
            resp.sendRedirect("/profile?usuccess=0");
        } else {
            resp.sendRedirect("/profile?usuccess=1");
        }
    }

    public void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Profile profile = new Profile();
        profile.setId(Integer.valueOf(req.getParameter("id")));
        int data = profileDAO.delete(profile);
        if (data == 0) {
            resp.sendRedirect("/profile?dsuccess=0");
        } else {
            resp.sendRedirect("/profile?dsuccess=1");
        }
    }*/