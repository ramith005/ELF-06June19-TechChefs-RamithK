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
@WebServlet("/createcookie")
public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Create a Cookie
		Cookie myNameCookie = new Cookie("myName","Praaveeen");
		Cookie myLocCookie = new Cookie("location","Bengaluru");
		
		myLocCookie.setMaxAge(7*24*60*60);//Time in seconds
		
		//Send cookie to browser
		response.addCookie(myNameCookie);
		response.addCookie(myLocCookie);
		
		PrintWriter out = response.getWriter();
		out.print("Create the cookie ...");
	}

} //End of Class

//ReadCookieServlet
