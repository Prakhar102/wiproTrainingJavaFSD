<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
    int a = 30, b = 40;
    String s = "Hi! your email id is : ";
%>

<%
    String email = (String)session.getAttribute("email");
%>

<%= s.toUpperCase()  %>

<%=  email %>



Sum of two numbers: <%= (a+b) %>

</body>
</html>