<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="search" method="post">
		<h1>Search the Employee...!!!</h1>
		<h3>Please enter the Employee Id to search :</h3>
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
</body>
</html>