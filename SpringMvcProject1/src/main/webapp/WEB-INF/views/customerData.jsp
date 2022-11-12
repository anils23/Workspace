<%@page import="com.jspiders.mvcproject1.dto.CustomerDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="NavBar.jsp"/>
    <%
List<CustomerDTO> customers = (List<CustomerDTO>) request.getAttribute("customerList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SALON MANAGEMENT SYSTEM</title>
<style type="text/css">
h1{
margin-left: 500px;
margin-right: 500px;

}


</style>
</head>
<body style="background-color: aqua;">
<h1 style="align-content: center;">!!! CUSTOMER HISTORY !!!</h1>
<%
	if (customers != null) {
	%>
	<table style="width: 100%;" border="2px">
		<tr>
			<td>
				<h3>Bill_no</h3>
			</td>
			<td><h3>Name</h3></td>
			<td>
				<h3>Email</h3>
			</td>
			<td>
				<h3>HairStyle</h3>
			</td>
			<td>
				<h3>Product Charges</h3>
			</td>
			<td>
				<h3>Service Charges</h3>
			</td>
			<td>
				<h3>Total Charges</h3>
			</td>
		</tr>
		<%
		for (int i = 0; i < customers.size(); i++) {
		%>

		<tr>
			<td><%=customers.get(i).getBillno()%></td>
			<td><%=customers.get(i).getName()%></td>
			<td><%=customers.get(i).getEmail()%></td>
			<td><%=customers.get(i).getHairstyle()%></td>
			<td><%=customers.get(i).getProductcharges()%></td>
			<td><%=customers.get(i).getServicecharges()%></td>
				<%! double total, num1, num2; %>
				<% num1=customers.get(i).getProductcharges();%>
				<% num2=customers.get(i).getServicecharges();%>
				<% total = num1+num2; %>
				<td><%= total %></td>
			</tr>

		<%
		}
		%>
	</table>
	<%
	}
	%>

</body>
</html>