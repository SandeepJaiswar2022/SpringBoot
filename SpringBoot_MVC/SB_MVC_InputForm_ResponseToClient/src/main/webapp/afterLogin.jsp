<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="login-container">
    <h2>After Login</h2>
<%--    <%--%>
<%--        String username = (String) session.getAttribute("username");--%>
<%--        String password = (String) session.getAttribute("password");--%>
<%--    %>--%>
<%--    <h2>Username is <%=username%> and Password is <%=password%></h2>--%>
    <h2>Username : ${username} <br> Password : ${password}</h2>
</div>
</body>
</html>
