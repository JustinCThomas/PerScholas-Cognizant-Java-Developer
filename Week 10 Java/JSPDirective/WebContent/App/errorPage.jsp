<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page isErrorPage="true" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ERROR</title>
</head>
<body>
	
    <h1><%=exception.getMessage() %></h1><br/>  
	<h1>WARNING: YOU ARE MISSING YOUR NAME</h1>
	<h1>PLEASE ENTER YOUR NAME ON THE PREVIOUS PAGE</h1>
	<h1>THANK YOU</h1>
</body>
</html>