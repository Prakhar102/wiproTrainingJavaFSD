<%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<title>Update User</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

<div class="container mt-5">

    <div class="card p-4 shadow">

        <h1 class="text-center mb-4">
            Update User
        </h1>

        <form:form
        action="${pageContext.request.contextPath}/update"
        method="post"
        modelAttribute="user">

            <div class="mb-3">

                <label>ID</label>

                <form:input path="id"
                readonly="true"
                class="form-control"/>

            </div>

            <div class="mb-3">

                <label>Name</label>

                <form:input path="name"
                class="form-control"/>

            </div>

            <div class="mb-3">

                <label>Email</label>

                <form:input path="email"
                class="form-control"/>

            </div>

            <button type="submit"
            class="btn btn-success">

                Update

            </button>

        </form:form>

    </div>

</div>

</body>

</html>