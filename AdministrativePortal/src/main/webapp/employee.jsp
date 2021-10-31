<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@page import="java.util.ArrayList"%>
 <%@page import="com.simplilearn.entity.students" %>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	     <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	           <div class="collapse navbar-collapse" id="navbarSupportedContent">
	<ul class="navbar-nav mr-auto">
	<li class="nav-item active">
		<a class="nav-link" href="studentList">StudentList<span class="sr-only">(current)</span></a>
		<a class="nav-link" href="studentList">StudentList<span class="sr-only">(current)</span></a>
		
	</li>
	</ul>
	</div>
</nav> 
<% ArrayList studRec=(ArrayList)request.getAttribute("studRec"); %>
<div class="table-responsive shadow p-3 mb-5 bg-white rounded">

<div class="shadow p-3 mb-5 bg-white rounded">Regular shadow</div>
	<table class="table table-striped table-sm">
		<thead>
			<tr>
				<th> StudentId</th>
				<th> firstname</th>
				<th> lastname</th>
				<th> age</th>
				<th> class</th>
			</tr>
			</thead>
			
			<% for(int rec=0;rec<studRec.size();rec++){ 	%>
			<tr>
			<% students stud=(students)studRec.get(rec); %>
			<td> <%=stud.getId() %></td>
			<td> <%=stud.getFname() %></td>
			<td> <%=stud.getLname() %></td>
			<td> <%=stud.getAge() %></td>
			<td> <%=stud.getClasses() %></td>
			
			</tr>
			
			
			
			
						
						
				<% }  %>
			
			
			
		
	
	
	</table>

</div>

</div>

</body>
</html>