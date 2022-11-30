/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author DELL
 */
public class giamGiamodel {

   
    private String tenGiamGIa,magiamgia;

    public String getTenGiamGIa() {
        return tenGiamGIa;
    }

    public void setTenGiamGIa(String tenGiamGIa) {
        this.tenGiamGIa = tenGiamGIa;
    }

    public String getMagiamgia() {
        return magiamgia;
    }

    public void setMagiamgia(String magiamgia) {
        this.magiamgia = magiamgia;
    }

    public int getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(int mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public giamGiamodel(String tenGiamGIa, String magiamgia, int mucGiamGia) {
        this.tenGiamGIa = tenGiamGIa;
        this.magiamgia = magiamgia;
        this.mucGiamGia = mucGiamGia;
    }

    public giamGiamodel() {
    }
    private int mucGiamGia;
}
