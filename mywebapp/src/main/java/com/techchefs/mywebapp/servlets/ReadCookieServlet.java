package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/readcookie")
public class ReadCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get the cookies from request
		Cookie[] receivedCookies = request.getCookies();
		
		PrintWriter out = response.getWriter();
		
		if(receivedCookies == null) {
			out.print("cookie not present");
		} else {
			out.print("cookie sre present");
			
			for(Cookie rcvdcookie : receivedCookies) {
				out.print("cookie Name "+rcvdcookie.getName());
				out.print("cookie Value "+rcvdcookie.getValue());
			}
		}
		
	}// end doGet

} //End of Class

