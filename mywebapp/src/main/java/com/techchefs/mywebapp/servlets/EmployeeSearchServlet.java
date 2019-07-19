package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;
import com.techchefs.mywebapp.dao.EmployeeDAO;
import com.techchefs.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/search")
//@WebServlet("/search/employeeSearch")
public class EmployeeSearchServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idValue = req.getParameter("id");
		
		//Interact with DB and get the Employee Info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
		
		//Send the Response to the Browser
		PrintWriter out = resp.getWriter();
		
		ServletContext ctx = getServletContext();
		String MovieName = ctx.getInitParameter("movie");
		
		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		
		if(bean==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">Employee Not Found</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:Green\">Employee Found</span></H1>");
			out.print("******** Employee info *****");
			out.print("<br>");
			out.print("ID : "+bean.getId());
			out.print("<br>");
			out.print("AGE :"+bean.getAge());
			out.print("<br>");
			out.print("GENDER :"+bean.getGender());
			out.print("<br>");
			out.print("SALARY :"+bean.getSalary());
			out.print("<br>");
			out.print("PHONE :"+bean.getPhone());
			out.print("<br>");
			out.print("EMAIL 	:"+bean.getEmail());
			out.print("<br>");
			out.print("DESIGNATION :"+bean.getDesignation());
			out.print("<br>");
			out.print("DOB  :"+bean.getDob());
			out.print("<br>");
			out.print("DEPT_ID:"+bean.getDepartmentId());
			out.print("<br>");
			out.print("MNGR_ID :"+bean.getManagerId());
			out.print("<br>");
			out.print("Movie :"+MovieName);
			out.print("<br>");
			out.print("Actor :"+actorName);
			out.print("<br>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		
		//Get the object from the Forward Servlet
		//EmployeeInfoBean empInfo = (EmployeeInfoBean) req.getAttribute("info");
		EmployeeInfoBean empInfo = (EmployeeInfoBean) ctx.getAttribute("info");
		
		if(empInfo==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">Employee Info Bean Object Not Found</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:Green\">Employee Info Bean Object Found</span></H1>");
			out.print("******** Employee info *****");
			out.print("<br>");
			out.print("ID : "+empInfo.getId());
			out.print("<br>");
			out.print("Name :"+empInfo.getName());
			out.print("<br>");
			out.print("PHONE :"+empInfo.getPhone());
			out.print("<br>");
			out.print("EMAIL 	:"+empInfo.getEmail());
			out.print("</BODY>");
			out.print("</HTML>");
		}
		
	} //End of doGet
}// End of Class
