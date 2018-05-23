<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success!</title>
</head>
<%@ page import="com.catp.beans.User" %>
<% User user = (User) request.getAttribute("user"); %>
<body>
<h1>Success!</h1>
<h3>Hello, <%= user.getUserName() %>!</h3>
<h3>Your password is <%= user.getPassword() %> </h3>
</body>
</html>