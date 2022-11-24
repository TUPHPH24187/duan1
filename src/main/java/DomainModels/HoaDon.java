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
public class HoaDon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHD")
    private Integer MaHD;

    @Column(name = "NgayKhoiTao")
    private String NgayKhoiTao;

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

    public HoaDon(Integer MaHD, String NgayKhoiTao, int trangThai, List<KhachHang> listKhachHang, List<NhanVien> listNhanVien, List<HinhThucThanhToan> listHinhThucThanhToan) {
        this.MaHD = MaHD;
        this.NgayKhoiTao = NgayKhoiTao;
        this.trangThai = trangThai;
        this.listKhachHang = listKhachHang;
        this.listNhanVien = listNhanVien;
        this.listHinhThucThanhToan = listHinhThucThanhToan;
    }

    public Integer getMaHD() {
        return MaHD;
    }

    public void setMaHD(Integer MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayKhoiTao() {
        return NgayKhoiTao;
    }

    public void setNgayKhoiTao(String NgayKhoiTao) {
        this.NgayKhoiTao = NgayKhoiTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public List<KhachHang> getListKhachHang() {
        return listKhachHang;
    }

    public void setListKhachHang(List<KhachHang> listKhachHang) {
        this.listKhachHang = listKhachHang;
    }

    public List<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(List<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }

    public List<HinhThucThanhToan> getListHinhThucThanhToan() {
        return listHinhThucThanhToan;
    }

    public void setListHinhThucThanhToan(List<HinhThucThanhToan> listHinhThucThanhToan) {
        this.listHinhThucThanhToan = listHinhThucThanhToan;
    }

}
