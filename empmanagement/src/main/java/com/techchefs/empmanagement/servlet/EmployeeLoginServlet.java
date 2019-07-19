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

import com.techchefs.empmanagement.dao.EmployeeDAO;
import com.techchefs.empmanagement.dao.EmployeeDAOFactory;
import com.techchefs.empmanagement.dto.EmployeeInfoBean;

@WebServlet("/login")
public class EmployeeLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Valid Credentials Create a session
		boolean validSession;
		HttpSession session = req.getSession(true);
		if(session == null) {
			validSession = false;
		}else {
			validSession = true;
		}
		// Fetch the Data from the Employee Login Form
		String idValue = req.getParameter("empid");
		String passwordValue = req.getParameter("password");
		boolean loginSuccess = false;

		// Interact with DB and fetch the login info

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
		
		// Send the Response to the Browser
		PrintWriter out = resp.getWriter();

		if (passwordValue != null && bean != null && passwordValue.equals(bean.getPassword())) {
			loginSuccess = true;
		}

		if (!loginSuccess) {
			/*out.print("<!DOCTYPE html>");
			out.print("<html lang=\"en\">");
			out.print("<head>");
			out.print("<title>Employee Management Portal</title>");
			out.print("<meta charset=\"utf-8\">");
			out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
			out.print(
					"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">");
			out.print("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>");
			out.print(
					"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>");
			out.print("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>");
			out.print("<link rel=\"stylesheet\" href=\"./form.css\" >");
			out.print("</head>");
			out.print("<style>");
			out.print("</style>");
			out.print("<body>");
			out.print("<br /><br />");
			out.print("<div class=\"container boxshadow container-resize\">");
			out.print("<h2>Employee Login</h2>");
			out.print("<form action=\"./login\" method=\"post\">");
			out.print("<div class=\"form-group\">");
			out.print("<div style=\"color:Red\">Invalid Id or Password</div>");
			out.print("<label for=\"email\">Employee Id:</label>");
			out.print(
					"<input type=\"text\" class=\"form-control\" id=\"empid\" placeholder=\"Enter Employee id\" name=\"empid\">");
			out.print("<label for=\"password\">Password:</label>");
			out.print(
					"<input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter Password\" name=\"password\">");
			out.print("</div>");
			out.print("<button type=\"submit\" name=\"sbmt\"  class=\"btn btn-primary\" >Login</button>");
			out.print("<br /><br />");
			out.print("<a class=\"txt2\" href=\"emp_info.html\">");
			out.print("Create Account");
			out.print("</a>");
			out.print("<br />");
			out.print("<a class=\"txt2\" href=\"forgotpassword.html\">");
			out.print("Forgot Password?");
			out.print("</a>");
			out.print("</form>");
			out.print("</div>");
			out.print("</body>");
			out.print("</html>");*/
			RequestDispatcher dispatcher = null;
			resp.setContentType("text/html");
			
			PrintWriter pout = resp.getWriter();
			out.println("1111111111");
			
			out.print("<BR>");
			dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
			out.print("<BR>");

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
			out.println("													<a href='./logout'>Logout</a>                                                                                                                  ");
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
			out.println("															<h5>                                                                                                                                       ");
			out.println("																"+bean.getName()+"                                                                                                                      ");
			out.println("															</h5>                                                                                                                                      ");
			out.println("															<h6>                                                                                                                                       ");
			out.println("															   "+bean.getDesignation()+"                                                                                                                      ");
			out.println("															</h6>                                                                                                                                      ");
			out.println("													<ul class='nav nav-tabs' id='myTab' role='tablist'>                                                                                                ");
			out.println("														<li class='nav-item'>                                                                                                                          ");
			out.println("															<a class='nav-link active' id='home-tab' data-toggle='tab' href='#home' role='tab' aria-controls='home' aria-selected='true'>About</a>     ");
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
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>User Id</label>                                                                                                         ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>"+bean.getId()+"</p>                                                                                                                     ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Name</label>                                                                                                            ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>"+bean.getName()+"</p>                                                                                                       ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																		<div class='col-md-6'>                                                                                                         ");
			out.println("																			<label>Age</label>                                                                                                         ");
			out.println("																		</div>                                                                                                                         ");
			out.println("																		<div class='col-md-6'>                                                                                                         ");
			out.println("																			<p>"+bean.getAge()+"</p>                                                                                                                  ");
			out.println("																		</div>                                                                                                                         ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Email</label>                                                                                                           ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>"+bean.getEmail()+"</p>                                                                                                        ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Phone</label>                                                                                                           ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>"+bean.getPhone()+"</p>                                                                                                              ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																		<div class='col-md-6'>                                                                                                         ");
			out.println("																			<label>Joining Date</label>                                                                                                ");
			out.println("																		</div>                                                                                                                         ");
			out.println("																		<div class='col-md-6'>                                                                                                         ");
			out.println("																			<p>"+bean.getJoiningDate()+"</p>                                                                                                          ");
			out.println("																		</div>                                                                                                                         ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																		<div class='col-md-6'>                                                                                                         ");
			out.println("																			<label>Designation</label>                                                                                                 ");
			out.println("																		</div>                                                                                                                         ");
			out.println("																		<div class='col-md-6'>                                                                                                         ");
			out.println("																			<p>"+bean.getDesignation()+"</p>                                                                                                  ");
			out.println("																		</div>                                                                                                                         ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																		<div class='col-md-6'>                                                                                                         ");
			out.println("																			<label>Account Number</label>                                                                                              ");
			out.println("																		</div>                                                                                                                         ");
			out.println("																		<div class='col-md-6'>                                                                                                         ");
			out.println("																			<p>"+bean.getAccountNumber()+"</p>                                                                                                           ");
			out.println("																		</div>                                                                                                                         ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Gender</label>                                                                                                          ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>"+bean.getGender()+"</p>                                                                                                                    ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Salary</label>                                                                                                          ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>"+bean.getSalary()+"</p>                                                                                                                    ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("													</div>                                                                                                                                             ");
			out.println("													<div class='tab-pane fade' id='profile' role='tabpanel' aria-labelledby='profile-tab'>                                                             ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Salary</label>                                                                                                      ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>"+bean.getSalary()+"</p>                                                                                                                  ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Date Of Birth</label>                                                                                                     ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>"+bean.getDob()+"/hr</p>                                                                                                                  ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Total Projects</label>                                                                                                  ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>230</p>                                                                                                                     ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>English Level</label>                                                                                                   ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>Expert</p>                                                                                                                  ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("																<div class='row'>                                                                                                                      ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<label>Availability</label>                                                                                                    ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																	<div class='col-md-6'>                                                                                                             ");
			out.println("																		<p>6 months</p>                                                                                                                ");
			out.println("																	</div>                                                                                                                             ");
			out.println("																</div>                                                                                                                                 ");
			out.println("														<div class='row'>                                                                                                                              ");
			out.println("															<div class='col-md-12'>                                                                                                                    ");
			out.println("																<label>Your Bio</label><br/>                                                                                                           ");
			out.println("																<p>Your detail description</p>                                                                                                         ");
			out.println("															</div>                                                                                                                                     ");
			out.println("														</div>                                                                                                                                         ");
			out.println("													</div>                                                                                                                                             ");
			out.println("												</div>                                                                                                                                                 ");
			out.println("											</div>                                                                                                                                                     ");
			out.println("										</div>                                                                                                                                                         ");
			//out.println("									</form>                                                                                                                                                            ");
			out.println("								</div>                                                                                                                                                                 ");
			out.print("</BODY>");
			out.print("</HTML>");
		}

	}
}
