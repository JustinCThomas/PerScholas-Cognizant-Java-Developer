<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<%
	out.print("Hello World!!!");
%>
	<div class="container">
		<form action="displayroute">	
			<div class="field">
				<label for="name">Your Name</label>
				<input id="name" name="name" type="text" placeholder="Enter your name" />
			</div>
			<div class="btn">
				<input id="sub" name="submit" type="submit" value="Submit Name" />
			</div>
		</form>
	</div>
</body>
</html>