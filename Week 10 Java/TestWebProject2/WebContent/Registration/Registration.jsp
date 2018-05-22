<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="registrationStyles.css">
<title>Registration Page</title>
</head>
<body>
<form method="POST" action="Details.jsp">
	<%
		if (request.getParameter("message") != null){
			out.println("<div id='error'>" + request.getParameter("message") + "</div>");	
		}
	%>

	<label for="firstName">First Name<input type="text" name="firstName"></label>
	<label for="lastName">Last Name</label><input type="text" name="lastName">
	<label for="password">Password</label><input type="password" name="password">
	<label for="userName">User Name</label><input type="text" name="userName">
	
	<label for="gender">Gender</label>
	<input type="radio" name="gender" value="Male">Male
	<input type="radio" name="gender"value="Female">Female
	
	<label for="hobbies">Hobbies</label>
	<input type="checkbox" name="hobbies" value="Dance">Dance
	<input type="checkbox" name="hobbies" value="Sports">Sports
	<input type="checkbox" name="hobbies" value="Music">Music
	<input type="checkbox" name="hobbies" value="Painting">Painting
	
	<label for="country">Country</label>
	<select name="country">
		<option value="" disabled hidden selected>--select</option>
		<option value="USA">USA</option>
		<option value="Canada">Canada</option>
		<option value="Mexico">Mexico</option>
		<option value="UK">United Kingdom</option>
	</select>
	
	<input type="submit" name="register" value="Register">

</form>
</body>
</html>