package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	public MyFirstServlet() {
		System.out.println("Inside the servlet constructor !!!!! ");
	}
	

	@Override
	protected  void  doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String currentDateTime = new Date().toString();
		
		//Get Query String Info
		String fnameValue = req.getParameter("fname");
		String lnameValue = req.getParameter("lname");
		
		ServletContext ctx = getServletContext();
		String MovieName = ctx.getInitParameter("movie");
		
		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		
		String htmlResponse 
		= "<!DOCTYPE html>"+
		"<html>"+
		"<head>"+
		"<meta charset=\"ISO-8859-1\">"+
		"<title>MY First HTML</title>"+
		"</head>"+
		"<body>"+
		"	<h1>"+
		"	Current date and Time is : <br />"+
		"	<span style=\"color:red\">"+currentDateTime+"</span>"+
		"<br /><br /> First Name : "+fnameValue+
		"<br /><br /> Last Name is : "+lnameValue+
		"<br /><br /> Movie Name : "+MovieName+
		"<br /><br /> Actor Name is : "+actorName+
		"	</h1>"+
		"</body>"+
		"</html>";
		
		//Send the Above HTML Response to the Browser
		resp.setContentType("text/html");
		//resp.setContentType("video/mp4");
		//resp.setHeader("Refresh", "1");
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);
		
	}//End of doGet ()
	
	
	
} // End Of class