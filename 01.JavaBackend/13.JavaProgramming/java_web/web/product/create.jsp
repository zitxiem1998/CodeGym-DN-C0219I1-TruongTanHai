<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 24/03/2019
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new a product</title>
    <style>
        .message {
            color: red;
        }
    </style>
</head>
<body>
<center>
<h1>Create new a product</h1>
<p>
    <c:if test='${requestScope["message"]!=null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Create information</legend>
        <table>
            <tr>
               <td>Name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td>Describe: </td>
                <td><input type="text" name="describe" id="describe"></td>
            </tr>
            <tr>
                <td>Produce</td>
                <td><input type="text" name="produce" id="produce"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Create product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</center>
</body>
</html>
