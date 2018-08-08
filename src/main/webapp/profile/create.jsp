<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/header.jsp"></jsp:include>
<form action="create" method="post">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <h2>Insert Profile</h2>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <button type="button" class="close" onclick="window.location.href='/profile';">&times;</button>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <c:if test="${param.success == 0}">
            <div class="alert alert-warning col-md-4" role="alert">
                <strong>NOTIFIKASI : </strong> Gagal simpan data
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
        </c:if>
        <c:if test="${param.success == 1}">
            <div class="alert alert-success col-md-4" role="alert">
                <strong>NOTIFIKASI : </strong> Berhasil simpan data
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
        </c:if>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <label for="txtNama">Nama</label>
            <input type="text" class="form-control" id="txtNama" name="txtNama" placeholder="Nama Lengkap"
                   required>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <label for="txtAlamat">Alamat</label>
            <input type="text" class="form-control" id="txtAlamat" name="txtAlamat" placeholder="Alamat"
                   required>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <label for="txtUmur">Umur</label>
            <input type="number" class="form-control" id="txtUmur" name="txtUmur" required>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="form-group col-md-4">
            <label for="cmbJk">Jenis Kelamin</label>
            <select class="form-control" id="cmbJk" name="cmbJk">
                <option value="Pria">Pria</option>
                <option value="Wanita">Wanita</option>
            </select>
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
