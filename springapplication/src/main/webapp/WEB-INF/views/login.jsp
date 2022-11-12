<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<h1>Please Login...!!!</h1>

		<label>Username :</label> 
		<input type="text" name="username">
		<br> <br> 
		<label>Password :</label> 
		<input type="password" name="password"> <br> <br> 
		<input type="submit" value="LOGIN">
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