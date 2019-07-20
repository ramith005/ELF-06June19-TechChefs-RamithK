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

@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		//Validate the Session
		HttpSession session = req.getSession(false);
		if(session == null) {
			RequestDispatcher dispatcher = null;
			resp.setContentType("text/html");
			dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		} else {
			//Valid Session Generate the proper Response
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login");
			dispatcher.forward(req, resp);
		}
	}
}
