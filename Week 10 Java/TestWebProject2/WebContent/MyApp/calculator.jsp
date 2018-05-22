<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="calculatorStyles.css">
<title>Calculator</title>
</head>
<body>
<form method="post">
	<input type="text" name="num1">
	<input type="text" name="num2">
	<input type="text" name="symbol">
	<input type="submit" name="submit" value="Calculate">
</form>



<%
	if (request.getParameter("submit") != null){
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String symbol = request.getParameter("symbol");
%>
		<h1>
<%
		switch(symbol){
		case "+":
			out.println( num1 + num2);
			break;
		case "-":
			out.println(num1 - num2);
			break;
		case "*":
			out.println(num1 * num2);
			break;
		case "/":
			out.println(num1 / num2);
			break;
		default:
			out.println("Symbol is unrecognized.");
			break;
		}
%>

</h1>
<%
	}
%>
</body>
</html>