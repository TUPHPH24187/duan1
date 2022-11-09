/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author concu
 */
@Entity
@Table(name = "HinhThucThanhToan")
public class HinhThucThanhToan implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHTTT")
    private Integer MaHTTT;
    
    @Column(name = "TenHTTT")
    private String TenHTTT;

    
    
    public Integer getMaHTTT() {
        return MaHTTT;
    }

    public void setMaHTTT(Integer MaHTTT) {
        this.MaHTTT = MaHTTT;
    }

    public HinhThucThanhToan() {
    }

    public HinhThucThanhToan(Integer MaHTTT, String TenHTTT) {
        this.MaHTTT = MaHTTT;
        this.TenHTTT = TenHTTT;
    }

    public String getTenHTTT() {
        return TenHTTT;
    }

    public void setTenHTTT(String TenHTTT) {
        this.TenHTTT = TenHTTT;
    }
    
    
    
}
