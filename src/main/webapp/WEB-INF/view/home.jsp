<%--
  Created by IntelliJ IDEA.
  User: Khanh Nguyen
  Date: 6/16/2026
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
    <h1>Email Validate</h1>
    <h3 style="color:red">${message}</h3>
    <form action="validate" method="post">
        <input type="text" name="email"><br>
        <input type="submit" value="Validate">
    </form>
</body>
</html>

