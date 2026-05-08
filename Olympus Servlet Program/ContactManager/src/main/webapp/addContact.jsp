<!DOCTYPE html>
<html>
<head>
    <title>Add Contact</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <h2>Add Contact</h2>

    <form action="add" method="post">

        <input class="form-control mb-3" type="text" name="name" placeholder="Name" required>

        <input class="form-control mb-3" type="email" name="email" placeholder="Email" required>

        <input class="form-control mb-3" type="text" name="phone" placeholder="Phone" required>

        <button class="btn btn-success">Save Contact</button>

    </form>

</div>

</body>
</html>