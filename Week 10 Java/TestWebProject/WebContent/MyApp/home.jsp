<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test JSP Demo</title>

<style>
	body{
	text-align: center;
	background-color: lavender;
}

div{
	color: white;
	background-color: black;
	display: inline-block;
	padding: 5px;
	font-size: 40px;
	width: 40px;
	transition: 1s;
}

div:hover{
	color: whitesmoke;
	font-size: 100px;
	width: 300px;
}

span{
	font-size: 0px;
	opacity: 0;
	display: inline-block;
	transition: 1s;
}


div:hover > span {
	font-size: 80px;
	opacity: 1;
	/*transition-delay: 1s font-size;*/
}
	
</style>
</head>
<body>
<h1>Hover Test</h1>

	<div id="c">C<span>++</span></div>

 <%!
 	public String getStr() {
	 return "Hello JSP World!";
 	}
 %>
 
 <%@ page import="sampleClasses.TestJSP"%>
<p><%= new java.util.Date() %></p> 
  
 <%
 	TestJSP tJSP = new TestJSP();
 	String str = tJSP.getStr();
 	out.println(str);
 
 	out.println(getStr());
 
		out.println("<br/>");
		for (int i = 1; i <= 10; i++){
			if (i % 2 == 0){
			out.println(i + "<br/>");				
			}
		}	
%>


<script type="text/javascript" src="test.js"></script>
</body>
</html>