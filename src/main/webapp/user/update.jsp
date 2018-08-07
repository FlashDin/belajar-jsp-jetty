<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/header.jsp"></jsp:include>
<c:if test="${dataUser != null}">
    <form action="update" method="post">
        <table>
            <h2>Edit User</h2>
            <input type="hidden" id="id" name="id" value="${dataUser.id}">
            <tr>
                <td>Username</td>
                <td>
                    <input type="text" id="txtUname" name="txtUname" placeholder="Username"
                           value="<c:out value="${dataUser.username}"/>"
                           required>
                </td>
            </tr>
            <tr>
                <td>Password</td>
                <td>
                    <input type="text" id="txtPass" name="txtPass" placeholder="Password"
                           value="<c:out value="${dataUser.password}"/>"
                           required>
                </td>
            </tr>
            <tr>
                <td>
                    <button type="submit">Simpan</button>
                </td>
                <td>
                    <button type="button" onclick="window.location.href='/user';">Batal</button>
                </td>
            </tr>
    </form>
</c:if>
</table>
</body>
</html>
