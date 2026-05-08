<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Manager</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="container mt-5">


<form action="add" method="post">

    <input type="text" name="name"
    class="form-control mb-3"
    placeholder="Enter Name">

    <input type="text" name="phone"
    class="form-control mb-3"
    placeholder="Enter Phone">

    <input type="email" name="email"
    class="form-control mb-3"
    placeholder="Enter Email">

    <button class="btn btn-primary">
        Add Contact
    </button>

</form>

<br>

<a href="view" class="btn btn-success">
View Contacts
</a>

</body>
</html>