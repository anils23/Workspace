<%@ page import="com.te.application.repo.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% Employee emp = (Employee) request.getAttribute("emp"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Data :</h1>
<label>Employee Id :</label>
<%= emp.getId() %> <br>
<label>Employee Name :</label>
<%= emp.getName() %> <br>
<label>Employee Designation :</label>
<%= emp.getDesignation() %> <br>
<label>Employee Age :</label>
<%= emp.getAge() %> <br>
<label>Employee Salary :</label>
<%= emp.getSalary() %>
<br> <br>
<a href="./forHome">click here for homepage</a>
</body>
</html>