/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import ViewModels.ChiTietSanPham;
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
@Table(name = "KichThuoc")
public class KichThuoc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKichThuoc")
    private Integer MaKichThuoc;

    @Column(name = "TenKichThuoc")
    private String TenKichThuoc;

    @OneToMany(mappedBy = "kichThuoc", fetch = FetchType.LAZY)
    private List<ChiTietSanPham> listChiTietSanPham;

    public KichThuoc() {
    }

    public KichThuoc(Integer MaKichThuoc, String TenKichThuoc, List<ChiTietSanPham> listChiTietSanPham) {
        this.MaKichThuoc = MaKichThuoc;
        this.TenKichThuoc = TenKichThuoc;
        this.listChiTietSanPham = listChiTietSanPham;
    }

    public Integer getMaKichThuoc() {
        return MaKichThuoc;
    }

    public void setMaKichThuoc(Integer MaKichThuoc) {
        this.MaKichThuoc = MaKichThuoc;
    }

    public String getTenKichThuoc() {
        return TenKichThuoc;
    }

    public void setTenKichThuoc(String TenKichThuoc) {
        this.TenKichThuoc = TenKichThuoc;
    }

    public List<ChiTietSanPham> getListChiTietSanPham() {
        return listChiTietSanPham;
    }

    public void setListChiTietSanPham(List<ChiTietSanPham> listChiTietSanPham) {
        this.listChiTietSanPham = listChiTietSanPham;
    }

    

    

    @Override
    public String toString() {
        return getTenKichThuoc();
    }

}
