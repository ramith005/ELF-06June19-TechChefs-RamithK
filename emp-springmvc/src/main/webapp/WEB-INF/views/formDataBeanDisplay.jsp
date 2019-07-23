<%@page import="com.techchefs.emp.dto.UserBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
UserBean userBean = (UserBean) request.getAttribute("userBean");
int userId 		= userBean.getUserId();
String password = userBean.getPassword();
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Data</title>
</head>
<body>
USER ID = <%=userId%><BR/>
pASSWORD = <%=password%>
</body>
</html>