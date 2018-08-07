package org.eclipse.jetty.belajar.entity;

public class Profile extends User {

    private String namaLengkap;
    private String alamat;
    private int umur;
    private String jk;

    public Profile() {
    }

    public Profile(String namaLengkap, String alamat, int umur, String jk) {
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

}
