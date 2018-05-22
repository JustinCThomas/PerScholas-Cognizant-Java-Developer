<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="detailsStyles.css">
<title>Registration Details</title>
</head>
<body>

<%
	String[] hobbies = request.getParameterValues("hobbies");
	String hobby = "";
	
	if (hobbies != null) {
		for (int i = 0; i < hobbies.length; i++){
			if (i < (hobbies.length - 1)) {
				hobby += hobbies[i] + ", ";	
			} else {
				hobby += hobbies[i];
			}
		}
	}
	

	if (request.getParameter("register") != null){
		if (request.getParameter("firstName").equals("")){
			response.sendRedirect("Registration.jsp?message=First Name cannot be null ");	
		} else if (request.getParameter("lastName").equals("")){
			response.sendRedirect("Registration.jsp?message=Last Name cannot be null ");	
		} else if (request.getParameter("password").equals("")){
			response.sendRedirect("Registration.jsp?message=Password cannot be null ");	
		} else if (request.getParameter("userName").equals("")){
			response.sendRedirect("Registration.jsp?message=User Name cannot be null ");	
		} else if (request.getParameter("gender") == null){
			response.sendRedirect("Registration.jsp?message=Gender cannot be null ");	
		} else if (request.getParameter("hobbies") == null){
			response.sendRedirect("Registration.jsp?message=Hobbies cannot be null ");	
		} else if (request.getParameter("country") == null){
			response.sendRedirect("Registration.jsp?message=Country cannot be null ");	
		}
	}
%>

<div class="container">

<h1>Registration Details</h1>
	<table>
	<tr>
		<td>First Name</td>
		<td><%= request.getParameter("firstName") %></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><%= request.getParameter("lastName") %></td>
	</tr>
	<tr>
		<td>User Name</td>
		<td><%= request.getParameter("userName") %></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><%= request.getParameter("gender") %></td>
	</tr>
	<tr>
		<td>Hobbies</td>
		<td><%= hobby %></td>
	</tr>
	<tr>
		<td>Country</td>
		<td><%= request.getParameter("country") %></td>
	</tr>
	</table>

</div>

</body>
</html>