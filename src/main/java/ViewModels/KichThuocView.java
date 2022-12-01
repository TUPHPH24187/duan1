/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author concu
 */
public class KichThuocView {
    private Integer MaKichThuoc;
    private String TenKichThuoc;
    private int trangThai;

    public KichThuocView() {
    }

    public KichThuocView(Integer MaKichThuoc, String TenKichThuoc, int trangThai) {
        this.MaKichThuoc = MaKichThuoc;
        this.TenKichThuoc = TenKichThuoc;
        this.trangThai = trangThai;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
    
}
