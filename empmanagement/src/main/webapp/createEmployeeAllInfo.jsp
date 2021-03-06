                                  
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Information</title>
<!-- <link   href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"> -->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="./createall" method="post">
	<legend class="h3" style="text-align: center;">Employee
		Information</legend>
	<br>
	<div class="container">
		<button type="button" class="btn btn-primary" data-toggle="collapse"
			data-target="#demo">Employee Information</button>
		<div id="demo" class="collapse">
			<%if(request.getParameter("msg")!=null) {%>
			<div style="color: green; text-align: center;"><%=request.getParameter("msg") %></div>
			<%} %>
			<%if(request.getParameter("errormsg")!=null) {%>
			<div style="color: red; text-align: center;"><%=request.getParameter("errormsg") %></div>
			<%} %>
				<div class="container-fluid">

					<div class="row">
						<div class="col-md-4 col-md-offset-2">
							<label for="id">ID</label> <input type="text"
								class="form-control" name="id" id="id" placeholder="ID">
						</div>
						<div class="col-md-4">
							<label for="accountnumber">Account Number</label> <input
								type="number" class="form-control" id="accountnumber"
								name="accountnumber" placeholder="Account Number">
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-4 col-md-offset-2">
							<label for="name">Name</label> <input type="text"
								class="form-control" id="name" name="name" placeholder="Name">
						</div>
						<div class="col-md-4">
							<label for="email">Email ID</label> <input type="text"
								class="form-control" id="email" name="email"
								placeholder="Email ID">
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-4 col-md-offset-2">
							<label for="age">Age</label> <input type="number"
								class="form-control" name="age" id="age" placeholder="Age">
						</div>
						<div class="col-md-4">
							<label for="designation">Designation</label> <input type="text"
								class="form-control" id="designation" name="designation"
								placeholder="Designation">
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-4 col-md-offset-2">
							<label for="Gender">Gender</label> <select name="Gender"
								id="Gender" class="form-control">
								<option selected>--select one--</option>
								<option value="male">male</option>
								<option value="female">female</option>
								<option value="other">other</option>
							</select>
						</div>
						<div class="col-md-4">
							<label for="dob">Date of Birth</label> <input type="date"
								class="form-control" name="dob" id="dob"
								placeholder="dd-mm-yyyy">
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-4 col-md-offset-2">
							<label for="salary">Salary</label> <input type="number"
								class="form-control" name="salary" id="salary"
								placeholder="Salary">
						</div>
						<div class="col-md-4">
							<label for="departmentid">Department id</label> <input
								type="number" class="form-control" name="departmentid"
								id="departmentid" placeholder="department id">
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-4 col-md-offset-2">
							<div>
								<label for="phonenumber">Phone Number</label>
							</div>
							<div>
								<input type="number" class="form-control" name="phonenumber"
									id="phonenumber" placeholder="phone number">
							</div>
						</div>
						<div class="col-md-4">
							<div>
								<label for="managerid">manager ID</label>
							</div>
							<div>
								<input type="number" class="form-control" name="managerid"
									id="managerid" placeholder="manager id">
							</div>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-4 col-md-offset-2">
							<div>
								<label for="joining">Joining date</label>
							</div>
							<div>
								<input type="date" class="form-control" name="joining_date"
									id="joining" placeholder="Enter joining date">
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
	<br />
	<br />
	<div>
		<button type="button" class="btn btn-primary" data-toggle="collapse"
			data-target="#otherdemo">Employee OtherInformation</button>
	</div>
	<div id="otherdemo" class="collapse">
		<div class="container-fluid">


			<div class="row">
				<div class="col-sm-4">

					<div>
						<label for="id">ID</label>
					</div>
					<div>
						<input type="text" class="form-control" id="id"
							placeholder="Enter ID" disabled>
					</div>
				</div>
				<div class="col-sm-4">

					<div>
						<label for="ecn">Emergency Contact Number</label>
					</div>
					<div>
						<input type="number" class="form-control" name="" id="ecn"
							placeholder="Enter Emergency Contact Number">
					</div>
				</div>
				<div class="col-sm-4">

					<div>
						<label for="id">Mother Name</label>
					</div>
					<div>
						<input type="text" name="mothername" class="form-control" id="mothername"
							placeholder="Enter Mother Name">
					</div>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-sm-4">
					<label for="id">Pan Number</label>
					<div>
						<input type="text" name="pan" class="form-control" id="pan"
							placeholder="Enter Pan Number">
					</div>
				</div>
				<div class="col-sm-4">
					<div>
						<label for="ecna">Emergency Contact Name</label>
					</div>
					<div>
						<input type="text" name="ecna" class="form-control" id="ecna"
							placeholder="Enter Emergency Contact name">
					</div>
				</div>
				<div class="col-sm-4">
					<div>
						<label for="spouse">Spouse Name</label>
					</div>
					<div>
						<input type="text" name="spouse" class="form-control" id="spouse"
							placeholder="Enter spouse Name">
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
						<select id="maritalstatus" name="maritalstatus" class="form-control">

							<option value="Married">Married</option>
							<option value="unmarried">Unmarried</option>

						</select>
					</div>
				</div>
				<div class="col-sm-4">
					<div>
						<label for="id">Nationality</label>
					</div>
					<div>
						<input type="text" class="form-control" name="Nationality" id="Nationality"
							placeholder="Enter Nationality">
					</div>
				</div>
				<div class="col-sm-4">
					<div>
						<label for="id">Passport Number</label>
					</div>
					<div>
						<input type="text" class="form-control" name="passport" id="passport"
							placeholder="Enter Passport">
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
						<input type="text" class="form-control" name="bloodgroup" id="bloodgroup"
							placeholder="Enter Blood Group">
					</div>
				</div>
				<div class="col-sm-4">
					<div>
						<label for="Religion">ID</label>
					</div>
					<div>
						<select id="Religion" name="Religion" class="form-control">
							<option value="none">--select one--</option>
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
						<input type="text" name="adhar" class="form-control" id="adhar"
							placeholder="Enter Aadhar Number">
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
						<select id="physicallychallenged" name="physicallychallenged" class="form-control">
							<option value="none">---select one---</option>
							<option value="yes">Yes</option>
							<option value="no">No</option>

						</select>
					</div>
				</div>
				<div class="col-sm-4">
					<div>
						<label for="fathername">Father Name</label>
					</div>
					<div>
						<input type="text" name="fathername" class="form-control" id="fathername"
							placeholder="Enter Father Name">
					</div>
				</div>
				<div class="col-sm-4">
					<div>
						<label></label>
					</div>
					<div id="resetGroup" class="btn-group" role="group" aria-label="">
						<button type="reset" id="reset" name="reset"
							class="btn btn-default" aria-label="Reset">Reset</button>
						<button type="submit" id="submit" name="submit"
							class="btn btn-info" aria-label="submit">Submit</button>
					</div>
				</div>
			</div>

		</div>
	</div>
</form>
</body>
</html>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
