<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/header.jsp"></jsp:include>
<form action="create" method="post">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <h2>Insert User</h2>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <button type="button" class="close" onclick="window.location.href='/user';">&times;</button>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <label for="txtUname">Username</label>
            <input type="text" class="form-control" id="txtUname" name="txtUname" placeholder="Username"
                   required>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <label for="txtPass">Password</label>
            <input type="text" class="form-control" id="txtPass" name="txtPass" placeholder="Password"
                   required>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <button type="submit" class="btn btn-success">Simpan</button>
        </div>
    </div>
</form>
<jsp:include page="/footer.jsp"></jsp:include>
