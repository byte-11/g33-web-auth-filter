<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/auth/login" method="post">
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
    <button type="submit">Login</button>
</form>
<br>
<br>
<a href="/auth/signup">Sign Up</a>

</body>
</html>
