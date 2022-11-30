/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;

/**
 *
 * @author DELL
 */
public class HoaDonMode {

    
    private String mKH,maNV, ngayTao,thanhToan, ghiChu;
    private int trangThai;

    public HoaDonMode() {
    }

    public HoaDonMode(String mKH, String maNV, String ngayTao, String thanhToan, String ghiChu, int trangThai) {
        this.mKH = mKH;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
        this.thanhToan = thanhToan;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public String getmKH() {
        return mKH;
    }

    public void setmKH(String mKH) {
        this.mKH = mKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(String thanhToan) {
        this.thanhToan = thanhToan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
     public String TrangThaiHD() {
        if (trangThai == 1) {
            return "Đang thanh toán";
        }
        if (trangThai == 2) {
            return "Thanh toán thành công";
        }
        else{
            return  "Hủy";
        }
    }

    


    

   
}
