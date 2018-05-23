<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<jsp:useBean id="userBean" class="com.catp.beans.Employee" scope="request" />
<jsp:setProperty name="userBean" property="*"/>
<% if (request.getParameter("register") != null) {
%>
<jsp:forward page="success.jsp">
<jsp:param value="Registration Successful" name="message" /></jsp:forward>
<% }%> 

<body>
<h2 style="font-size: 25px;">Enter Details</h2>
<form method="post">
<table>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="fName" /></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="lName" /></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password" /></td>
	</tr>
	<tr>
		<td>User Name</td>
		<td><input type="text" name="uName" /></td>
	</tr>
	
	<tr><td>Gender</td>
	<td><input type="radio" name="gender" value="Male">Male <br />
	<input type="radio" name="gender"value="female">Female</td>
	</tr>
	<tr><td>Hobbies</td>
		<td><input type="checkbox" name="hobbies" value="dance">Dance
		<input type="checkbox" name="hobbies" value="sports">Sports <br />
		<input type="checkbox" name="hobbies" value="music">Music
		<input type="checkbox" name="hobbies" value="painting">Painting</td>
	</tr>
	<tr>
		<td>Designation</td><td><select name="designation">
			<option selected="selected">--selected--</option>
			<option value="1">Manager</option>
			<option value="2">Trainee</option>
			<option value="3">Developer</option>
		</select>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Register" name="register" /></td>
	</tr></table></form>
</body>
</html>