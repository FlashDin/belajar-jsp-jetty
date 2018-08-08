<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<jsp:include page="/header.jsp"></jsp:include>
<style type="text/css">
    body {
        font-family: 'Varela Round', sans-serif;
    }

    .modal-confirm {
        color: #636363;
        width: 400px;
    }

    .modal-confirm .modal-content {
        padding: 20px;
        border-radius: 5px;
        border: none;
        text-align: center;
        font-size: 14px;
    }

    .modal-confirm .modal-header {
        border-bottom: none;
        position: relative;
    }

    .modal-confirm h4 {
        text-align: center;
        font-size: 26px;
        margin: 30px 0 -10px;
    }

    .modal-confirm .close {
        position: absolute;
        top: -5px;
        right: -2px;
    }

    .modal-confirm .modal-body {
        color: #999;
    }

    .modal-confirm .modal-footer {
        border: none;
        text-align: center;
        border-radius: 5px;
        font-size: 13px;
        padding: 10px 15px 25px;
    }

    .modal-confirm .modal-footer a {
        color: #999;
    }

    .modal-confirm .icon-box {
        width: 80px;
        height: 80px;
        margin: 0 auto;
        border-radius: 50%;
        z-index: 9;
        text-align: center;
        border: 3px solid #f15e5e;
    }

    .modal-confirm .icon-box i {
        color: #f15e5e;
        font-size: 46px;
        display: inline-block;
        margin-top: 13px;
    }

    .modal-confirm .btn {
        color: #fff;
        border-radius: 4px;
        background: #60c7c1;
        text-decoration: none;
        transition: all 0.4s;
        line-height: normal;
        min-width: 120px;
        border: none;
        min-height: 40px;
        border-radius: 3px;
        margin: 0 5px;
        outline: none !important;
    }

    .modal-confirm .btn-info {
        background: #c1c1c1;
    }

    .modal-confirm .btn-info:hover,
    .modal-confirm .btn-info:focus {
        background: #a8a8a8;
    }

    .modal-confirm .btn-danger {
        background: #f15e5e;
    }

    .modal-confirm .btn-danger:hover,
    .modal-confirm .btn-danger:focus {
        background: #ee3535;
    }

    .trigger-btn {
        display: inline-block;
        margin: 100px auto;
    }
</style>
<div class="row float-right">
    <div class="col-md-4">
        <button class="btn btn-primary" onclick="window.location.href='user/create';">Tambah Data</button>
    </div>
</div>
<br>

<c:if test="${param.usuccess == 0}">
    <div class="alert alert-warning" role="alert">
        <strong>NOTIFIKASI : </strong> Gagal update data
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
</c:if>
<c:if test="${param.usuccess == 1}">
    <div class="alert alert-success" role="alert">
        <strong>NOTIFIKASI : </strong> Berhasil update data
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
</c:if>

<c:if test="${param.dsuccess == 0}">
    <div class="alert alert-warning" role="alert">
        <strong>NOTIFIKASI : </strong> Gagal hapus data
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
</c:if>
<c:if test="${param.dsuccess == 1}">
    <div class="alert alert-success" role="alert">
        <strong>NOTIFIKASI : </strong> Berhasil hapus data
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
</c:if>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Aksi</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="data" items="${dataSets}">
        <tr>
            <td><c:out value="${data.username}"/></td>
            <td><c:out value="${data.password}"/></td>
            <td>
                <div class="row">
                    <div class="col-sm-2">
                        <a href="user/update?id=<c:out value='${data.id}'/>" class="btn btn-warning"><i
                                class="fa fa-pencil"></i></a>
                    </div>
                    <div class="col-sm-2">
                        <a href="#" class="delete-modal btn btn-danger" data-value="<c:out value='${data.id}' />"
                           data-toggle="modal"
                           data-target="#myModal"><i class="fa fa-trash"></i></a>
                    </div>
                </div>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<!-- Modal HTML -->
<div id="myModal" class="modal fade">
    <div class="modal-dialog modal-confirm">
        <div class="modal-content">
            <div class="modal-header">
                <div class="icon-box">
                    <i class="material-icons">&#xE5CD;</i>
                </div>
                <h4 class="modal-title">Yakin Hapus data ini?</h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            </div>
            <div class="modal-body">
                <p>Aksi ini tidak dapat di ulang.</p>
            </div>
            <div class="modal-footer">
                <form action="user/delete" method="post">
                    <input type="hidden" id="id" name="id" value="<c:out value='${data.id}' />">
                    <button type="submit" class="btn btn-danger" name="task_del">Hapus</button>
                </form>
            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function (e) {
        $(document).on("click", ".delete-modal", function (e) {
            var id = $(this).attr('data-value');
            $('input[name="id"]').val(id);
        });
    });
</script>
<jsp:include page="/footer.jsp"></jsp:include>
