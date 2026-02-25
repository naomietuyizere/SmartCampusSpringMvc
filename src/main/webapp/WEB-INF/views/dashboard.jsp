<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard - SmartCampus</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<jsp:include page="navbar.jsp" />

<div class="container mt-4">
    <div class="row">
        <div class="col-12">
            <h2 class="mb-4">Welcome back, Admin!</h2>
        </div>
    </div>
    <div class="row text-center mt-4">
        <div class="col-md-3"><div class="card shadow-sm p-4 border-primary"><h4>1,204</h4><p>Total Students</p></div></div>
        <div class="col-md-3"><div class="card shadow-sm p-4 border-success"><h4>85</h4><p>Active Lecturers</p></div></div>
        <div class="col-md-3"><div class="card shadow-sm p-4 border-warning"><h4>42</h4><p>Courses Offered</p></div></div>
        <div class="col-md-3"><div class="card shadow-sm p-4 border-danger"><h4>8</h4><p>Departments</p></div></div>
    </div>
</div>
</body>
</html>