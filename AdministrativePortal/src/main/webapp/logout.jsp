<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout Page</title>
</head>
<body>
<%
		session.invalidate();
	%>
	<b>
		<h1>Thanks for visiting our website, Will see you soon!</h1>
		<a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a>

</body>
</html>