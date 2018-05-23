<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style type="text/css">
html, body {
	height: 100%;
	}
	td{ border: 1px solid blue;}
	table {
	border: 2px solid red;}
</style>
</head>
<jsp:useBean id="userBean" class="com.catp.beans.Employee" scope="request"></jsp:useBean>
<body>
<div>
<% String designation = request.getParameter("designation");
   if (designation.equals("1")) {
%> <jsp:include page="managersHeading.jsp">
	<jsp:param value="<%=userBean.getfName() %>" name="name" /></jsp:include>	 
	<% 
   } else if (designation.equals("2")){%> <jsp:include
   page="traineesHeading.jsp">
   <jsp:param value="<%=userBean.getfName() %>" name="name" /></jsp:include>
   <% } 
   	   else if(designation.equals("3"))
   	   { 
   	   %> <jsp:include page="developersHeading.jsp">
   	   <jsp:param value="<%=userBean.getfName() %>" name="name" /></jsp:include>  
 <%} %>
</div>
<h1 style="color:green;"><%=request.getParameter("message") %></h1>
<h1>Registration Details</h1>
<table>
	<tr><td>First Name</td> <td><jsp:getProperty property="fName" name="userBean" /></td></tr>
	<tr><td>Last Name</td> <td><jsp:getProperty property="lName" name="userBean" /></td></tr>
	<tr><td>User Name</td> <td><jsp:getProperty property="uName" name="userBean" /></td></tr>
	<tr><td>Gender</td> <td><jsp:getProperty property="gender" name="userBean" /></td>
	</tr>
	<% String hobbies[] = userBean.getHobbies(); %>
	<tr><td>Hobbies</td><td>
	
	<%if (hobbies != null) {
		for (String hobby : hobbies) {
			out.print(hobby + ","); 
		} 
	}%>
	</td></tr>
		
</table>


</body>
</html>