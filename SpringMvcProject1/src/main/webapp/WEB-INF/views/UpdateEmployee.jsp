<%@page import="com.jspiders.mvcproject1.dto.EmployeeDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="NavBar.jsp" />
<%
List<EmployeeDTO> employees = (List<EmployeeDTO>) request.getAttribute("employeeList");
%>
<%
String message1 = (String) request.getAttribute("msg1");
%>
<%
String message2 = (String) request.getAttribute("msg2");
%>
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
  margin: 15px 500px;
  
}

</style>
</head>
<body style="background-color: aqua;">
	<fieldset>
		<legend>:::Update Employee Details:::</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Enter Employee ID</td>
					<td><input type="text" name="id"
						placeholder="Enter Employee Id"></td>
				</tr>
				<tr>
					<td><input type="Submit" value="Update"></td>
				</tr>
			</table>
		</form>
	</fieldset>
		<%
		if (message != null) {
		%>
		<h1><%=message%></h1>
		<%
		}
		%>
	
		<%
		if (message1 != null) {
		%>
		<h1><%=message1%></h1>
		<%
		}
		%>
		<%
		if (message2 != null) {
		%>
		<fieldset><%=message2%></fieldset>
		<%
		}
		%>
	

	<%
	if (employees != null) {
	%>
	<table style="width: 100%;" border="2px">
		<tr>
			<td>
				<h3>ID</h3>
			</td>
			<td><h3>Name</h3></td>
			<td>
				<h3>Designation</h3>
			</td>
			<td>
				<h3>Email</h3>
			</td>
			<td>
				<h3>Address</h3>
			</td>
			<td>
				<h3>Phone_Number</h3>
			</td>
		</tr>
		<%
		for (int i = 0; i < employees.size(); i++) {
		%>

		<tr>
			<td><%=employees.get(i).getEmpid()%></td>
			<td><%=employees.get(i).getName()%></td>
			<td><%=employees.get(i).getDesignation()%></td>
			<td><%=employees.get(i).getEmail()%></td>
			<td><%=employees.get(i).getAddress()%></td>
			<td><%=employees.get(i).getPhoneno()%></td>
		</tr>

		<%
		}
		%>
	</table>
	<%
	}
	%>
</body>
</html>