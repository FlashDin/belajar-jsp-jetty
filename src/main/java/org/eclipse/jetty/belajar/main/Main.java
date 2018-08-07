package org.eclipse.jetty.belajar.main;


import org.eclipse.jetty.belajar.entity.Profile;
import org.eclipse.jetty.belajar.service.BasicCRUD;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@SuppressWarnings("serial")
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String act = req.getServletPath();
        RequestDispatcher dispatcher;
        switch (act) {
            case "/insert":
                dispatcher = req.getRequestDispatcher("insert_user.jsp");
                dispatcher.forward(req, resp);
                break;
            case "/update":
                dispatcher = req.getRequestDispatcher("update_user.jsp");
                dispatcher.forward(req, resp);
                break;
            case "/delete":
                dispatcher = req.getRequestDispatcher("delete_user.jsp");
                dispatcher.forward(req, resp);
                break;
            default:
                dispatcher = req.getRequestDispatcher("list_user.jsp");
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

    //    public static void main(String[] args) {
//        BasicCRUD crud = new BasicCRUD();
//        crud.initData();
//
//        Map<String, Profile> datas = crud.saveUsingKey("4", new Profile("", "", 1, ""));
//        for (Map.Entry<String, Profile> map : datas.entrySet()) {
//            System.out.println("KEY : " + map.getKey() + " VALUE : " + map.getValue());
//        }
//
//        System.out.println("DATA PROFILE : " + crud.getDataByIndex(0));
//    }
}
