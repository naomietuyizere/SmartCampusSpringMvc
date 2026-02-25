<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Lecturer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<jsp:include page="navbar.jsp" />

<div class="container mt-4 d-flex justify-content-center">
    <div class="card shadow p-4" style="width: 500px;">
        <h3 class="mb-4 text-center text-primary">Add New Lecturer</h3>
        <form action="${pageContext.request.contextPath}/lecturers/save" method="POST">
            <div class="mb-3">
                <label class="form-label">Full Name:</label>
                <input type="text" name="name" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Email Address:</label>
                <input type="email" name="email" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Specialization:</label>
                <input type="text" name="specialization" class="form-control" required />
            </div>
            <div class="d-flex justify-content-between">
                <a href="${pageContext.request.contextPath}/lecturers" class="btn btn-secondary">Cancel</a>
                <button type="submit" class="btn btn-primary">Save Lecturer</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>