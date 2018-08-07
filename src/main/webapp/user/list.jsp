<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/header.jsp"></jsp:include>
<table>
    <h2>List User</h2>
    <h2><a href="user/create">Tambah</a></h2>
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Aksi</th>
    </tr>
    <c:forEach var="data" items="${dataUser}">
        <tr>
            <td><c:out value="${data.username}"/></td>
            <td><c:out value="${data.password}"/></td>
            <td>
                <button type="button" onclick="window.location.href='user/update?id=<c:out value='${data.id}' />';">Edit</button>
                <form action="user/delete" method="post">
                    <input type="hidden" id="id" name="id" value="<c:out value='${data.id}' />">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<jsp:include page="/footer.jsp"></jsp:include>
