/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author concu
 */
@Entity
@Table(name = "HoaDon")
public class HoaDon implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHD")
    private Integer MaHD;
   
    @Column(name = "NgayKhoiTao")
    private String NgayKhoiTao;
    
    @Column(name = "GhiChu")
    private String GhiChu;
    
    @Column(name = "trangThai")
    private int trangThai;

    
   
    @OneToMany(mappedBy = "khachHang", fetch = FetchType.LAZY)
    private List<KhachHang> listKhachHang;
    
    @OneToMany(mappedBy = "nhanVien", fetch = FetchType.LAZY)
    private List<NhanVien> listNhanVien;
    
    @OneToMany(mappedBy = "hinhThucThanhToan", fetch = FetchType.LAZY)
    private List<HinhThucThanhToan> listHinhThucThanhToan;
   
    
    public HoaDon() {
        
    }

    public HoaDon(Integer MaHD, String NgayKhoiTao, String GhiChu, int trangThai, List<KhachHang> listKhachHang, List<NhanVien> listNhanVien, List<HinhThucThanhToan> listHinhThucThanhToan) {
        this.MaHD = MaHD;
        this.NgayKhoiTao = NgayKhoiTao;
        this.GhiChu = GhiChu;
        this.trangThai = trangThai;
        this.listKhachHang = listKhachHang;
        this.listNhanVien = listNhanVien;
        this.listHinhThucThanhToan = listHinhThucThanhToan;
    }

    /**
     * @return the MaHD
     */
    public Integer getMaHD() {
        return MaHD;
    }

    /**
     * @param MaHD the MaHD to set
     */
    public void setMaHD(Integer MaHD) {
        this.MaHD = MaHD;
    }

    /**
     * @return the NgayKhoiTao
     */
    public String getNgayKhoiTao() {
        return NgayKhoiTao;
    }

    /**
     * @param NgayKhoiTao the NgayKhoiTao to set
     */
    public void setNgayKhoiTao(String NgayKhoiTao) {
        this.NgayKhoiTao = NgayKhoiTao;
    }

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    /**
     * @return the trangThai
     */
    public int getTrangThai() {
        return trangThai;
    }

    /**
     * @param trangThai the trangThai to set
     */
    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    /**
     * @return the listKhachHang
     */
    public List<KhachHang> getListKhachHang() {
        return listKhachHang;
    }

    /**
     * @param listKhachHang the listKhachHang to set
     */
    public void setListKhachHang(List<KhachHang> listKhachHang) {
        this.listKhachHang = listKhachHang;
    }

    /**
     * @return the listNhanVien
     */
    public List<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    /**
     * @param listNhanVien the listNhanVien to set
     */
    public void setListNhanVien(List<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }

    /**
     * @return the listHinhThucThanhToan
     */
    public List<HinhThucThanhToan> getListHinhThucThanhToan() {
        return listHinhThucThanhToan;
    }

    /**
     * @param listHinhThucThanhToan the listHinhThucThanhToan to set
     */
    public void setListHinhThucThanhToan(List<HinhThucThanhToan> listHinhThucThanhToan) {
        this.listHinhThucThanhToan = listHinhThucThanhToan;
    }
    
    
}
