<%@page 
import="com.techchefs.empspring.dao.*"
import="com.techchefs.empmanagement.dto.*"
%>
<%	
		EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("empbeansession");
%>
<HTML>
<BODY>
	<link rel='stylesheet'
		href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>
	<script
		src='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js'></script>
	<!-- <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script> -->
	<link rel='stylesheet' href='./profile.css'>
	<!------ Include the above in your HEAD tag ---------->
	<style>
img {
	border-radius: 50%;
	width: 100px;
	height: 100px;
}
</style>
	<div class='container emp-profile'>
		<div class='row'>
			<div class='col-md-4'></div>
			<div class='col-md-7'>
				<div class='wrap1'>
					<form action='http://localhost:8080/empmanagement/search'
						method='get'>
						<div class='col-md-12'>
							<input type="number" class="form-control" id="empid" placeholder= "Search employee Id" name="empid" />
								<input type='submit' name='btn-submit' />
						</div>
					</form>
				</div>
			</div>
			<div class='col-md-1'>
				<a href='./logout'>Logout</a>
			</div>
			<br />
			<br />
			<div class='col-md-4'>
				<a href='./profile'><img src='img_avatar.png' alt='Avatar'
					style='width: 100px;'></a>
				<!-- <div class='profile-img'>                                                                                                                         
																<div class='file btn btn-lg btn-primary'>                                                                                                          
																	Change Photo                                                                                                                                   
																	<input type='file' name='file'/>                                                                                                               
																</div>                                                                                                                                             
															</div> -->
			</div>
			<div class='col-md-6'>
				<div class='profile-head'>
					<h5>${userBean.id}</h5>
					<h6>{userBean.designation}</h6>
					<ul class='nav nav-tabs' id='myTab' role='tablist'>
						<li class='nav-item'><a class='nav-link active' id='home-tab'
							data-toggle='tab' href='#home' role='tab' aria-controls='home'
							aria-selected='true'>About</a></li>
					</ul>
				</div>
			</div>
			<div class='col-md-2'>
				<input type='submit' class='profile-edit-btn' name='btnAddMore'
					value='Edit' />&nbsp;&nbsp;
			</div>
		</div>
		<div class='row'>
			<div class='col-md-4'>
				<div class='profile-work'>
					<p>LINKS HERE</p>
					<a href=''>link1</a>
				</div>
			</div>
			<div class='col-md-8'>
				<div class='tab-content profile-tab' id='myTabContent'>
					<div class='tab-pane fade show active' id='home' role='tabpanel'
						aria-labelledby='home-tab'>
						<div class='row'>
							<div class='col-md-6'>
								<label>User Id</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.id}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Name</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.name}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Age</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.age}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Email</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.email}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Phone</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.phone}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Joining Date</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.joiningDate}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Designation</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.joiningDate}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Account Number</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.joiningDate}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Gender</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.joiningDate}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Salary</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.joiningDate}</p>
							</div>
						</div>
					</div>
					<div class='tab-pane fade' id='profile' role='tabpanel'
						aria-labelledby='profile-tab'>
						<div class='row'>
							<div class='col-md-6'>
								<label>Salary</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.joiningDate}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Date Of Birth</label>
							</div>
							<div class='col-md-6'>
								<p>{userBean.joiningDate}</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Total Projects</label>
							</div>
							<div class='col-md-6'>
								<p>230</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>English Level</label>
							</div>
							<div class='col-md-6'>
								<p>Expert</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-6'>
								<label>Availability</label>
							</div>
							<div class='col-md-6'>
								<p>6 months</p>
							</div>
						</div>
						<div class='row'>
							<div class='col-md-12'>
								<label>Your Bio</label><br />
								<p>Your detail description</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</BODY>
</HTML>