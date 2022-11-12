<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<body style="background-color: aqua;">
<fieldset>
<legend>:::Search Employee Details:::</legend>
<form action="./search" method="post">
<table>
<tr>
<td>Enter Employee ID</td>
<td><input type="text" name="id" placeholder ="Enter Employee Id"></td>
</tr>
<tr>
<td><input type="Submit" value="Search"></td>
</tr>
</table>
</form>
</fieldset>

</body>
</html>