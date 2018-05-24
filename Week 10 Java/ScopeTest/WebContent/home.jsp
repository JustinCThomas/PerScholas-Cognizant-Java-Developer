<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav>
	<a href="page1.jsp" target="_blank">Page 1</a>
	<a href="page2.jsp" target="_blank">Page 2</a>
	<a href="page3.jsp" target="_blank">Page 3</a>
</nav>
<h1>Navigation</h1>

<% Integer appCount = (Integer) application.getAttribute("applicationCount");
   if (appCount == null) {
	   appCount = 0;
   }
   Integer sessCount = (Integer) session.getAttribute("sessionCount");
   if (sessCount == null) {
	   sessCount = 0;
   }
%>

<h3>Application count: <%= appCount %></h3>
<h3>Session count: <%= sessCount %></h3>
</body>
</html>