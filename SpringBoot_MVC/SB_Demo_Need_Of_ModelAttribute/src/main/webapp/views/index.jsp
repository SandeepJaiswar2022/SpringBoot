<!DOCTYPE html>
<html>
<head>
    <title>Student Login</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="login-container">
    <h2>Student Login</h2>
    <form action="loginServlet" method="post">
        <div class="input-group">
            <label for="studentId">Student ID:</label>
            <input type="text" id="studentId" name="studentId" required>
        </div>
        <div class="input-group">
            <label for="studentName">Student Name:</label>
            <input type="text" id="studentName" name="studentName" required>
        </div>
        <div class="input-group">
            <button type="submit" class="btn">Login</button>
        </div>
    </form>
</div>
</body>
</html>
