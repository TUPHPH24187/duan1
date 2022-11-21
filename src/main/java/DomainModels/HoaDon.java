/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;

/**
 *
 * @author concu
 */
public class HoaDon {
    private Integer maHD;
    private int maKH;
    private int maNV;
    private int maHTTT;
    private int ngayKT;
    private BigDecimal tienShip;
    private String ghiChu;
    private int trangThai;

    public HoaDon() {
    }

    public HoaDon(Integer maHD, int maKH, int maNV, int maHTTT, int ngayKT, BigDecimal tienShip, String ghiChu, int trangThai) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.maHTTT = maHTTT;
        this.ngayKT = ngayKT;
        this.tienShip = tienShip;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public Integer getMaHD() {
        return maHD;
    }

    public void setMaHD(Integer maHD) {
        this.maHD = maHD;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getMaHTTT() {
        return maHTTT;
    }

    public void setMaHTTT(int maHTTT) {
        this.maHTTT = maHTTT;
    }

    public int getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(int ngayKT) {
        this.ngayKT = ngayKT;
    }

    public BigDecimal getTienShip() {
        return tienShip;
    }

    public void setTienShip(BigDecimal tienShip) {
        this.tienShip = tienShip;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", maKH=" + maKH + ", maNV=" + maNV + ", maHTTT=" + maHTTT + ", ngayKT=" + ngayKT + ", tienShip=" + tienShip + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + '}';
    }
    
}
