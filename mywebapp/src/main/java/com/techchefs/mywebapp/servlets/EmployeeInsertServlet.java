package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;
import com.techchefs.mywebapp.dao.EmployeeDAO;
import com.techchefs.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/insert")
public class EmployeeInsertServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Fetch the Data from the Employee Form
		String id = req.getParameter("id");
		String accountnumber = req.getParameter("accountnumber");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		String designation = req.getParameter("designation");
		String Gender = req.getParameter("Gender");
		String dob = req.getParameter("dob");
		String salary = req.getParameter("salary");
		String departmentid = req.getParameter("departmentid");
		String phonenumber = req.getParameter("phonenumber");
		String managerid = req.getParameter("managerid");
		String joining = req.getParameter("joining");
		
		//Interact with DB and set the Employee Info
		
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		
		try {
			empInf.setId(Integer.parseInt(req.getParameter("id")));
			empInf.setName(req.getParameter("name"));
			empInf.setAge(Integer.parseInt(req.getParameter("age")));
			empInf.setGender(req.getParameter("Gender"));
			empInf.setSalary(Double.parseDouble(salary));
			empInf.setPhone(Long.parseLong(phonenumber));
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");  // pass any format you like      
			Date  dateJoining = format.parse(joining);
			empInf.setJoiningDate(dateJoining);
			
			Date empdob = format.parse(dob);
			empInf.setDob(empdob);
			
			empInf.setAccountNumber(Long.parseLong(accountnumber));
			empInf.setEmail(email);
			empInf.setDesignation(designation);
			empInf.setManagerId(Integer.parseInt(managerid));
			empInf.setDepartmentId(Integer.parseInt(departmentid));
		} catch (ParseException e) {
			e.printStackTrace();
		}     
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean empInserted = dao.createEmployee(empInf);
		
		//Send the Employee Creation Response to the Browser
		PrintWriter out = resp.getWriter();
		
		if(empInserted) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:Green\">Employee Inserted successfully</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		}else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">Employee Insertion Failed</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
	}
}
