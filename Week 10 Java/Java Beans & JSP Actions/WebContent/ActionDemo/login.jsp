<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import="com.catp.beans.User" %>

<%
if(request.getParameter("login") !=null) {
	User user = new User();
	user.setUserName(request.getParameter("userName"));
	user.setPassword(request.getParameter("password"));
	if("tom".equals(user.getUserName())&&
			"jerry".equalsIgnoreCase(user.getPassword()))
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		request.setAttribute("user", user);
		dispatcher.forward(request, response);
	} else {
		out.print("User Name and Password does not match");
		response.sendRedirect("errorPage.jsp");
	}
		
}	
%>
<body>
<form method="post">
<table>
	<tr>
		<td>User Name :</td>
		<td><input type="text" name="userName" /></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password" /></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" name="login" value="Login" />
		</td>
	</tr>

</table>
</form>
</body>
</html>