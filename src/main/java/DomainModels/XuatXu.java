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
public class XuatXu implements Serializable {

    private Integer MaXuatXu;

    private String TenXuatXu;

    public XuatXu() {
    }

    public Integer getMaXuatXu() {
        return MaXuatXu;
    }

    public void setMaXuatXu(Integer MaXuatXu) {
        this.MaXuatXu = MaXuatXu;
    }

    public XuatXu(Integer MaXuatXu, String TenXuatXu) {
        this.MaXuatXu = MaXuatXu;
        this.TenXuatXu = TenXuatXu;
    }

    public String getTenXuatXu() {
        return TenXuatXu;
    }

    public void setTenXuatXu(String TenXuatXu) {
        this.TenXuatXu = TenXuatXu;
    }

    @Override
    public String toString() {
        return TenXuatXu;
    }
}
