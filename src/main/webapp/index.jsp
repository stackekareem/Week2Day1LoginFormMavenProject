<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form action="status" method="post">
    <input type="text" name="username" id="username" class="login-form-field" placeholder="Username">
    <input type="password" name="password" id="password" class="login-form-field" placeholder="Password">
    <input type="submit" value="Login" id="login-form-submit">
</form>
</body>
</html>