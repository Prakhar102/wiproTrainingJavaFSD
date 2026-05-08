<%@ page import="java.util.*, com.contact.model.Contact" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Contacts</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <h2>Saved Contacts</h2>

    <table class="table table-bordered mt-3">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
        </tr>

        <%
            List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");

            if (contacts != null) {
                for (Contact c : contacts) {
        %>
        <tr>
            <td><%= c.getName() %></td>
            <td><%= c.getEmail() %></td>
            <td><%= c.getPhone() %></td>
        </tr>
        <%
                }
            }
        %>

    </table>

    <a href="index.jsp" class="btn btn-primary">Back</a>

</div>

</body>
</html>