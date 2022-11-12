<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="NavBar.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
fieldset {
	margin: 15px 500px;
	padding: 10px 10px;
	border-color: black;
}
h1{
  text-align: centre;
  color: blue;
  margin: 15px 500px;
  
}
</style>
</head>
<body>
<fieldset>
		<legend>::: Machining Shop Issue :::</legend>
		<form action="./" method="post">
			<table>
				<tr>
					<td>Material code</td>
					<td><input type="text" name="name" placeholder="Enter name"></td>
				</tr>
				<tr>
					<td>Material Description</td>
					<td><input type="text" name="designation"
						placeholder="Enter designation"></td>
				</tr>
				<tr>
					<td>Quantity</td>
					<td><input type="text" name="address"
						placeholder="Enter Address"></td>
				</tr>
				<tr>
					<td><input type="Submit" value="Insert"></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>