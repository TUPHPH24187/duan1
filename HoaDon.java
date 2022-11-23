/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "HoaDon")
public class HoaDon implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaHoaDon;
    private Date NgayTao;
    @ManyToOne
    @JoinColumn(name = "MaKhachHang")
    private KhachHang MaKhachHang;
    @ManyToOne
    @JoinColumn(name = "MaNhanVien")
    private NhanVien MaNhanVien;
    private int TrangThai;
//    @OneToMany
//    @JoinColumn(name = "MaHoaDon")
//    private List<HDCT> listHDCT;
    public HoaDon() {
    }

    public HoaDon(int MaHoaDon, Date NgayTao, KhachHang MaKhachHang, NhanVien MaNhanVien, int TrangThai) {
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

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
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
