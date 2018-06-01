<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submission Details</title>
</head>
<body>
<div>
	<table>
		<tr>
			<td>First Name</td>
			<td>${user.firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${user.lastName}</td>
		</tr>
		<tr>	
			<td>User Name</td>
			<td>${user.userName}</td>
		</tr>
		<tr>	
			<td>Gender</td>
			<td>${user.gender}</td>
		</tr>
		<tr>	
			<td>Phone Number</td>
			<td>${user.contactInfo.phoneNumber}</td>
		</tr>
		<tr>	
			<td>Email</td>
			<td>${user.contactInfo.email}</td>
		</tr>
		<tr>	
			<td>LinkedIn URL</td>
			<td>${user.contactInfo.linkedInUrl}</td>
		</tr>
		<tr>	
			<td>Social Security Number</td>
			<td>${user.privateInfo.ssn}</td>
		</tr>
		<tr>	
			<td>Credit Card Number</td>
			<td>${user.privateInfo.ccn}</td>
		</tr>
		<tr>	
			<td>Date of Birth</td>
			<td>${user.privateInfo.dob}</td>
		</tr>
	</table>
</div>
</body>
</html>