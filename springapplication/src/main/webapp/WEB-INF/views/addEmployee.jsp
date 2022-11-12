<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addEmployee" method="post">
		<h2>Enter the Employee Details...!!!</h2>
		<label>Enter the Employee Name :</label> 
		<input type="text" name="name"> <br> <br> 
		<label>Enter the Employee Designation :</label> 
		<input type="text" name="designation">
		<br> <br> 
		<label>Enter the Employee Age :</label> 
		<input type="text" name="age"> <br> <br> 
		<label>Enter the Employee Salary :</label> 
		<input type="text" name="salary"> <br>
		<br> <input type="submit" value="INSERT DATA"> <br> <br>
		<a href="./forHome">click here for homepage</a>
	</form>
	<%
	String message = (String) request.getAttribute("msg");
	%>
	<%
	if (message != null) {
	%>
	<%=message%>
	<%
	}
	%>
</body>
</html>