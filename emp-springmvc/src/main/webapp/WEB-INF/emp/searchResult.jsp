<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.tyss.emp.dao.*"%>
<%@page import="com.tyss.emp.dto.*"%>
<!DOCTYPE html>
<html lang='en'>

<head>

<meta charset='UTF-8'>
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<meta http-equiv='X-UA-Compatible' content='ie=edge'>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<title>search</title>
</head>

<body class='container-fluid'>
	<header>
		<div class='row' style='background: gray;'>
			<div class='col-sm-1' style='margin-top: 10px;'>
				<a href="/loginmvc"> <img class='rounded'
					alt='Bootstrap Image Preview'
					style='height: 60px; width: 80px; margin-bottom: 10px;'
					src='https://cdn.pixabay.com/photo/2017/02/23/13/05/profile-2092113_960_720.png' /></a>
			</div>

			<div class='col-sm-10' style='margin-top: 10px;'>
				<div class='form-group'>
					<label class='control-label' for='searchInput'></label>
					<div class='col-md-12'>
						<div class='search input-group' data-initialize='search'
							role='search' id='search'>
							<form action="./validate2/search">
							<input type='text' class='form-control' name="search"
								aria-label='Sizing example input'
								aria-describedby='inputGroup-sizing-default'> <span
								class='input-group-btn'>
								<button class='btn btn-default' type='button'>
									<span class='glyphicon glyphicon-search'></span> <span
										class='sr-only'>Search</span>
								</button>
							</span>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class='col-md-1' style='margin-top: 10px;'>

				<button type='button' style="width: 80px; height: 60px;"
					class='btn btn-success btn-inline' id='btn'><a href="./logout">logout</a>
					</button>
			</div>
		</div>
	</header>
	<section style='margin-top: 10px;'>
	
	<center>
			 <section style='margin-top: 10%'>
			 <h1><span style=\'color:green\'>EmployeeFound !!! ${idv}</span></h1>
			 <h3><br>

	<%-- 	<% 	for (EmployeeInfoBean InfoBean :%> ${bean} <% ) { %> --%>
<button type="button" class="btn btn-success">
				<a href='./display?eid=" + InfoBean.getId() + "'>
				 <br> ID&nbsp;&nbsp;&nbsp;"  ${bean.id} 
				 &nbsp;Name&nbsp;&nbsp;&nbsp;"  ${bean.name}
				</a></button>
			<%-- <%	}%> --%>
			</center>
		
	</section>


	<footer
		style='background: gray;position: absolute; right: 0; bottom: 0; left: 0; padding: 1rem; text-align: center;'>
		&copy;copyright at HomePage
	</footer>
</body>



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

</html>