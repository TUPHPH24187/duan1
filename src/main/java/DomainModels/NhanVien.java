/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author concu
 */

@Entity
@Table(name = "NhanVien")
public class NhanVien implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNV")
    private Integer MaNV;
    
    @Column(name = "TenNV")
    private String TenNV;
    
    @Column(name = "NgaySinh")
    private String NgaySinh;
    
    @Column(name = "GioiTinh")
    private Integer GioiTinh;
    
    @Column(name = "SoDienThoai")
    private String SoDienThoai;
    
    @Column(name = "DiaChi")
    private String DiaChi;
    
    @Column(name = "Email")
    private String Email;
    
    @Column(name = "MatKhau")
    private String MatKhau;
    
    @Column(name = "TrangThai")
    private Integer TrangThai;

    @ManyToOne
    @JoinColumn(name = "MaCV", nullable = false)
    private ChucVu chucVu;
    
    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @return the TenNV
     */
    public String getTenNV() {
        return TenNV;
    }

    /**
     * @param TenNV the TenNV to set
     */
    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    /**
     * @return the NgaySinh
     */
    public String getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    /**
     * @return the GioiTinh
     */
    public Integer getGioiTinh() {
        return GioiTinh;
    }

    /**
     * @param GioiTinh the GioiTinh to set
     */
    public void setGioiTinh(Integer GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    /**
     * @return the SoDienThoai
     */
    public String getSoDienThoai() {
        return SoDienThoai;
    }

    /**
     * @param SoDienThoai the SoDienThoai to set
     */
    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the MatKhau
     */
    public String getMatKhau() {
        return MatKhau;
    }

    /**
     * @param MatKhau the MatKhau to set
     */
    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    /**
     * @return the TrangThai
     */
    public Integer getTrangThai() {
        return TrangThai;
    }

    /**
     * @param TrangThai the TrangThai to set
     */
    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    /**
     * @return the chucVu
     */
    public ChucVu getChucVu() {
        return chucVu;
    }

    /**
     * @param chucVu the chucVu to set
     */
    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }
    
    
    
}
