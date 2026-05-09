<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">

<title>Success</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

<div class="container mt-5">

    <div class="card p-4 shadow">

        <h2 class="text-success text-center">
            ${message}
        </h2>

        <hr>

        <h4>ID : ${data.id}</h4>

        <h4>User Name : ${data.name}</h4>

        <h4>Email : ${data.email}</h4>

        <a href="register" class="btn btn-primary mt-3">
            Add Another User
        </a>

    </div>

</div>

</body>

</html>