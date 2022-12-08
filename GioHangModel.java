/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class GioHangModel {
    private String maHDCT, maHD,tenSp, tenkichthuoc,tenkhuyemai;
    private double tongTien;

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public GioHangModel(double tongTien) {
        this.tongTien = tongTien;
    }

    public GioHangModel(String maHDCT) {
        this.maHDCT = maHDCT;
    }
    private int soLuong;
    private double giaBan,giaDaGiam;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenkichthuoc() {
        return tenkichthuoc;
    }

    public void setTenkichthuoc(String tenkichthuoc) {
        this.tenkichthuoc = tenkichthuoc;
    }

    public String getTenkhuyemai() {
        return tenkhuyemai;
    }

    public void setTenkhuyemai(String tenkhuyemai) {
        this.tenkhuyemai = tenkhuyemai;
    }

    public String getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(String maHDCT) {
        this.maHDCT = maHDCT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getGiaDaGiam() {
        return giaDaGiam;
    }

    public void setGiaDaGiam(double giaDaGiam) {
        this.giaDaGiam = giaDaGiam;
    }

    public GioHangModel(String maHD, String tenSp, String tenkichthuoc, String tenkhuyemai, int soLuong, double giaBan, double giaDaGiam) {
        this.maHD = maHD;
        this.tenSp = tenSp;
        this.tenkichthuoc = tenkichthuoc;
        this.tenkhuyemai = tenkhuyemai;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.giaDaGiam = giaDaGiam;
    }

    public GioHangModel() {
    }
    
}
