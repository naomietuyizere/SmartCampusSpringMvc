<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Department</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<jsp:include page="navbar.jsp" />

<div class="container mt-4 d-flex justify-content-center">
    <div class="card shadow p-4" style="width: 500px;">
        <h3 class="mb-4 text-center text-info">Add New Department</h3>
        <form action="${pageContext.request.contextPath}/departments/save" method="POST">
            <div class="mb-3">
                <label class="form-label">Department Name:</label>
                <input type="text" name="name" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Head of Department:</label>
                <input type="text" name="headOfDepartment" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Building/Block:</label>
                <input type="text" name="building" class="form-control" required />
            </div>
            <div class="d-flex justify-content-between">
                <a href="${pageContext.request.contextPath}/departments" class="btn btn-secondary">Cancel</a>
                <button type="submit" class="btn btn-info text-white">Save Department</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>