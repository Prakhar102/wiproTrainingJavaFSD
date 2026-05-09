<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>

<!DOCTYPE html>

<html>

<head>

<title>Users</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

<div class="container mt-5">

    <div class="card p-4 shadow">

        <h1 class="text-center mb-4">
            All Users
        </h1>

        <table class="table table-bordered table-hover">

            <tr class="table-dark">

                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Delete</th>
                <th>Edit</th>

            </tr>

            <c:forEach items="${users}" var="u">

            <tr>

                <td>${u.id}</td>

                <td>${u.name}</td>

                <td>${u.email}</td>

                <td>
                    <a href="delete/${u.id}" class="btn btn-danger btn-sm">
                        Delete
                    </a>
                </td>

                <td>
                    <a href="edit/${u.id}" class="btn btn-warning btn-sm">
                        Edit
                    </a>
                </td>

            </tr>

            </c:forEach>

        </table>

    </div>

</div>

</body>

</html>