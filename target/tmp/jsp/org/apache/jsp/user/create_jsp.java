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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Insert User</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/assets/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <script src=\"/assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"create\" method=\"post\">\n");
      out.write("    <table>\n");
      out.write("        <h2>Insert User</h2>\n");
      out.write("        <tr>\n");
      out.write("            <td>Username</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" id=\"txtUname\" name=\"txtUname\" placeholder=\"Username\" required>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Password</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" id=\"txtPass\" name=\"txtPass\" placeholder=\"Password\" required>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <button type=\"submit\">Simpan</button>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <button type=\"button\" onclick=\"window.location.href='/user';\">Batal</button>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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