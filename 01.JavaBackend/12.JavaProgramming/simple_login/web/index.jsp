<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 20/03/2019
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style type="text/css">
    .login {
        height: 180px;
        width: 250px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
    }

    .login input {
        padding: 5px;
        margin: 5px;
    }
</style>
<body>
<form method="get" action="login">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="username" size="30" placeholder="username"/>
        <input type="password" name="password" size="30" placeholder="password"/>
        <input type="submit" value="sign in"/>
    </div>
</form>
</body>
</html>
s