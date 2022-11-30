/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author DELL
 */
public class KhachHangModel {

    private String maKH, tenKH, ngaySinh, sdt;
    private int gioiTinh;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public KhachHangModel(String maKH, String tenKH, String ngaySinh, String sdt, int gioiTinh) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public KhachHangModel() {
    }
  

    public String htGt() {
        if (gioiTinh == 1) {
            return "Nam";
        }
        else{
            return  "Nữ";
        }
    }

}
