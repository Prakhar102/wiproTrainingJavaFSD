<%@ page import="com.contact.servlet.AddContactServlet" %>
<%@ page import="com.contact.model.Contact" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Edit Contact</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">


<%
int index = Integer.parseInt(request.getParameter("index"));

Contact c = AddContactServlet.list.get(index);
%>

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-6">

            <div class="card shadow-lg p-4">

                <h2 class="text-center text-warning mb-4">

                    Edit Contact

                </h2>

                <form action="update" method="post">

                    <input type="hidden"
                    name="index"
                    value="<%= index %>">

                    <div class="mb-3">

                        <label>Name</label>

                        <input type="text"
                        class="form-control"
                        value="<%= c.getName() %>"
                        readonly>

                    </div>

                    <div class="mb-3">

                        <label>Phone</label>

                        <input type="text"
                        name="phone"
                        class="form-control"
                        value="<%= c.getPhone() %>">

                    </div>

                    <div class="mb-3">

                        <label>Email</label>

                        <input type="email"
                        name="email"
                        class="form-control"
                        value="<%= c.getEmail() %>">

                    </div>

                    <button class="btn btn-warning w-100">

                        Update Contact

                    </button>

                </form>

            </div>

        </div>

    </div>

</div>


</body>
</html>