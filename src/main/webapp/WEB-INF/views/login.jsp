<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SmartCampus - Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex align-items-center justify-content-center" style="height: 100vh;">
<div class="card shadow p-4" style="width: 400px;">
    <h3 class="text-center text-primary mb-4">🎓 SmartCampus</h3>
    <p class="text-danger text-center">${error}</p>
    <form action="${pageContext.request.contextPath}/login" method="POST">
        <div class="mb-3">
            <label>Username</label>
            <input type="text" name="username" class="form-control" value="admin" required>
        </div>
        <div class="mb-3">
            <label>Password</label>
            <input type="password" name="password" class="form-control" value="admin123" required>
        </div>
        <button type="submit" class="btn btn-primary w-100">Login</button>
    </form>
    <div class="text-center mt-3">
        <a href="${pageContext.request.contextPath}/register">Create an Account</a>
    </div>
</div>
</body>
</html>