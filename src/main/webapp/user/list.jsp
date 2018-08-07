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
    <h2>List User</h2>
    <h2><a href="user/create">Tambah</a></h2>
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
                <a href="user/update?id=<c:out value='${data.id}' />">Edit</a>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <form action="user/delete" method="post">
                    <input type="hidden" id="id" name="id" value="<c:out value='${data.id}' />">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
