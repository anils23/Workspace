<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
ul{
   background-color:black;
   overflow: none;
   text-decoration:none;
   padding: 50px 10px;
   text-align: center;
   
}
li{
  float:right;
}
li a{
display: block;
padding: 20px 20px;
}
li a:hover {
	background-color: grey;
}
</style>
</head>
<body>
<ul type="none">
<li><a href="./logout" style="color: white;">LogOut</a></li>
<li><a href="./about" style="color: white;">About</a></li>
<li><a href="./update" style="color: white;">Update Employee</a></li>
<li><a href="./remove" style="color: white;">Remove Employee</a></li>
<li><a href="./insert" style="color: white;">Insert Employee</a></li>
<li><a href="./history" style="color: white;">Customer History</a></li>
<li><a href="./insertCustomer" style="color: white;">Insert Customer</a></li>
<li><a href="./homepage" style="color: white;">HomePage</a></li>
</ul>
</body>
</html>