package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String currentDateTime = new Date().toString();
		
		//Get Query String Info
		String fnameValue = req.getParameter("fname");
		String lnameValue = req.getParameter("lname");
		
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
		"	</h1>"+
		"</body>"+
		"</html>";
		
		//Send the Above HTML Response to the Browser
		//resp.setContentType("html/text");
		resp.setContentType("video/mp4");
		//resp.setHeader("Refresh", "1");
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);
		
	}//End of doGet ()
	
} // End Of class
