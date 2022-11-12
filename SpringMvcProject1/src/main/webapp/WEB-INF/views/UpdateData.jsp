<%@page import="com.jspiders.mvcproject1.dto.EmployeeDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% EmployeeDTO update = (EmployeeDTO) request.getAttribute("update"); %>
    <jsp:include page="NavBar.jsp"/>
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
</style>
</head>
<body style="background-color:aqua; ">
<fieldset>
		<legend>:::Update Employee Details:::</legend>
		<form action="./updatedata" method="post">
			<table>
			    <thead>
			    <tr>
			    <td></td>
			    <td>Old Data</td>
			    <td> New Data</td>
			    </tr>
			    </thead>
				<tr hidden="true">
					<td>Employee_ID</td>
					<td><%= update.getEmpid() %></td>
					<td><input type="text" name="empid" value="<%= update.getEmpid() %>"></td>
				</tr>
				<tr>
					<td>Employee_Name</td>
					<td><%= update.getName() %></td>
					<td><input type="text" name="name" value="<%= update.getName() %>"></td>
				</tr>
				<tr>
					<td>Employee_Email</td>
					<td><%= update.getEmail() %></td>
					<td><input type="text" name="email" value="<%= update.getEmail() %>"></td>
				</tr>
				<tr>
					<td>Employee_Designation</td>
					<td><%= update.getDesignation() %></td>
					<td><input type="text" name="designation"
						value="<%= update.getDesignation() %>"></td>
				</tr>
				<tr>
					<td>Employee_Address</td>
					<td><%= update.getAddress() %></td>
					<td><input type="text" name="address"
						value="<%= update.getAddress() %>"></td>
				</tr>
				<tr>
					<td>Employee_PhoneNumber</td>
					<td><%= update.getPhoneno() %></td>
					<td><input type="text" name="phoneno"
						value="<%= update.getPhoneno() %>"></td>
				</tr>
				<tr>
					<td><input type="Submit" value="Update"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>