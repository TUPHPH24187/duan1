/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;

/**
 *
 * @author concu
 */
public class KichThuoc implements Serializable {

    private Integer MaKichThuoc;

    private String TenKichThuoc;

    public KichThuoc() {
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

    public KichThuoc(Integer MaKichThuoc, String TenKichThuoc) {
        this.MaKichThuoc = MaKichThuoc;
        this.TenKichThuoc = TenKichThuoc;
    }

    @Override
    public String toString() {
        return getTenKichThuoc();
    }

}
