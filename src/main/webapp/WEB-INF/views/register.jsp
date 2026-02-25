<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SmartCampus - Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex align-items-center justify-content-center" style="height: 100vh;">
<div class="card shadow p-4" style="width: 400px;">
    <h3 class="text-center text-success mb-4">Create Account</h3>
    <form action="${pageContext.request.contextPath}/login" method="GET">
        <div class="mb-3"><label>Full Name</label><input type="text" class="form-control" required></div>
        <div class="mb-3"><label>Email</label><input type="email" class="form-control" required></div>
        <div class="mb-3"><label>Password</label><input type="password" class="form-control" required></div>
        <button type="submit" class="btn btn-success w-100">Register</button>
    </form>
</div>
</body>
</html>