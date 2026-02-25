<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
  <title>Lecturer Management</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<jsp:include page="navbar.jsp" />

<div class="container">
  <div class="d-flex justify-content-between align-items-center mb-3">
    <h2>👨‍🏫 Lecturer Management</h2>
    <a href="${pageContext.request.contextPath}/lecturers/add" class="btn btn-primary">+ Add New Lecturer</a>
  </div>

  <div class="card shadow-sm">
    <div class="card-body">
      <table class="table table-hover table-bordered mb-0">
        <thead class="table-dark">
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Email</th>
          <th>Specialization</th>
          <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="lecturer" items="${lecturers}">
          <tr>
            <td>${lecturer.id}</td>
            <td>${lecturer.name}</td>
            <td>${lecturer.email}</td>
            <td>${lecturer.specialization}</td>
            <td>
              <a href="${pageContext.request.contextPath}/lecturers/delete?id=${lecturer.id}" class="btn btn-sm btn-danger">Delete</a>
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