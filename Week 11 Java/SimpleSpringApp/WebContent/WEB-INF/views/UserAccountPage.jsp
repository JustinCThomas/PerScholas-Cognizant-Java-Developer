<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Account Page</title>
</head>
<body>
<div class="user_table">
	<table>
		<tr>
			<td>User Name</td>
			<td>${userkey.username}</td>
		</tr>
		<tr>
			<td>Password</td>
			<td>${userkey.password}</td>
		</tr>
		<tr>	
			<td>Email</td>
			<td>${userkey.email}</td>
		</tr>
	</table>
	<a href="modify">Modify Your Info</a>
</div>
</body>
</html>