/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.ChucVu;

/**
 *
 * @author ADMIN
 */
public class NhanVienViewModel {
    private Integer MaNV;
    private String TenNV;
    private String NgaySinh;
    private Integer GioiTinh;
    private String SoDienThoai;
    private String DiaChi;
    private String Email;
    private String MatKhau;
    private Integer TrangThai;
    private ChucVu chucVu;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(Integer MaNV, String TenNV, String NgaySinh, Integer GioiTinh, String SoDienThoai, String DiaChi, String Email, String MatKhau, Integer TrangThai, ChucVu chucVu) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.MatKhau = MatKhau;
        this.TrangThai = TrangThai;
        this.chucVu = chucVu;
    }

    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public Integer getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Integer GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }



}
