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
<%! String pass; %>

<% 
for(Cookie c:cookie){
	if(c.getName().equals("name")){
		name = c.getValue();
	}
	if(c.getName().equals("pass")){
		pass = c.getValue();
	}
	
}
%>

<h1>This is your profile</h1>
Username = <%= name %> <br>
Password = <%= pass %>

</body>
</html>