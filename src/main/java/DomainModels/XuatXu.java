package DomainModels;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;
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
@Table(name = "XuatXu")
public class XuatXu implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaXuatXu")
    private Integer MaXuatXu;
    
    @Column(name = "TenXuatXu")
    private String TenXuatXu;
    
    @Column(name = "TrangThai")
    private int trangThai;
    
    @OneToMany(mappedBy = "xuatXu", fetch = FetchType.LAZY)
    private List<ChiTietSanPham> listChiTietSanPham;

    public XuatXu() {
    }

    public XuatXu(Integer MaXuatXu, String TenXuatXu, int trangThai, List<ChiTietSanPham> listChiTietSanPham) {
        this.MaXuatXu = MaXuatXu;
        this.TenXuatXu = TenXuatXu;
        this.trangThai = trangThai;
        this.listChiTietSanPham = listChiTietSanPham;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

   

    public Integer getMaXuatXu() {
        return MaXuatXu;
    }

    public void setMaXuatXu(Integer MaXuatXu) {
        this.MaXuatXu = MaXuatXu;
    }

    public String getTenXuatXu() {
        return TenXuatXu;
    }

    public void setTenXuatXu(String TenXuatXu) {
        this.TenXuatXu = TenXuatXu;
    }

    public List<ChiTietSanPham> getListChiTietSanPham() {
        return listChiTietSanPham;
    }

    public void setListChiTietSanPham(List<ChiTietSanPham> listChiTietSanPham) {
        this.listChiTietSanPham = listChiTietSanPham;
    }
    
    
    
    
    @Override
    public String toString() {
        return TenXuatXu;
    }
}
