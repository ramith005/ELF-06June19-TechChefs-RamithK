package com.techchefs.empmanagement.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.empmanagement.dao.EmployeeDAO;
import com.techchefs.empmanagement.dao.EmployeeDAOFactory;
import com.techchefs.empmanagement.dto.EmployeeInfoBean;

@WebServlet("/create")
public class EmployeeCreateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Create the Employee Bean Object
		EmployeeInfoBean bean = new EmployeeInfoBean();
		
		//Fetch the Form values form the Create Employee Form and set it to the Bean
		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accountnumber")));
		bean.setName(req.getParameter("name"));
		bean.setEmail(req.getParameter("email"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setDesignation(req.getParameter("designation"));
		bean.setGender(req.getParameter("Gender"));
		//bean.setDob(req.getParameter("dob"));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setDeptId(Integer.parseInt(req.getParameter("departmentid")));
		bean.setMngrId(Integer.parseInt(req.getParameter("managerid")));
		
		//bean.setJoiningDate(req.getParameter("joining_date"));
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean result = dao.createEmployee(bean);
		
		if(result) {
			RequestDispatcher dispatcher = null;
			resp.setContentType("text/html");
			dispatcher = req.getRequestDispatcher("createEmployee.jsp?msg=Employee successfully registered");
			dispatcher.include(req, resp);
		} else {
			RequestDispatcher dispatcher = null;
			resp.setContentType("text/html");
			dispatcher = req.getRequestDispatcher("createEmployee.jsp?errormsg=Employee registration failed");
			dispatcher.include(req, resp);
		}
	}
}
