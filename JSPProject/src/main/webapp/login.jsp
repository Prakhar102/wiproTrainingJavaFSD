<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="d-flex justify-content-center align-items-center">

    <div class="login-card text-center">
        <h3 class="mb-4">Login Page</h3>

        <form action="dashboard.jsp" method="post">

            <input type="text" name="email" class="form-control mb-3" placeholder="Enter Email">

            <input type="password" name="password" class="form-control mb-3" placeholder="Enter Password" >

            <button type="submit" class="btn btn-primary w-100">Login</button>

        </form>
    </div>

</body>
</html>