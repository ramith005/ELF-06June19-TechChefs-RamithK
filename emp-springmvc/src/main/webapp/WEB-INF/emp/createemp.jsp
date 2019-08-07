<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Empother</title>
</head>
<body style="background: white">

<form action="insdata" method="post">
	<div class="accordion" id="accordionExample">
		<div class="card">
			<div class="card-header" id="headingOne">
				<h2 class="mb-0">
					<button class="btn btn-link" type="button" data-toggle="collapse"
						data-target="#collapseOne" aria-expanded="true"
						aria-controls="collapseOne">Employee Information</button>
				</h2>
			</div>

			<div id="collapseOne" class="collapse show"
				aria-labelledby="headingOne" data-parent="#accordionExample">
				<div class="card-body">
					<legend class="h3" style="text-align: center;">Employee
						Information</legend>
					<br>

						<div class="container-fluid">

							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="id">ID</label> <input type="text" name="id"
										class="form-control" placeholder="ID">
								</div>
								<div class="col-md-4">
									<label for="accountnumber">Account Number</label> <input
										type="number" name="accountNumber" class="form-control"
										id="accountNumber" placeholder="Account Number">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="name">Name</label> <input type="text"
										class="form-control" name="name" placeholder="Name">
								</div>
								<div class="col-md-4">
									<label for="email">Email ID</label> <input type="text"
										class="form-control" name="email"
										placeholder="Email ID">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="age">Age</label> <input type="number" name="age"
										class="form-control" placeholder="Age">
								</div>
								<div class="col-md-4">
									<label for="designation">Designation</label> <input type="text"
										 class="form-control" name="designation"
										placeholder="Designation">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="Gender">Gender</label> <select id="Gender"
										name="gender" class="form-control">
										<option selected>--select one--</option>
										<option value="male">male</option>
										<option value="female">female</option>
										<option value="other">other</option>
									</select>
								</div>
								<div class="col-md-4">
									<label for="dob">Date of Birth</label> <input type="date"
										class="form-control" name="dob"
										placeholder="dd-mm-yyyy">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="salary">Salary</label> <input type="number"
										class="form-control" name="salary"
										placeholder="Salary">
								</div>
								<div class="col-md-4">
									<label for="departmentid">Department id</label> <input
										type="number" class="form-control"
										name="departmentId" placeholder="department id">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<div>
										<label for="phonenumber">Phone Number</label>
									</div>
									<div>
										<input type="number" class="form-control"
											name="phone" placeholder="phone number">
									</div>
								</div>
								<div class="col-md-4">
									<div>
										<label for="managerid">manager ID</label>
									</div>
									<div>
										<input type="number" name="managerId" class="form-control"
											placeholder="manager id">
									</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<div>
										<label for="password">Password</label>
									</div>
									<div>
										<input type="password" name="password" class="form-control" placeholder="Enter Password">
									</div>
								</div>
								<div class="col-md-4">
									<div>
										<label for="password">Confirm Password</label>
									</div>
									<div>
										<input type="text" class="form-control" name="confirmpassword"
											placeholder="confirm password">
									</div>
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="card">
				<div class="card-header" id="headingTwo">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseTwo"
							aria-expanded="false" aria-controls="collapseTwo">
							Employee Other Information</button>
					</h2>
				</div>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionExample">
					<div class="card-body">


						<legend class="h3" style="text-align: center;">Employee
							Other Information</legend>
						<br>

						<div class="container-fluid">


							<div class="row">
								<div class="col-sm-4">

									<div>
										<label for="id">ID</label>
									</div>
									<div>
										<input type="text" class="form-control" id="id"
											name="employeeOtherInfoBean.id" placeholder="Enter ID" disabled>
									</div>
								</div>
								<div class="col-sm-4">

									<div>
										<label for="ecn">Emergency Contact Number</label>
									</div>
									<div>
										<input type="number" class="form-control"
											name="employeeOtherInfoBean.emergencyContactNumber"
											placeholder="Enter Emergency Contact Number">
									</div>
								</div>
								<div class="col-sm-4">

									<div>
										<label for="id">Mother Name</label>
									</div>
									<div>
										<input type="text" class="form-control" 
											name="employeeOtherInfoBean.motherName"
											placeholder="Enter Mother Name">
									</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-sm-4">
									<label for="id">Pan Number</label>
									<div>
										<input type="text" class="form-control" id="pan"
											name="employeeOtherInfoBean.pan" placeholder="Enter Pan Number">
									</div>
								</div>
								<div class="col-sm-4">
									<div>
										<label for="ecna">Emergency Contact Name</label>
									</div>
									<div>
										<input type="text" class="form-control" id="ecna"
											name="employeeOtherInfoBean.emergencyContactPerson"
											placeholder="Enter Emergency Contact name">
									</div>
								</div>
								<div class="col-sm-4">
									<div>
										<label for="spouse">Spouse Name</label>
									</div>
									<div>
										<input type="text" class="form-control" id="spouse"
											name="employeeOtherInfoBean.spouseName" placeholder="Enter spouse Name">
									</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-sm-4">
									<div>
										<label for="marital">Marital Status</label>
									</div>
									<div>
										<select id="maritalstatus" name="employeeOtherInfoBean.isMarried"
											class="form-control">

											<option value="1">Married</option>
											<option value="0">Unmarried</option>

										</select>
									</div>
								</div>
								<div class="col-sm-4">
									<div>
										<label for="id">Nationality</label>
									</div>
									<div>
										<input type="text" name="employeeOtherInfoBean.nationality" class="form-control"
											id="Nationality" placeholder="Enter Nationality">
									</div>
								</div>
								<div class="col-sm-4">
									<div>
										<label for="id">Passport Number</label>
									</div>
									<div>
										<input type="text" name="employeeOtherInfoBean.passport" class="form-control"
											id="passport" placeholder="Enter Passport">
									</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-sm-4">
									<div>
										<label for="bloodgroup">Blood Group</label>
									</div>
									<div>
										<input type="text" name="employeeOtherInfoBean.bloodGroup" class="form-control"
											id="bloodgroup" placeholder="Enter Blood Group">
									</div>
								</div>
								<div class="col-sm-4">
									<div>
										<label for="Religion">ID</label>
									</div>
									<div>
										<select id="Religion" name="employeeOtherInfoBean.religion" class="form-control">
											<option value="null">--select one--</option>
											<option value="hindu">Hindu</option>
											<option value="muslim">Muslim</option>
											<option value="christian">Christian</option>

										</select>
									</div>
								</div>
								<div class="col-sm-4">
									<div>
										<label for="adhar">Aadhar Number</label>
									</div>
									<div>
										<input type="text" name="employeeOtherInfoBean.adhar" class="form-control"
											id="adhar" placeholder="Enter Aadhar Number">
									</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-sm-4">
									<div>
										<label for="physicallychallenged">Phyically challenged</label>
									</div>
									<div>
										<select id="physicallychallenged" name="employeeOtherInfoBean.ischallenged"
											class="form-control">
											<option value="null">---select one---</option>
											<option value="1">Yes</option>
											<option value="0">No</option>

										</select>
									</div>
								</div>
								<div class="col-sm-4">
									<div>
										<label for="fathername">Father Name</label>
									</div>
									<div>
										<input type="text" name="employeeOtherInfoBean.fatherName" class="form-control"
											id="fathername" placeholder="Enter Father Name">
									</div>
								</div>
								<!-- <div class="col-sm-4">
									<div>
										<label></label>
									</div>
									<div id="resetGroup" class="btn-group" role="group"
										aria-label="">
										<button type="reset" id="reset" name="reset"
											class="btn btn-default" aria-label="Reset">Reset</button>
										<button type="submit" id="submit" name="submit"
											class="btn btn-info" aria-label="submit">Register</button>
									</div>
								</div> -->
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="card">
				<div class="card-header" id="headingThree">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseThree"
							aria-expanded="false" aria-controls="collapseThree">
							Employee Address1 Information</button>
					</h2>
				</div>
				<div id="collapseThree" class="collapse"
					aria-labelledby="headingThree" data-parent="#accordionExample">
					<div class="card-body">


						<legend class="h3" style="text-align: center;">Employee
							Address1 Information</legend>
						<br>


						<div class="container-fluid">
							<div class="row">
								<div class="col-md-4">
									<label for="State">State</label> <input type="text"
										class="form-control" id="State" placeholder="Enter State">
								</div>
								<div class="col-md-4">
									<label for="city">City</label> <input type="text" 
										class="form-control" name="addressInfoBeans[0].city" placeholder="enter City">
								</div>
							</div>
							<br>
							<!-- <div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="Gender">Gender</label> <select name="Gender"
										class="form-control">
										<option selected>--select one--</option>
										<option value="male">male</option>
										<option value="female">female</option>
										<option value="other">other</option>
									</select>
								</div>
								<div class="col-md-4">
									<label for="State">State</label> <input type="text"
										class="form-control" id="State" placeholder="Enter State">
								</div>
							</div>
							<br> -->
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="addr1">Address1</label> <input type="text"
										class="form-control" id="addr1" placeholder="Enter Address 1">
								</div>
								<div class="col-md-4">
									<label for="country">Country</label> <input type="text"
										class="form-control" id="country" placeholder="Enter Country">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="addr2">Address 2</label> <input type="text"
										class="form-control" id="addr2" placeholder="Enter Address 2">
								</div>

								<div class="col-md-4">
									<label for="pincode">Pincode</label> <input type="number"
										class="form-control" id="pincode" placeholder="Enter Pincode">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<div>
										<label for="landmark">Landmark</label>
									</div>
									<div>
										<input type="text" class="form-control" id="landmark"
											placeholder="Enter landmark">
									</div>
								</div>
								<!-- <div class="col-md-4">
									<div>
										<div>
											<label for="btn"> </label>
										</div>
										<div id="resetGroup" class="btn-group" role="group"
											aria-label="">
											<button type="reset" id="reset" name="reset"
												class="btn btn-default" aria-label="Reset">Reset</button>
											<button type="submit" id="submit" name="submit"
												class="btn btn-info" aria-label="submit">Submit</button>
										</div>
									</div>
								</div> -->
							</div>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header" id="headingFour">
						<h2 class="mb-0">
							<button class="btn btn-link collapsed" type="button"
								data-toggle="collapse" data-target="#collapseFour"
								aria-expanded="false" aria-controls="collapseFour">
								Employee Address2 Information</button>
						</h2>
					</div>
					<div id="collapseFour" class="collapse"
						aria-labelledby="headingFour" data-parent="#accordionExample">
						<div class="card-body">


							<legend class="h3" style="text-align: center;">Employee
								Address2 Information</legend>
							<br>


							<div class="container-fluid">
								<div class="row">
									<div class="col-md-4">
									<label for="State">State</label> <input type="text"
										class="form-control" id="State" placeholder="Enter State">
									</div>
									<div class="col-md-4">
										<label for="city">City</label> <input type="text"
											class="form-control" id="city" placeholder="enter City">
									</div>
								</div>
								<br>
								<!-- <div class="row">
									<div class="col-md-4 col-md-offset-2">
										<label for="Gender">Gender</label> <select id="Gender"
											class="form-control">
											<option selected>--select one--</option>
											<option value="male">male</option>
											<option value="female">female</option>
											<option value="other">other</option>
										</select>
									</div>
									<div class="col-md-4">
										<label for="State">State</label> <input type="text"
											class="form-control" id="State" placeholder="Enter State">
									</div>
								</div> -->
								<br>
								<div class="row">
									<div class="col-md-4 col-md-offset-2">
										<label for="addr1">Address1</label> <input type="text"
											class="form-control" id="addr1" placeholder="Enter Address 1">
									</div>
									<div class="col-md-4">
										<label for="country">Country</label> <input type="text"
											class="form-control" id="country" placeholder="Enter Country">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4 col-md-offset-2">
										<label for="addr2">Address 2</label> <input type="text"
											class="form-control" id="addr2" placeholder="Enter Address 2">
									</div>

									<div class="col-md-4">
										<label for="pincode">Pincode</label> <input type="number"
											class="form-control" id="pincode" placeholder="Enter Pincode">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4 col-md-offset-2">
										<div>
											<label for="landmark">Landmark</label>
										</div>
										<div>
											<input type="text" class="form-control" id="landmark"
												placeholder="Enter landmark">
										</div>
									</div>
									<div class="col-md-4">
										<div>
											<div>
												<label for="btn"> </label>
											</div>
											<div id="resetGroup" class="btn-group" role="group"
												aria-label="">
												<button type="reset" id="reset" name="reset"
													class="btn btn-default" aria-label="Reset">Reset</button>
												<button type="submit" id="submit" name="submit"
													class="btn btn-info" aria-label="submit">Submit</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="card">
						<div class="card-header" id="headingFive">
							<h2 class="mb-0">
								<button class="btn btn-link collapsed" type="button"
									data-toggle="collapse" data-target="#collapseFive"
									aria-expanded="false" aria-controls="collapseFive">
									Employee Educational Information1</button>
							</h2>
						</div>
						<div id="collapseFive" class="collapse"
							aria-labelledby="headingFour" data-parent="#accordionExample">
							<div class="card-body">


								<legend class="h3" style="text-align: center;">Employee
									Educational Information1</legend>
								<br>
								<div class="container-fluid">
								<div class="row">
									<div class="col-md-4 col-md-offset-2">
										<label for="id">Educational Type</label> <input type="text"
											class="form-control" id="education_type1" placeholder="Enter Educational Type">
									</div>
									<div class="col-md-4">
										<label for="city">Degree Type</label> <input type="text"
											class="form-control" id="degree_type1" placeholder="Enter Degree Type">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">Branch</label> <input type="text"
											class="form-control" id="branch1" placeholder="Enter Branch">
									</div>
									<div class="col-md-4">
										<label for="State">College Name</label> <input type="text"
											class="form-control" id="college1" placeholder="Enter College Name">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">University</label> <input type="text"
											class="form-control" id="university1" placeholder="Enter University">
									</div>
									<div class="col-md-4">
										<label for="State">Passout Year</label> <input type="text"
											class="form-control" id="passoutyear1" placeholder="Enter Passout Year">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">Percentage</label> <input type="text"
											class="form-control" id="percentage1" placeholder="Enter Percentage">
									</div>
									<div class="col-md-4">
										<label for="State">Location</label> <input type="text"
											class="form-control" id="location1" placeholder="Enter Location">
									</div>
								</div>
								<br>
							</div>
							</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header" id="headingSix">
							<h2 class="mb-0">
								<button class="btn btn-link collapsed" type="button"
									data-toggle="collapse" data-target="#collapseSix"
									aria-expanded="false" aria-controls="collapseSix">
									Employee Educational Information2</button>
							</h2>
						</div>
						<div id="collapseSix" class="collapse"
							aria-labelledby="headingFour" data-parent="#accordionExample">
							<div class="card-body">


								<legend class="h3" style="text-align: center;">Employee
									Educational Information2</legend>
								<br>
								
								<div class="container-fluid">
								<div class="row">
									<div class="col-md-4 col-md-offset-2">
										<label for="id">Educational Type</label> <input type="text"
											class="form-control" id="education_type1" placeholder="Enter Educational Type">
									</div>
									<div class="col-md-4">
										<label for="city">Degree Type</label> <input type="text"
											class="form-control" id="degree_type1" placeholder="Enter Degree Type">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">Branch</label> <input type="text"
											class="form-control" id="branch1" placeholder="Enter Branch">
									</div>
									<div class="col-md-4">
										<label for="State">College Name</label> <input type="text"
											class="form-control" id="college1" placeholder="Enter College Name">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">University</label> <input type="text"
											class="form-control" id="university1" placeholder="Enter University">
									</div>
									<div class="col-md-4">
										<label for="State">Passout Year</label> <input type="text"
											class="form-control" id="passoutyear1" placeholder="Enter Passout Year">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">Percentage</label> <input type="text"
											class="form-control" id="percentage1" placeholder="Enter Percentage">
									</div>
									<div class="col-md-4">
										<label for="State">Location</label> <input type="text"
											class="form-control" id="location1" placeholder="Enter Location">
									</div>
								</div>
								<br>
							</div>
							</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header" id="headingSeven">
							<h2 class="mb-0">
								<button class="btn btn-link collapsed" type="button"
									data-toggle="collapse" data-target="#collapseSeven"
									aria-expanded="false" aria-controls="collapseSeven">
									Employee Experience Information1</button>
							</h2>
						</div>
						<div id="collapseSeven" class="collapse"
							aria-labelledby="headingFour" data-parent="#accordionExample">
							<div class="card-body">


								<legend class="h3" style="text-align: center;">Employee
									Experience Information1</legend>
								<br>
								<div class="container-fluid">
								<div class="row">
									<div class="col-md-4 col-md-offset-2">
										<label for="id">Company Name</label> <input type="text"
											class="form-control" id="company_name" placeholder="Enter Company name">
									</div>
									<div class="col-md-4">
										<label for="city">Designation</label> <input type="text"
											class="form-control" id="city" placeholder="Enter Designation">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">Joining Date</label> <input type="date"
											class="form-control" id="Joining date" placeholder="Enter Joining Date">
									</div>
									<div class="col-md-4">
										<label for="State">Releiving Date</label> <input type="date"
											class="form-control" id="releaving date" placeholder="Enter Releiving Date">
									</div>
								</div>
								<br>
							</div>
							</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header" id="headingEight">
							<h2 class="mb-0">
								<button class="btn btn-link collapsed" type="button"
									data-toggle="collapse" data-target="#collapseEight"
									aria-expanded="false" aria-controls="collapseEight">
									Employee Experience Information2</button>
							</h2>
						</div>
						<div id="collapseEight" class="collapse"
							aria-labelledby="headingFour" data-parent="#accordionExample">
							<div class="card-body">


								<legend class="h3" style="text-align: center;">Employee
									Experience Information2</legend>
								<br>
								<div class="container-fluid">
								<div class="row">
									<div class="col-md-4 col-md-offset-2">
										<label for="id">Company Name</label> <input type="text"
											class="form-control" id="company_name" placeholder="Enter Company name">
									</div>
									<div class="col-md-4">
										<label for="city">Designation</label> <input type="text"
											class="form-control" id="city" placeholder="Enter Designation">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">Joining Date</label> <input type="date"
											class="form-control" id="Joining date" placeholder="Enter Joining Date">
									</div>
									<div class="col-md-4">
										<label for="State">Releiving Date</label> <input type="date"
											class="form-control" id="releaving date" placeholder="Enter Releiving Date">
									</div>
								</div>
								<br>
							</div>
							</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header" id="headingNine">
							<h2 class="mb-0">
								<button class="btn btn-link collapsed" type="button"
									data-toggle="collapse" data-target="#collapseNine"
									aria-expanded="false" aria-controls="collapseNine">
									Employee Experience Information3</button>
							</h2>
						</div>
						<div id="collapseNine" class="collapse"
							aria-labelledby="headingFour" data-parent="#accordionExample">
							<div class="card-body">


								<legend class="h3" style="text-align: center;">Employee
									Experience Information3</legend>
								<br>
								<div class="container-fluid">
								<div class="row">
									<div class="col-md-4 col-md-offset-2">
										<label for="id">Company Name</label> <input type="text"
											class="form-control" id="company_name" placeholder="Enter Company name">
									</div>
									<div class="col-md-4">
										<label for="city">Designation</label> <input type="text"
											class="form-control" id="city" placeholder="Enter Designation">
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-md-4">
										<label for="State">Joining Date</label> <input type="date"
											class="form-control" id="Joining date" placeholder="Enter Joining Date">
									</div>
									<div class="col-md-4">
										<label for="State">Releiving Date</label> <input type="date"
											class="form-control" id="releaving date" placeholder="Enter Releiving Date">
									</div>
								</div>
								<br>
							</div>
							</div>
						</div>
					</div>
		</form>
</body>
</html>