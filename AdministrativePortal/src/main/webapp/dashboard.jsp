<%@page import="java.util.LinkedHashMap"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.Objects"%>
<%@page import="java.util.List"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.simplilearn.entity.students" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">

.title{
text-align:center;
font-size:20px;
font-family:cataneo Bt;
background-color:Moccasin;
padding:10px;

}
ul{
  list-style-type:none;
margin:0px;
padding:0px;
background-color:LightGray;
overflow:hidden;

}
li{
Float:left;
}

li a{
	display:block;
	padding: 14px 18px;
	text-decoration:none;
}

li a:hover{
	background-color:gray;
}

.header{
margin-left:-10px;
margin-right:-10px;
}

.container{
background-color: lightblue;
}

.table-condensed{
  font-size: 20px;
}
body {
  background-color: lightblue;
}

</style>
<meta charset="ISO-8859-1">
<title>Dashboard Page</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>



 
</head>
<body>

	<%
		String usernameSession = (String) session.getAttribute("username");
		if (session.getAttribute("username") == null) {
			response.sendRedirect("invalid.jsp?error=1");
		}
	%>
	
	<div class="header">
			 <div class="title">Learners Acadamy</div>
			 
 
		 <div class="menu">
		 <ul>
 	<li><a href="ListAllStudent"><b><font size="3">StudentList</font></b></a>
 	<li><a href="ListClasses"><b><font size="3">ClassList</font></b></a>
 	<li><a href="ListTeachers"><b><font size="3">TeachersList</font></b></a>
 	<li><a href="ListSubject"><b><font size="3">Subject</font></b></a>
 	<li><a href="ReoprtServlet"><b><font size="3">Report</font></b></a>
 	<li><a href="logout.jsp"><b><font size="3">Logout</font></b></a>
 	
		 
		 </ul>
	
	 </div>
 </div>
 	<center><h1>Welcome to learners Acadamy</h1></center>
		
		

</body>
</html>