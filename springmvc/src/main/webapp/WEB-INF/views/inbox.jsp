<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Cookie cookie[] = request.getCookies(); %>
<%! String name; %>
<% 
for(Cookie c:cookie){
	if(c.getName().equals("name")){
		name = c.getValue();
	}
}
%>

<h1>Welcome <%= name %></h1>
<h3>INBOX</h3>

Anil Thapa =  Mail regarding leave. <br>
Sanjay Thapa =  Mail regarding promotion. <br>
Bharat Thapa =  Mail regarding resignation. <br>
</body>
</html>