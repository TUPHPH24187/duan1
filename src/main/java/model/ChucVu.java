/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
@Table(name = "ChucVu")
public class ChucVu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCV")
    private Integer MaCV;

    @Column(name = "TenCV")
    private String TenCV;

    @OneToMany(mappedBy = "chucVu", fetch = FetchType.LAZY)
    private List<NhanVien> listNhanVien;

    public ChucVu() {
    }

    public ChucVu(Integer MaCV, String TenCV, List<NhanVien> listNhanVien) {
        this.MaCV = MaCV;
        this.TenCV = TenCV;
        this.listNhanVien = listNhanVien;
    }
    
    /**
     * @return the MaCV
     */
    public Integer getMaCV() {
        return MaCV;
    }

    /**
     * @param MaCV the MaCV to set
     */
    public void setMaCV(Integer MaCV) {
        this.MaCV = MaCV;
    }

    /**
     * @return the TenCV
     */
    public String getTenCV() {
        return TenCV;
    }

    /**
     * @param TenCV the TenCV to set
     */
    public void setTenCV(String TenCV) {
        this.TenCV = TenCV;
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

}
