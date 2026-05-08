<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String user = "";

Cookie[] cookies = request.getCookies();

if (cookies != null) {
    
    for (Cookie c : cookies) {
        
        if (c.getName().equals("user")) {
            user = c.getValue();
        }
    }
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<h2>Login</h2>

<form action="LoginServlet" method="post">

    Username:<input type="text" name="username" value="<%= user %>">
    
    
    <br><br>

    Password:<input type="password" name="password">
    
    
    <br><br>
    
    <input type="checkbox" name="remember"> Remember Me
    
    
    <br><br>
    
    <button type="submit">Login</button>

</form>

</body>
</html>