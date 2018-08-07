package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/header.jsp", out, false);
      out.write("\n");
      out.write("<form action=\"create\" method=\"post\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\"></div>\n");
      out.write("        <div class=\"form-group col-md-4\">\n");
      out.write("            <h2>Insert User</h2>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\"></div>\n");
      out.write("        <div class=\"form-group col-md-4\">\n");
      out.write("            <button type=\"button\" class=\"close\" onclick=\"window.location.href='/user';\">&times;</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\"></div>\n");
      out.write("        <div class=\"form-group col-md-4\">\n");
      out.write("            <label for=\"txtUname\">Username</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"txtUname\" name=\"txtUname\" placeholder=\"Username\"\n");
      out.write("                   required>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\"></div>\n");
      out.write("        <div class=\"form-group col-md-4\">\n");
      out.write("            <label for=\"txtPass\">Password</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"txtPass\" name=\"txtPass\" placeholder=\"Password\"\n");
      out.write("                   required>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\"></div>\n");
      out.write("        <div class=\"form-group col-md-4\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\">Simpan</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/footer.jsp", out, false);
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
