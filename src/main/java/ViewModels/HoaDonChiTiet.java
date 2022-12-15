/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class HoaDonChiTiet {
    private Integer MaHoaDon,MaHDCT,MaCTSP;
    private Integer SoLuong;
    private BigDecimal Gia;
    private Integer GiamGia;
    private BigDecimal ThanhTien;
    private String GhiChu;
    private int trangThai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Integer MaHoaDon, Integer MaHDCT, Integer MaCTSP, Integer SoLuong, BigDecimal Gia, Integer GiamGia, BigDecimal ThanhTien, String GhiChu, int trangThai) {
        this.MaHoaDon = MaHoaDon;
        this.MaHDCT = MaHDCT;
        this.MaCTSP = MaCTSP;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.GiamGia = GiamGia;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
        this.trangThai = trangThai;
    }

    public Integer getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(Integer MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public Integer getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(Integer MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public Integer getMaCTSP() {
        return MaCTSP;
    }

    public void setMaCTSP(Integer MaCTSP) {
        this.MaCTSP = MaCTSP;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getGia() {
        return Gia;
    }

    public void setGia(BigDecimal Gia) {
        this.Gia = Gia;
    }

    public Integer getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(Integer GiamGia) {
        this.GiamGia = GiamGia;
    }

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "MaHoaDon=" + MaHoaDon + ", MaHDCT=" + MaHDCT + ", MaCTSP=" + MaCTSP + ", SoLuong=" + SoLuong + ", Gia=" + Gia + ", GiamGia=" + GiamGia + ", ThanhTien=" + ThanhTien + ", GhiChu=" + GhiChu + ", trangThai=" + trangThai + '}';
    }
    
}
