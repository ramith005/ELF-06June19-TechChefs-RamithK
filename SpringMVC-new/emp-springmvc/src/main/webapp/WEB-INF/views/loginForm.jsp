<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>myForm</title>
</head>
<body>
<h3>${msg}</h3>
<!-- <form action="./formSubmit" method="post"> -->
<form action="./formSubmit6" method="post">
<label>UserID :</label><input type="text" name="userId"> <br>
<label>Password :</label><input type="text" name="password">
<br>
<input type="submit" value="submit">
<input type="reset" value="clear">
</form>
</body>
</html>