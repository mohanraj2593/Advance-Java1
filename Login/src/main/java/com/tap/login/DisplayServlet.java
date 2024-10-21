
package com.tap.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/displayServlet")
public class DisplayServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		HttpSession session=req.getSession();
		int empid=(int) session.getAttribute("empid");
		String empname=(String) session.getAttribute("empname");
		String desig=(String) session.getAttribute("desig");
		int salary=(int) session.getAttribute("salary");
		String email=(String) session.getAttribute("email");
		String password=(String) session.getAttribute("pwd");
		pw.println("This is Display Servlet Page");
		pw.println(empid+"   "+empname+"   "+desig+"   "+salary+"   "+email+"   "+password);
		
		
//		pw.println("Welcome "+req.getParameter("empname"));
		
		
	}

}
