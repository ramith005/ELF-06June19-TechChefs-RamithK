package com.techchefs.empmanagement.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techchefs.empmanagement.dao.EmployeeDAO;
import com.techchefs.empmanagement.dao.EmployeeDAOFactory;
import com.techchefs.empmanagement.dto.EmployeeInfoBean;

@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Fetch the Employee Id from the Login Form
		String idValue = req.getParameter("empid");
		
		// Interact with DB and fetch the Employee info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		List<EmployeeInfoBean> beans = dao.getEmployeeListById(idValue);
		
		// Send the Response to the Browser
		PrintWriter out = resp.getWriter();
		
		//Valid Credentials Create a session
		boolean validSession;
		HttpSession session = req.getSession(false);
		
		if(session == null) {
			RequestDispatcher dispatcher = null;
			resp.setContentType("text/html");
			
			PrintWriter pout = resp.getWriter();
			dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.println("						<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>                                                                           ");
			out.println("						<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js'></script>                                                                                    ");
			out.println("						<!-- <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script> -->                                                                                   ");
			out.println("						<link rel='stylesheet' href='./profile.css' >                                                                                                                                  ");
			out.println("						<!------ Include the above in your HEAD tag ---------->                                                                                                                        ");
			out.println("						<style>                                                                                                                                                                        ");
			out.println("								img {                                                                                                                                                                  ");
			out.println("								  border-radius: 50%;                                                                                                                                                  ");
			out.println("								  width: 100px;                                                                                                                                                        ");
			out.println("								  height: 100px;                                                                                                                                                       ");
			out.println("								}                                                                                                                                                                      ");
			out.println("						</style>                                                                                                                                                                       ");
			out.println("						<div class='container emp-profile'>                                                                                                                                            ");
			//out.println("									<form method='post'>                                                                                                                                               ");
			out.println("										<div class='row'>                                                                                                                                              ");
			out.println("											<div class='col-md-4'>                                                                                                                                     ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("											<div class='col-md-7'>                                                                                                                                     ");
			out.println("												<div class='wrap1'>                                                                                                                                     ");
			out.println("<form action='http://localhost:8080/empmanagement/search' method='get'>");
			out.println("<div class='col-md-12'><input type=\"number\" class=\"form-control\" id=\"empid\" placeholder=\"Search Enter employee Id\" name=\"empid\" /></s><input type='submit' name='btn-submit' /></div>");
			out.println("</form>");
			//out.println("														Search Box here                                                                                                                                ");
			out.println("												</div>                                                                                                                                                 ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("											<div class='col-md-1'>                                                                                                                                     ");
			out.println("													<a href='./login.html'>Logout</a>                                                                                                                  ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("											<br/><br/>                                                                                                                                                 ");
			out.println("											<div class='col-md-4'>                                                                                                                                     ");
			out.println("													<img src='img_avatar.png' alt='Avatar' style='width:100px;'>                                                                                       ");
			out.println("												<!-- <div class='profile-img'>                                                                                                                         ");
			out.println("													<div class='file btn btn-lg btn-primary'>                                                                                                          ");
			out.println("														Change Photo                                                                                                                                   ");
			out.println("														<input type='file' name='file'/>                                                                                                               ");
			out.println("													</div>                                                                                                                                             ");
			out.println("												</div> -->                                                                                                                                             ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("											<div class='col-md-6'>                                                                                                                                     ");
			out.println("												<div class='profile-head'>                                                                                                                             ");
			out.println("													<ul class='nav nav-tabs' id='myTab' role='tablist'>                                                                                                ");
			out.println("														<li class='nav-item'>                                                                                                                          ");
			out.println("															<a class='nav-link active' id='home-tab' data-toggle='tab' href='#home' role='tab' aria-controls='home' aria-selected='true'>Employee Search List </a>     ");
			out.println("														</li>                                                                                                                                          ");
			out.println("													</ul>                                                                                                                                              ");
			out.println("												</div>                                                                                                                                                 ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("											<div class='col-md-2'>                                                                                                                                     ");
			out.println("												<input type='submit' class='profile-edit-btn' name='btnAddMore' value='Edit'/>&nbsp;&nbsp;                                                             ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("										</div>                                                                                                                                                         ");
			out.println("										<div class='row'>                                                                                                                                              ");
			out.println("											<div class='col-md-4'>                                                                                                                                     ");
			out.println("												<div class='profile-work'>                                                                                                                             ");
			out.println("													<p>LINKS HERE</p>                                                                                                                                  ");
			out.println("													<a href=''>link1</a>                                                                                                                               ");
			out.println("												</div>                                                                                                                                                 ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("											<div class='col-md-8'>                                                                                                                                     ");
			out.println("												<div class='tab-content profile-tab' id='myTabContent'>                                                                                                ");
			out.println("													<div class='tab-pane fade show active' id='home' role='tabpanel' aria-labelledby='home-tab'>                                                       ");
			for(EmployeeInfoBean bean : beans) {
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p><a href='./display?eid="+bean.getId()+"'> User Id -"+bean.getId()+",Name -"+bean.getName()+" </a></p>                                      		   ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			}
			out.println("													</div>                                                                                                                                             ");
			out.println("												</div>                                                                                                                                                 ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("										</div>                                                                                                                                                         ");
			//out.println("									</form>                                                                                                                                                            ");
			out.println("								</div>                                                                                                                                                                 ");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		
		//dao.get
		//EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
		
		
		
		//out.print("Employyee Id is "+EmpId);
		
		
	}
}
