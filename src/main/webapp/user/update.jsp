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
    <title>Edit User</title>
</head>
<body>
<c:if test="${dataUser != null}">
    <form action="update" method="post">
        <table>
            <h2>Edit User</h2>
            <input type="hidden" id="id" name="id" value="${dataUser.id}">
            <tr>
                <td>Username</td>
                <td>
                    <input type="text" id="txtUname" name="txtUname" value="<c:out value="${dataUser.username}"/>"
                           required>
                </td>
            </tr>
            <tr>
                <td>Password</td>
                <td>
                    <input type="text" id="txtPass" name="txtPass" value="<c:out value="${dataUser.password}"/>"
                           required>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit">Simpan</button>
                </td>
            </tr>
    </form>
</c:if>
</table>
</body>
</html>
