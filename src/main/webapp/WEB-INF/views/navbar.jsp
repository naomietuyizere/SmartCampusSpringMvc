<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-4 shadow-sm">
    <div class="container">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/dashboard">🎓 SmartCampus Admin</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/students">Students</a></li>
                <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/lecturers">Lecturers</a></li>
                <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/courses">Courses</a></li>
                <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/departments">Departments</a></li>
                <li class="nav-item"><a class="nav-link text-danger" href="${pageContext.request.contextPath}/login">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>