package org.eclipse.jetty.belajar.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ErrorServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/plain");
        PrintWriter out = null;
        try
        {
            out = resp.getWriter();
            out.printf("WebApp Issued Error%n");
            out.printf("Error: %s%n",req.getAttribute("javax.servlet.error.servlet_name"));
            Throwable th = (Throwable)req.getAttribute("javax.servlet.error.exception");
            if (th != null)
            {
                th.printStackTrace(out);
            }
        } finally {
            out.close();
        }
    }
}
