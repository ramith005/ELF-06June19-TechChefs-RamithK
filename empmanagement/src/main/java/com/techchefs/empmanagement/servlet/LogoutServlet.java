package com.techchefs.empmanagement.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Valid Credentials Create a session
		boolean validSession;
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}
			RequestDispatcher dispatcher = null;
			resp.setContentType("text/html");
			
			PrintWriter pout = resp.getWriter();
			pout.println("<h1><span style='color:green'>Thanks For Visiting Our Site</span></h1>");
			dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		
	}
}
