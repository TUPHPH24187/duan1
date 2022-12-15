/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author concu
 */
public class NhanVien implements Serializable {

    private Integer maNV;
    private String TenNV;
    private String NgaySinh;
    private Integer GioiTinh;
    private String SDT;
    private String DiaChi;
    private String Email;
    private String MatKhau;
    private Integer ChucVu;
    private Integer TrangThai;

    public NhanVien() {
    }

    public NhanVien(Integer maNV, String TenNV, String NgaySinh, Integer GioiTinh, String SDT, String DiaChi, String Email, String MatKhau, Integer ChucVu, Integer TrangThai) {
        this.maNV = maNV;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.MatKhau = MatKhau;
        this.ChucVu = ChucVu;
        this.TrangThai = TrangThai;
    }

    public Integer getMaNV() {
        return maNV;
    }

    public void setMaNV(Integer maNV) {
        this.maNV = maNV;
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
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

    public Integer getChucVu() {
        return ChucVu;
    }

    public void setChucVu(Integer ChucVu) {
        this.ChucVu = ChucVu;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    

}
