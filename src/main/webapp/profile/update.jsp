<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/header.jsp"></jsp:include>
<c:if test="${dataSets == null}">
    <center>
        <h2>Data tidak ditemukan</h2>
    </center>
</c:if>
<c:if test="${dataSets != null}">
    <form action="update" method="post">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <h2>Edit Profile</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <button type="button" class="close" onclick="window.location.href='/profile';">&times;</button>
            </div>
        </div>
        <input type="hidden" id="id" name="id" value="${dataSets.id}">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label for="txtNama">Nama</label>
                <input type="text" class="form-control" id="txtNama" name="txtNama" placeholder="Nama Lengkap"
                       value="<c:out value="${dataSets.namaLengkap}"/>"
                       required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label for="txtAlamat">Alamat</label>
                <input type="text" class="form-control" id="txtAlamat" name="txtAlamat" placeholder="Alamat"
                       value="<c:out value="${dataSets.alamat}"/>"
                       required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label for="txtUmur">Umur</label>
                <input type="number" class="form-control" id="txtUmur" name="txtUmur"
                       value="<c:out value="${dataSets.umur}"/>" required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label for="cmbJk">Jenis Kelamin</label>
                <select class="form-control" id="cmbJk" name="cmbJk">
                    <option value="Pria" <c:if test="${dataSets.jk == 'Pria'}">selected</c:if> >Pria</option>
                    <option value="Wanita" <c:if test="${dataSets.jk == 'Wanita'}">selected</c:if> >Wanita</option>
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
</c:if>
<jsp:include page="/footer.jsp"></jsp:include>
