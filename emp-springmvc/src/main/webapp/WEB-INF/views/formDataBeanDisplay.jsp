<%
int userId=(int) request.getAttribute("userId");
String password=(String) request.getAttribute("password");

%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<h3>
<label>UserName:</label><%=userId %> <br>
<label>Password :</label><%=password %>
</h3>

</body>
</html>