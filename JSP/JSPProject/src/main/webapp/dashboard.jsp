<%@ page language="java" contentType="text/html; charset=UTF-8"
   session = "true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"/>

<%

String email = request.getParameter("email");
String password = request.getParameter("password"); // request is also an implicit object
session.setAttribute("email", email);

if(email == null || email.isEmpty() ||
password == null || password.isEmpty())
	response.sendRedirect("error.jsp"); //response is an object

%>


<h2>Welcome, <%= email %></h2>
<br>

<a href="add.jsp">Addition</a>

</body>
</html>