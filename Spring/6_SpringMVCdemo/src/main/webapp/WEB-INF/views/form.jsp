<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Form Page</title>
</head>

<body>

<form action="${pageContext.request.contextPath}/display"
      method="post">

    Enter user name :
    <input type="text" name="userName">

    <br/>

    <input type="submit">

</form>

</body>
</html>