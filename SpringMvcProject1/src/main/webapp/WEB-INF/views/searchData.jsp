<%@page import="com.jspiders.mvcproject1.dto.EmployeeDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="NavBar.jsp"/>
    <% EmployeeDTO employee = (EmployeeDTO) request.getAttribute("find"); %>
    <% String message = (String) request.getAttribute("msg"); %>
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
  color: red;
  margin: 15px 400px;
  padding: 100px;
  
}
</style>

</head>
<body style="background-color:aqua;">
<% if(message != null){ %>
<h1><%= message %></h1>
<%} %>

<%
		if (employee != null) {
		%>
		<fieldset>
		<h2>!!! Employee Details !!!</h2>
				<table>
			<tr>
				<td>Employee Name ::</td>
				<td><%=employee.getName()%></td>
			</tr>
			<tr>
				<td>Employee Email ::</td>
				<td><%=employee.getEmail()%></td>
			</tr>
			<tr>
				<td>Employee Designation ::</td>
				<td><%=employee.getDesignation()%></td>
			</tr>
			<tr>
				<td>Employee Address ::</td>
				<td><%=employee.getAddress()%></td>
			</tr>
			<tr>
				<td>Employee Phone_Number ::</td>
				<td><%=employee.getPhoneno()%></td>
			</tr>
		</table>
		</fieldset>
		
		<%
		}
		%>
</body>
</html>