/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import DomainModels.ChiTietSanPham;
import DomainModels.HoaDon;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "HoaDonChiTiet")
public class HDCT implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHDCT")
    private Integer MaHDCT;
    
    @Column(name = "SoLuong")
    private Integer SoLuong;
    
    @Column(name = "Gia")
    private BigDecimal Gia;
    
    @Column(name = "ThanhTien")
    private BigDecimal ThanhTien;  
    
    @Column(name = "TrangThai")
    private Integer TrangThai;
    
    
    @ManyToOne
    @JoinColumn(name = "MaHD", nullable = false)
    private HoaDon MaHD;
        
    @ManyToOne
    @JoinColumn(name = "MaCTSP", nullable = false)
    private ChiTietSanPham MaCTSP;

    public HDCT() {
    }

    public HDCT(Integer MaHDCT, Integer SoLuong, BigDecimal Gia, BigDecimal ThanhTien, Integer TrangThai, HoaDon MaHD, ChiTietSanPham MaCTSP) {
        this.MaHDCT = MaHDCT;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.ThanhTien = ThanhTien;
        this.TrangThai = TrangThai;
        this.MaHD = MaHD;
        this.MaCTSP = MaCTSP;
    }

    public Integer getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(Integer MaHDCT) {
        this.MaHDCT = MaHDCT;
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

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    public HoaDon getMaHD() {
        return MaHD;
    }

    public void setMaHD(HoaDon MaHD) {
        this.MaHD = MaHD;
    }

    public ChiTietSanPham getMaCTSP() {
        return MaCTSP;
    }

    public void setMaCTSP(ChiTietSanPham MaCTSP) {
        this.MaCTSP = MaCTSP;
    }

    
    
}
