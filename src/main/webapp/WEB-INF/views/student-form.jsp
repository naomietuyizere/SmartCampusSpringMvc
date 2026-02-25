<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        .form-group { margin-bottom: 15px; }
        label { display: block; margin-bottom: 5px; }
        input { padding: 8px; width: 300px; }
        button { padding: 10px 15px; background-color: #003366; color: white; border: none; cursor: pointer; }
    </style>
</head>
<body>
<h2>Add New Student</h2>
<form action="${pageContext.request.contextPath}/students/save" method="POST">
    <div class="form-group">
        <label>Name:</label>
        <input type="text" name="name" required />
    </div>
    <div class="form-group">
        <label>Email:</label>
        <input type="email" name="email" required />
    </div>
    <div class="form-group">
        <label>Department:</label>
        <input type="text" name="department" required />
    </div>
    <button type="submit">Save Student</button>
</form>
</body>
</html>