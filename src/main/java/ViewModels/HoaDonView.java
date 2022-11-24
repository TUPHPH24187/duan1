/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.KhachHang;
import DomainModels.NhanVien;
import java.util.Date;

/**
 *
 * @author admin
 */
public class HoaDonView {
    private Integer MaHoaDon;
    private String NgayTao;  
    private KhachHang MaKhachHang;   
    private NhanVien MaNhanVien;
    private int TrangThai;
    public HoaDonView() {
    }

    public HoaDonView(Integer MaHoaDon, String NgayTao, KhachHang MaKhachHang, NhanVien MaNhanVien, int TrangThai) {
        this.MaHoaDon = MaHoaDon;
        this.NgayTao = NgayTao;
        this.MaKhachHang = MaKhachHang;
        this.MaNhanVien = MaNhanVien;
        this.TrangThai = TrangThai;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public KhachHang getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(KhachHang MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public NhanVien getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(NhanVien MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    
}
