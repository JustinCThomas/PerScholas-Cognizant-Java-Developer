<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 1</title>
</head>
<body>
<h1>Welcome Page1</h1>
<%
	Integer applicationCounter = (Integer) application.getAttribute("applicationCount");
	if (applicationCounter == null) {
		applicationCounter = 1;
	} else {
		applicationCounter += 1;
	}
	application.setAttribute("applicationCount", applicationCounter);
%>
<%
	Integer pageCounter = (Integer) pageContext.getAttribute("pageCount");
	if (pageCounter == null) {
		pageCounter = 1;
	} else {
		pageCounter += 1;
	}
	pageContext.setAttribute("pageCount", pageCounter);
%>

<%
	Integer sessionCounter = (Integer) session.getAttribute("sessionCount");
	if (sessionCounter == null) {
		sessionCounter = 1;
	} else {
		sessionCounter += 1;
	}
	session.setAttribute("sessionCount", sessionCounter);
%>

<h1>Application Count: <%=applicationCounter %></h1>
<h1>Page1 Count: <%=pageCounter %></h1>
<h1>Session Count: <%=sessionCounter %></h1>
</body>
</html>