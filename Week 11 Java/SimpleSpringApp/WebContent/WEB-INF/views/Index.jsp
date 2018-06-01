<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>
</head>
<body>

<h1>Welcome to the Simple Application</h1>
<div class="container">
	<form:form action="userInfo" method="POST" modelAttribute="userkey">
		<div class="sub_field">
			<label>User Name</label>
			<form:input type="text" id="username" path="username" />
			<form:errors path="username" />
		</div>
		<div class="sub_field">
			<label>Password</label>
			<input type="password" id="pass" name="password" />
		</div>
		<div class="sub_field">
			<label>Email</label>
			<form:input type="email" id="email" path="email"/>
			<form:errors path="email" />
		</div>
		<div class="btn">
			<input type="submit" name="submit" value="Submit Info"/>
		</div>
	</form:form>

</div>

</body>
</html>