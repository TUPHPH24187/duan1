/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author nva20
 */
public class KhuyenMaiViewModel {
     private Integer MaKhuyenMai;
    private String TenKhuyenMai;
    private String NgayBatDau;
    private String NgayKetThuc;
    private Integer GiamGia;
    private Integer TrangThai;

    public KhuyenMaiViewModel() {
    }

    public KhuyenMaiViewModel(Integer MaKhuyenMai, String TenKhuyenMai, String NgayBatDau, String NgayKetThuc, Integer GiamGia, Integer TrangThai) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.TenKhuyenMai = TenKhuyenMai;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.GiamGia = GiamGia;
        this.TrangThai = TrangThai;
    }

    public Integer getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(Integer MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return TenKhuyenMai;
    }

    public void setTenKhuyenMai(String TenKhuyenMai) {
        this.TenKhuyenMai = TenKhuyenMai;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public Integer getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(Integer GiamGia) {
        this.GiamGia = GiamGia;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    
}
