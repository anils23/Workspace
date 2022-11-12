<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Login Successfull...!!!</h1>
<% String userName = (String) request.getAttribute("username"); %>
<h1><%= userName %></h1>

</body>
</html>