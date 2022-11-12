<%@page import="com.jspiders.mvcproject1.dto.EmployeeDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="NavBar.jsp" />
<%
EmployeeDTO employee = (EmployeeDTO) request.getAttribute("employee");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SALON MANAGEMENT SYSTEM</title>
<style type="text/css">
fieldset {
	margin: 15px 500px;
	padding: 10px 10px;
	border-color: black;
}
h1{
  text-align: centre;
  color: blue;
  margin: 15px 500px;
  
}
</style>
</head>
<body style="background-color:aqua;">
	<fieldset>
		<legend>:::Insert Employee Details:::</legend>
		<form action="./insert" method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" placeholder="Enter name"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" placeholder="Enter Email"></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation"
						placeholder="Enter designation"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"
						placeholder="Enter Address"></td>
				</tr>
				<tr>
					<td>Phone_Number</td>
					<td><input type="text" name="phoneno"
						placeholder="Enter Phoneno" maxlength="10" min="10"></td>
				</tr>
				<tr>
					<td><input type="Submit" value="Insert"></td>
				</tr>
			</table>
		</form>
	</fieldset>

		<%
		if (employee != null) {
		%>
		<fieldset>
		
				<table>
			<tr>
				<td>Employee Name</td>
				<td><%=employee.getName()%></td>
			</tr>
			<tr>
				<td>Employee Email</td>
				<td><%=employee.getEmail()%></td>
			</tr>
			<tr>
				<td>Employee Designation</td>
				<td><%=employee.getDesignation()%></td>
			</tr>
			<tr>
				<td>Employee Address</td>
				<td><%=employee.getAddress()%></td>
			</tr>
			<tr>
				<td>Employee Phone_Number</td>
				<td><%=employee.getPhoneno()%></td>
			</tr>
		</table>
		<h3>Data Inserted Successfully</h3>
		</fieldset>
		
		<%
		}
		%>

</body>
</html>