<%@page import="com.tyss.emp.dto.UserBean"%>
<%
UserBean bean=(UserBean)request.getAttribute("userBean");
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
<label>UserName:</label><%=bean.getUserId()%> <br>
<label>Password :</label><%=bean.getPassword() %> <br>
</h3>

</body>
</html>