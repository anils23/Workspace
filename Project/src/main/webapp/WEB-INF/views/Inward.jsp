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

</style>
</head>
<body>
<fieldset>
<legend>::: INWARD :::</legend>
<form action="./insert" method="post">
			<table>
				<tr>
					<td>Supplier Name</td>
					<td><input type="text" name="suppliername" placeholder="Enter Supplier name"></td>
				</tr>
				<tr>
					<td>Invoice Number</td>
					<td><input type="text" name="invoicenumber" placeholder="Enter Invoice number"></td>
				</tr>
				<tr>
					<td>Material code</td>
					<td><input type="text" name="materialcode"
						placeholder="Enter Material Code"></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><input type="text" name="description"
						placeholder="Enter Material description"></td>
				</tr>
				<tr>
					<td>Quantity</td>
					<td><input type="number" name="quantity"
						placeholder="Enter Quantity"></td>
				</tr>
				<tr>
					<td><input type="Submit" value="INWARD"></td>
				</tr>
			</table>
		</form>
</fieldset>
</body>
</html>