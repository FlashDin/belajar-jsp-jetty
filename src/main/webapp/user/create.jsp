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
    <title>Insert User</title>
</head>
<body>
<form action="create" method="post">
    <table>
        <h2>Insert User</h2>
        <tr>
            <td>Username</td>
            <td>
                <input type="text" id="txtUname" name="txtUname" required>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td>
                <input type="text" id="txtPass" name="txtPass" required>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Simpan</button>
            </td>
        </tr>
</form>
</body>
</html>
