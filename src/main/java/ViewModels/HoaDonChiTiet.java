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
    private Integer MaHoaDon,MaHDCT,MaCTSP,MaKM;
    private Integer SoLuong;
    private BigDecimal Gia;
    private BigDecimal ThanhTien;
    private int trangThai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Integer MaHoaDon, Integer MaHDCT, Integer MaCTSP, Integer MaKM, Integer SoLuong, BigDecimal Gia, BigDecimal ThanhTien, int trangThai) {
        this.MaHoaDon = MaHoaDon;
        this.MaHDCT = MaHDCT;
        this.MaCTSP = MaCTSP;
        this.MaKM = MaKM;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.ThanhTien = ThanhTien;
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

    public Integer getMaKM() {
        return MaKM;
    }

    public void setMaKM(Integer MaKM) {
        this.MaKM = MaKM;
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

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "MaHoaDon=" + MaHoaDon + ", MaHDCT=" + MaHDCT + ", MaCTSP=" + MaCTSP + ", MaKM=" + MaKM + ", SoLuong=" + SoLuong + ", Gia=" + Gia + ", ThanhTien=" + ThanhTien + ", trangThai=" + trangThai + '}';
    }

   
}
