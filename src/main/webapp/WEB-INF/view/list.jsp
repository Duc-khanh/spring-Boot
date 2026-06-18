<%--
  Created by IntelliJ IDEA.
  User: Khanh Nguyen
  Date: 6/16/2026
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Customer List</title>

    <style>
        table{
            border-collapse: collapse;
        }

        th,td{
            border:1px solid black;
            padding:5px;
        }
    </style>

</head>

<body>

<h2>Customer List</h2>

There are ${customers.size()} customer(s) in list.

<table>

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>

    <c:forEach items="${customers}" var="c">

        <tr>
            <td>${c.id}</td>

            <td>
                <a href="customer?id=${c.id}">
                        ${c.name}
                </a>
            </td>

            <td>${c.email}</td>

            <td>${c.address}</td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
