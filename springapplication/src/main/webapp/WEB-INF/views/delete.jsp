<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
	String msg = (String) request.getAttribute("msg");
	%>
	<%
	String msg1 = (String) request.getAttribute("msg1");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="deleteData" method="post">
		<h1>Delete the Employee</h1>
		<h3>Please enter the Employee Id to delete :</h3>
		<input type="text" name="empid" placeholder="employee Id"> <br>
		<br> <input type="submit" value="Delete Employee"> <br> <br>
		<a href="./forHome">click here for homepage</a>
	</form>
	<%
	if (msg != null) {
	%>
	<%=msg%>
	<%
	}
	%>
	<% if (msg1 != null) { %>
	<%=msg1%>
	<%
	}
	%>
</body>
</html>