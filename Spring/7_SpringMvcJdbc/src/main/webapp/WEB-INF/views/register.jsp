<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Register User</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

<div class="container mt-5">

    <div class="card p-4 shadow">

        <h2 class="text-center mb-4">Register User</h2>

        <form action="register" method="post">

            <div class="mb-3">
                <label>ID</label>
                <input type="text" name="id" class="form-control">
            </div>

            <div class="mb-3">
                <label>Name</label>
                <input type="text" name="name" class="form-control">
            </div>

            <div class="mb-3">
                <label>Email</label>
                <input type="text" name="email" class="form-control">
            </div>

            <button type="submit" class="btn btn-primary">
                Register
            </button>

        </form>

    </div>

</div>

</body>
</html>