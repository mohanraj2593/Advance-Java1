/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.30
 * Generated at: 2024-10-19 15:23:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.ArrayList;
import com.tap.acad.model.employee;

public final class showEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

ArrayList<employee> empList; 
  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("com.tap.acad.model.employee");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Employee Details</title>\r\n");
      out.write("<style>\r\n");
      out.write("    body {\r\n");
      out.write("        font-family: Arial, sans-serif;\r\n");
      out.write("        background-color: #f4f4f9;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("    }\r\n");
      out.write("    h1 {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        padding: 20px 0;\r\n");
      out.write("        color: #333;\r\n");
      out.write("    }\r\n");
      out.write("    .card-container {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-wrap: wrap;\r\n");
      out.write("        justify-content: center;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        gap: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .card {\r\n");
      out.write("        flex: 0 1 calc(33.33% - 40px); /* Ensure 3 cards per row */\r\n");
      out.write("        border: 1px solid #ddd;\r\n");
      out.write("        border-radius: 8px;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        box-shadow: 0 4px 8px rgba(0,0,0,0.1);\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("    .card h3 {\r\n");
      out.write("        margin: 0 0 10px;\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        color: #333;\r\n");
      out.write("    }\r\n");
      out.write("    .card p {\r\n");
      out.write("        margin: 5px 0;\r\n");
      out.write("        font-size: 14px;\r\n");
      out.write("        color: #555;\r\n");
      out.write("    }\r\n");
      out.write("    @media (max-width: 900px) {\r\n");
      out.write("        .card {\r\n");
      out.write("            flex: 0 1 calc(50% - 40px); /* 2 cards per row for smaller screens */\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    @media (max-width: 600px) {\r\n");
      out.write("        .card {\r\n");
      out.write("            flex: 0 1 calc(100% - 40px); /* 1 card per row for small screens */\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h1>Employee Details</h1>\r\n");
      out.write("<center>\r\n");
      out.write("<a href=\"addEmployee.jsp\"><button>Add Employee</button></a>\r\n");
      out.write("</center>\r\n");
      out.write("<div class=\"card-container\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
  
    empList = (ArrayList<employee>) session.getAttribute("empList");
    for (employee e : empList) { 
    
      out.write("\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        <h3>");
      out.print( e.getEmpname() );
      out.write("</h3>\r\n");
      out.write("        <p><strong>Employee ID:</strong> ");
      out.print( e.getEmpid() );
      out.write("</p>\r\n");
      out.write("        <p><strong>Designation:</strong> ");
      out.print( e.getDesig() );
      out.write("</p>\r\n");
      out.write("        <p><strong>Salary:</strong> ");
      out.print( e.getSalary() );
      out.write("</p>\r\n");
      out.write("        <p><strong>Email:</strong> ");
      out.print( e.getEmail() );
      out.write("</p>\r\n");
      out.write("        <p><strong>Password:</strong> ");
      out.print( e.getPassword() );
      out.write("</p>\r\n");
      out.write("        <a href=\"editEmployee.jsp\"><button>Edit</button></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
