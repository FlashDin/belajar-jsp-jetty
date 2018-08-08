package org.eclipse.jetty.belajar.service;

import org.eclipse.jetty.belajar.dao.ProfileDAO;
import org.eclipse.jetty.belajar.dao.impl.ProfileDAOImpl;
import org.eclipse.jetty.belajar.entity.Profile;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProfileService {

    private ProfileDAO profileDAO = (ProfileDAO) new ProfileDAOImpl();

//    public void init() {
//        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
//        String jdbcProfilename = getServletContext().getInitParameter("jdbcProfilename");
//        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
//    }

    // view data
    public void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Profile> profiles = profileDAO.findAll();
        req.setAttribute("dataSets", profiles);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/profile/list.jsp");
        dispatcher.forward(req, resp);
    }

    // view form create
    public void viewCreate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/profile/create.jsp");
        dispatcher.forward(req, resp);
    }

    // view form update
    public void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Profile profile = new Profile();
        profile.setId(Integer.valueOf(req.getParameter("id")));
        Profile data = profileDAO.findById(profile);
        req.setAttribute("dataSets", data);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/profile/update.jsp");
        dispatcher.forward(req, resp);
    }

    // save data
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

    // update data
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

    // delete data
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Profile profile = new Profile();
        profile.setId(Integer.valueOf(req.getParameter("id")));
        int data = profileDAO.delete(profile);
        if (data == 0) {
            resp.sendRedirect("/profile?dsuccess=0");
        } else {
            resp.sendRedirect("/profile?dsuccess=1");
        }
    }

}
