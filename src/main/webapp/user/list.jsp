<%--
  Created by IntelliJ IDEA.
  User: flashdin
  Date: 07/08/18
  Time: 6:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List User</title>
</head>
<body>
<table>
    <caption><h2>List User</h2></caption>
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="data" items="${dataUser}">
        <tr>
            <td><c:out value="${data.username}"/></td>
            <td><c:out value="${data.password}"/></td>
            <td>
                <a href="edit?id=<c:out value='${data.id}' />">Edit</a>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a href="delete?id=<c:out value='${data.id}' />">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
