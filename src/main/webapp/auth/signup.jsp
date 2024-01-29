<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/auth/signup" method="post">
    <label>
        Email : <input type="email" name="email">
    </label>
    <br>
    <br>
    <label>
        Password : <input type="password" name="password">
    </label>
    <br>
    <br>
    <button type="submit">SignUp</button>
</form>
<br>
<br>
<a href="${pageContext.request.contextPath}/auth/login">Login</a>
</body>
</html>
