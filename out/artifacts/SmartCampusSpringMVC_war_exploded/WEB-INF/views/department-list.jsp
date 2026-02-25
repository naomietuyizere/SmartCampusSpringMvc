<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
  <title>Department Management</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<jsp:include page="navbar.jsp" />

<div class="container">
  <div class="d-flex justify-content-between align-items-center mb-3">
    <h2>🏢 Department Management</h2>
    <a href="${pageContext.request.contextPath}/departments/add" class="btn btn-info text-white">+ Add New Department</a>
  </div>

  <div class="card shadow-sm">
    <div class="card-body">
      <table class="table table-hover table-bordered mb-0">
        <thead class="table-dark">
        <tr>
          <th>ID</th>
          <th>Department Name</th>
          <th>Head of Department</th>
          <th>Building</th>
          <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="department" items="${departments}">
          <tr>
            <td>${department.id}</td>
            <td>${department.name}</td>
            <td>${department.headOfDepartment}</td>
            <td>${department.building}</td>
            <td>
              <a href="${pageContext.request.contextPath}/departments/delete?id=${department.id}" class="btn btn-sm btn-danger">Delete</a>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</div>
</body>
</html>