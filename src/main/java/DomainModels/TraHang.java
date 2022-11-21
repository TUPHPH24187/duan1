/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class TraHang {
    private String tenkhachhang;
    private Integer maHD;
    private BigDecimal tienDaThanhToan;
    private String ngayTraHang;
    private String tongTien;

    public TraHang() {
    }

    public TraHang(String tenkhachhang, Integer maHD, BigDecimal tienDaThanhToan, String ngayTraHang, String tongTien) {
        this.tenkhachhang = tenkhachhang;
        this.maHD = maHD;
        this.tienDaThanhToan = tienDaThanhToan;
        this.ngayTraHang = ngayTraHang;
        this.tongTien = tongTien;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public Integer getMaHD() {
        return maHD;
    }

    public void setMaHD(Integer maHD) {
        this.maHD = maHD;
    }

    public BigDecimal getTienDaThanhToan() {
        return tienDaThanhToan;
    }

    public void setTienDaThanhToan(BigDecimal tienDaThanhToan) {
        this.tienDaThanhToan = tienDaThanhToan;
    }

    public String getNgayTraHang() {
        return ngayTraHang;
    }

    public void setNgayTraHang(String ngayTraHang) {
        this.ngayTraHang = ngayTraHang;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "TraHang{" + "tenkhachhang=" + tenkhachhang + ", maHD=" + maHD + ", tienDaThanhToan=" + tienDaThanhToan + ", ngayTraHang=" + ngayTraHang + ", tongTien=" + tongTien + '}';
    }
    
}
