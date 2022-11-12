<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String message = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SALON MANAGEMENT SYSTEM</title>
<style type="text/css">
fieldset {
	margin: 200px 500px;
	padding: 10px 10px;
	border-color: black;
}
body{
   background-color: silver; 
}
h2{
color: red;
}
</style>
</head>
<body>
<fieldset>
<legend>::: Login :::</legend>
<form action="./login" method="post">
<table>
<tr>
<td>UserName</td>
<td><input type="text" name="username" placeholder="Enter Username"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" placeholder="Enter Password"></td>
</tr>
<tr>
<td><input type="Submit" value="Login"></td>
</tr>
</table>
</form>
<% if(message != null){ %>
<h2><%= message %></h2>
<%} %>
</fieldset>

</body>
</html>