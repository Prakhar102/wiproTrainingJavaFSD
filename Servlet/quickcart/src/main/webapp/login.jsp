<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>QuickCart Login</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(to right, #667eea, #764ba2);
            height: 100vh;
        }
        .login-card {
            width: 350px;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0px 5px 20px rgba(0,0,0,0.2);
            background: white;
        }
    </style>
</head>

<body class="d-flex justify-content-center align-items-center">

    <div class="login-card text-center">
        <h3 class="mb-4">QuickCart Login</h3>

        <form action="login" method="post">

            <input type="text" name="email" class="form-control mb-3" placeholder="Enter Email" required>

            <input type="password" name="password" class="form-control mb-3" placeholder="Enter Password" required>

            <button type="submit" class="btn btn-primary w-100">Login</button>

        </form>
    </div>

</body>
</html>