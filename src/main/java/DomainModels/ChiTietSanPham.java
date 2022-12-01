package DomainModels;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import DomainModels.ChatLieu;
import DomainModels.KichThuoc;
import DomainModels.XuatXu;
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
@Table(name = "ChiTietSanPham")
public class ChiTietSanPham implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCTSP")
    private Integer MaCTSP;

    @Column(name = "TenCTSP")
    private String TenCTSP;

    @Column(name = "SoLuong")
    private Integer SoLuong;

    @Column(name = "GiaBan")
    private double GiaBan;

    @Column(name = "GiaNhap")
    private double GiaNhap;

    @Column(name = "GiamGia")
    private double GiamGia;

    @Column(name = "TrangThai")
    private int TrangThai;

    @ManyToOne
    @JoinColumn(name = "MaKichThuoc", nullable = false)
    private KichThuoc kichThuoc;

    @ManyToOne
    @JoinColumn(name = "MaXuatXu", nullable = false)
    private XuatXu xuatXu;

    @ManyToOne
    @JoinColumn(name = "MaChatLieu", nullable = false)
    private ChatLieu chatLieu;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(Integer MaCTSP) {
        this.MaCTSP = MaCTSP;
    }

    public ChiTietSanPham(Integer MaCTSP, String TenCTSP, Integer SoLuong, double GiaBan, double GiaNhap, double GiamGia, int TrangThai, KichThuoc kichThuoc, XuatXu xuatXu, ChatLieu chatLieu) {
        this.MaCTSP = MaCTSP;
        this.TenCTSP = TenCTSP;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.GiaNhap = GiaNhap;
        this.GiamGia = GiamGia;
        this.TrangThai = TrangThai;
        this.kichThuoc = kichThuoc;
        this.xuatXu = xuatXu;
        this.chatLieu = chatLieu;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public Integer getMaCTSP() {
        return MaCTSP;
    }

    public void setMaCTSP(Integer MaCTSP) {
        this.MaCTSP = MaCTSP;
    }

    public String getTenCTSP() {
        return TenCTSP;
    }

    public void setTenCTSP(String TenCTSP) {
        this.TenCTSP = TenCTSP;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public KichThuoc getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(KichThuoc kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public XuatXu getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(XuatXu xuatXu) {
        this.xuatXu = xuatXu;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

}
