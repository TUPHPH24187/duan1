/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.ChatLieu;
import DomainModels.KichThuoc;
import DomainModels.XuatXu;
import java.math.BigDecimal;

/**
 *
 * @author concu
 */
public class SanPhamView {
    private String MaCTSP;

    
    private String TenCTSP,SoLuong,GiaBan,GiaNhap,GiamGia,TrangThai;

    
    

    public SanPhamView() {
    }

    public SanPhamView(String MaCTSP, String TenCTSP, String SoLuong, String GiaBan, String GiaNhap, String GiamGia, String TrangThai) {
        this.MaCTSP = MaCTSP;
        this.TenCTSP = TenCTSP;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.GiaNhap = GiaNhap;
        this.GiamGia = GiamGia;
        this.TrangThai = TrangThai;
    }

    public String getMaCTSP() {
        return MaCTSP;
    }

    public void setMaCTSP(String MaCTSP) {
        this.MaCTSP = MaCTSP;
    }

    public String getTenCTSP() {
        return TenCTSP;
    }

    public void setTenCTSP(String TenCTSP) {
        this.TenCTSP = TenCTSP;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(String GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(String GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public String getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(String GiamGia) {
        this.GiamGia = GiamGia;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

   
    
    
    
}
