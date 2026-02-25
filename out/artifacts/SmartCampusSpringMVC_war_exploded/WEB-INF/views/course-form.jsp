<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Course</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<jsp:include page="navbar.jsp" />

<div class="container mt-4 d-flex justify-content-center">
    <div class="card shadow p-4" style="width: 500px;">
        <h3 class="mb-4 text-center text-warning">Add New Course</h3>
        <form action="${pageContext.request.contextPath}/courses/save" method="POST">
            <div class="mb-3">
                <label class="form-label">Course Name:</label>
                <input type="text" name="name" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Course Code:</label>
                <input type="text" name="code" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Credits:</label>
                <input type="number" name="credits" class="form-control" required min="1" max="6" />
            </div>
            <div class="d-flex justify-content-between">
                <a href="${pageContext.request.contextPath}/courses" class="btn btn-secondary">Cancel</a>
                <button type="submit" class="btn btn-warning">Save Course</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>