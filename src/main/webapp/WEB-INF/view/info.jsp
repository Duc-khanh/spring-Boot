<%--
  Created by IntelliJ IDEA.
  User: Khanh Nguyen
  Date: 6/16/2026
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Customer Info</title>
</head>

<body>

<h2>Customer Information</h2>

<p>ID: ${customer.id}</p>

<p>Name: ${customer.name}</p>

<p>Email: ${customer.email}</p>

<p>Address: ${customer.address}</p>

<a href="customers">Back to list</a>

</body>
</html>
