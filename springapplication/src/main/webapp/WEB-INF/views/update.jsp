<%@ page import="com.te.application.repo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<%
Employee employee = (Employee) request.getAttribute("emp");
%>
<%
String msg2 = (String) request.getAttribute("msg2");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="update" method="post">
		<h1>Update the Employee...!!!</h1>
		<h3>Please enter the Employee Id to update :</h3>
		<input type="text" name="empid" placeholder="employee Id"> <br>
		<br> <input type="submit" value="Search Employee"> <br> <br>
		<a href="./forHome">click here for homepage</a>
	</form>
	<%
	if (msg != null) {
	%>
	<%=msg%>
	<%
	}
	%>
	<br>
	<br>
	<%
	if (employee != null) {
	%>
	<form action="updateData" method="post">
		<h2>Update the name :</h2>
		<label>Old Name :</label>
		<%=employee.getName()%>
		<br> <label>New Name :</label> 
		<input type="text" name="newName" placeholder="please enter the new name"> <br> <br>
		<input type="submit" value="Update">
	</form>
	<%
	}
	%>
	<%
	if (msg2 != null) {
	%>
	<%=msg2%>
	<%
	}
	%>
</body>
</html>