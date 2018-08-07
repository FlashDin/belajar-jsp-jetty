<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/header.jsp"></jsp:include>
<form action="create" method="post">
    <table>
        <h2>Insert User</h2>
        <tr>
            <td>Username</td>
            <td>
                <input type="text" id="txtUname" name="txtUname" placeholder="Username" required>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td>
                <input type="text" id="txtPass" name="txtPass" placeholder="Password" required>
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
<jsp:include page="/footer.jsp"></jsp:include>
