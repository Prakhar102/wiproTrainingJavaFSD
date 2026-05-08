<%@ page import="java.util.*,com.contact.model.Contact" %>

<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="container mt-5">


<table class="table table-bordered">

<tr>
    <th>Name</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Action</th>
</tr>

<%
ArrayList<Contact> list =
(ArrayList<Contact>)request.getAttribute("contacts");

for(int i=0;i<list.size();i++){

Contact c = list.get(i);
%>

<tr>

<td><%= c.getName() %></td>

<td><%= c.getPhone() %></td>

<td><%= c.getEmail() %></td>

<td>

<a href="edit.jsp?index=<%= i %>"
class="btn btn-warning btn-sm">

Edit

</a>

<a href="delete?index=<%= i %>"
class="btn btn-danger btn-sm">

Delete

</a>

</td>

</tr>

<%
}
%>

</table>

</body>
</html>