/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-25 08:29:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("#header{\r\n");
      out.write("}\r\n");
      out.write("#footer{\r\n");
      out.write("margin-top:510px;\r\n");
      out.write("text-align:center;\r\n");
      out.write("padding-top:25px;\r\n");
      out.write("height:3px;\r\n");
      out.write("}\r\n");
      out.write("div.form-group{\r\n");
      out.write("wnameth:250px;\r\n");
      out.write("}\r\n");
      out.write(".form-horizontal{\r\n");
      out.write("margin-top:-4%;\t\r\n");
      out.write("margin-left:35%;\r\n");
      out.write("wnameth:20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"wnameth=device-wnameth, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/bootstrap.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:antiquewhite;\">\r\n");
      out.write("<nav role=\"navigation\" class=\"navbar navbar-default\" id=\"header\">\r\n");
      out.write("<div>\r\n");
      out.write("<a href=\"www.whatsBoOk.com\" class=\"navbar-brand\">whatsBoOk</a>\r\n");
      out.write("</div>\r\n");
      out.write("</nav><br><br><br>\r\n");
      out.write("  <form class=\"form-horizontal\" role=\"form\" action=\"register\" method=\"POST\">\r\n");
      out.write("  <div class=\"col-sm-4\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"name\">Full Name:</label>\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Enter Name\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"mobile\">Mobile Number:</label>\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" name=\"mobile\" placeholder=\"Enter Mobile Number\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"pwd1\">Password:</label>\r\n");
      out.write("      <input type=\"password\" class=\"form-control\" name=\"pwd\" placeholder=\"Enter password\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"Gender\">Gender:</label>\r\n");
      out.write("      <select name=\"gender\" class=\"form-control\">\r\n");
      out.write("        <option value=\"male\">Male</option>\r\n");
      out.write("        <option value=\"female\">Female</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("      <label for=\"country\">Country:</label>\r\n");
      out.write("       <select name=\"country\" class=\"form-control\">\r\n");
      out.write("        <option value=\"Australia\">Australia</option>\r\n");
      out.write("        <option value=\"India\">India</option>\r\n");
      out.write("        <option value=\"Russia\">Russia</option>\r\n");
      out.write("        <option value=\"Italy\">Italy</option>\r\n");
      out.write("        <option value=\"Pakistan\">Pakistan</option>\r\n");
      out.write("        <option value=\"United Statess\">United States</option>\r\n");
      out.write("        \r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"checkbox\">\r\n");
      out.write("      <label><input type=\"checkbox\"> Remember me</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">Register</button>\r\n");
      out.write("\t<button type=\"reset\" class=\"btn btn-primary\">Reset</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<nav role=\"navigation\" class=\"navbar navbar-default\" id=\"footer\">\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("<p>Copyright  2018-2025 www.whatsBoOk.com</p>  \r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}