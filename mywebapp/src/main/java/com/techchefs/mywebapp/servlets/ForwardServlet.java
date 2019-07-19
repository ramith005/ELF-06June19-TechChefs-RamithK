package com.techchefs.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(1234);
		empInfo.setName("Ramith");
		empInfo.setEmail("ramith@gmail.com");
		empInfo.setPhone(99861234);
		
		//Pass the Above Object to EmployeeSearchServlet
		//request.setAttribute("info", empInfo);
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("info", empInfo);
		
		//String url = "http://www.gmail.com";
		String url = "/search?id=1";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	

} //End of Class

//CreateCookieServlet
