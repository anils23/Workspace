<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to my page...!!!</h1>
<% String username = request.getParameter("username"); %>
<% String password = request.getParameter("password"); %>
<% Cookie cookie = new Cookie("name", username); %>
<% Cookie cookie2 = new Cookie("pass", password); %>
<% response.addCookie(cookie); %>
<% response.addCookie(cookie2); %>
<br>
<h1><%= username %></h1> 
<br>
<a href="./inbox">Click here to go to inbox</a> <br>
<a href="profile">Click here to go to your profile</a>
</body>
</html>