<%@page import="java.util.List"%>
<%@page import="com.jspiders.mvcproject1.dto.EmployeeDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="NavBar.jsp"/>
    <%
String msg = (String) request.getAttribute("msg");
%>
 <%
String msg1 = (String) request.getAttribute("msg1");
%>
<%
List<EmployeeDTO> employees = (List<EmployeeDTO>) request.getAttribute("employeeList");
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
</style>
</head>
<body style="background-color: aqua;">
<fieldset>
<legend>:::Remove Employee Details:::</legend>
<form action="./remove" method="post">
<table>
<tr>
<td>Enter Employee ID</td>
<td><input type="text" name="id" placeholder ="Enter Employee Id"></td>
</tr>
<tr>
<td><input type="Submit" value="Remove"></td>
</tr>
</table>
</form>
</fieldset>
<%
	if (employees != null) {
	%>

	<%
	if (msg != null) {
	%>
	<h1 style="text-align: center; color: red;"><%=msg%>
	</h1>
	<%
	}
	%>
	<%
	if (msg1 != null) {
	%>
	<h1 style="text-align: center; color: red;"><%=msg1%>
	</h1>
	<%
	}
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