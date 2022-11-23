package com.example.appbanthuo;

public class Thuoc {
    private String hoten;
    private String capbac;
    private String noicongtac;
    private String quocgia;
    private String sosao;
    private int hinh;

    public Thuoc(String hoten, String capbac, String noicongtac, String quocgia, String sosao, int hinh) {
        this.hoten = hoten;
        this.capbac = capbac;
        this.noicongtac = noicongtac;
        this.quocgia = quocgia;
        this.sosao = sosao;
        this.hinh = hinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    public String getNoicongtac() {
        return noicongtac;
    }

    public void setNoicongtac(String noicongtac) {
        this.noicongtac = noicongtac;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSosao() {
        return sosao;
    }

    public void setSosao(String sosao) {
        this.sosao = sosao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
