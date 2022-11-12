<%@page import="com.jspiders.mvcproject1.dto.CustomerDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="NavBar.jsp" />
<%
CustomerDTO customer = (CustomerDTO) request.getAttribute("customer");
%>
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
		<legend>:::Insert Customer Details:::</legend>
		<form action="./insertCustomer" method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"
						placeholder="Enter Customer name"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"
						placeholder="Enter Customer Email"></td>
				</tr>
				<tr>
					<td>Hairstyle</td>
					<td><select name="hairstyle" >
	                         <option value="mediumfadded">Medium Faded</option>				
						     <option value="armycut">Army Cut</option>
					         <option value="undercut">Under Cut</option>
					         <option value="pompadour">Pompadour</option>
					         <option value="quiff">Quiff</option>
					         <option value="combover">Comb Over</option>
				     			</select></td>
				</tr>
				<tr>
					<td>Product_Charges</td>
					<td><input type="text" name="productcharges"
						placeholder="Select Product Charges"></td>
				</tr>
				<tr>
					<td>Service_Charges</td>
					<td><input type="text" name="servicecharges"
						placeholder="Enter ServiceCharges"></td>
				</tr>
				<tr>
					<td><input type="Submit" value="Generate bill"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
	if (customer != null) {
	%>
	<fieldset>
		<legend>:::Bill:::</legend>
		<h2>!!! CREATIVE CUTS !!!</h2>
		<table>
			<tr>
				<td>Bill_no ::</td>
				<td><%=customer.getBillno()%></td>
			</tr>
			<tr>
				<td>Customer_Name ::</td>
				<td><%=customer.getName()%></td>
			</tr>
			<tr>
				<td>Customer_Email ::</td>
				<td><%=customer.getEmail()%></td>
			</tr>
			<tr>
				<td>HairStyle ::</td>
				<td><%=customer.getHairstyle()%></td>
			</tr>
			<tr>
				<td>Products_Prices ::</td>
				<td><%=customer.getProductcharges()%></td>
			</tr>
			<tr>
				<td>Service_Charges ::</td>
				<td><%=customer.getServicecharges()%></td>
			</tr>
			<tr>
				<td>Total Charges ::</td>
				<%! double total, num1, num2; %>
				<% num1=customer.getProductcharges();  %>
				<% num2=customer.getServicecharges(); %>
				<% total = num1+num2; %>
				<td><%= total %></td>
			</tr>
    	</table>
		<h2>:::THANKYOU & VISIT AGAIN:::</h2>
	</fieldset>

	<%
	}
	%>


</body>
</html>