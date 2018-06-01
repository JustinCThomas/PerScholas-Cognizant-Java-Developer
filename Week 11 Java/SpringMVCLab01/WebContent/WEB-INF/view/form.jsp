<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Form</title>
</head>
<body>
<h1>This is a user form</h1>

<form action="process-form" method="POST">
	<div>
		<label for="firstName">First Name</label>
		<input type="text" name="firstName">
	</div>
	<div>
		<label for="lastName">Last Name</label>
		<input type="text" name="lastName">
	</div>
	<div>
		<label for="userName">User Name</label>
		<input type="text" name="userName">
	</div>
	<div>
		<label for="gender">Gender</label>
		<input type="radio" name="gender" value="male">Male
		<input type="radio" name="gender" value="female">Female
	</div>
	<div>
		<label for="contactInfo.phoneNumber">Phone Number</label>
		<input type="text" name="contactInfo.phoneNumber">
	</div>
	<div>
		<label for="contactInfo.email">Email</label>
		<input type="email" name="contactInfo.email">
	</div>
	<div>
		<label for="contactInfo.linkedInUrl">LinkedIn</label>
		<input type="text" name="contactInfo.linkedInUrl">
	</div>
	<div>
		<label for="privateInfo.ssn">Social Security Number</label>
		<input type="text" name="privateInfo.ssn">
	</div>
	<div>
		<label for="privateInfo.ccn">Credit Card Number</label>
		<input type="text" name="privateInfo.ccn">
	</div>
	<div>
		<label for="privateInfo.dob">Date Of Birth</label>
		<input type="date" name="privateInfo.dob">
	</div>
	<input type="submit" name="submit" value="Submit Form">
</form>
</body>
</html>