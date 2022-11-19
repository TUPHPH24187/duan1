/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.ChatLieu;
import DomainModels.KichThuoc;
import DomainModels.XuatXu;
import java.io.Serializable;
import java.math.BigDecimal;



/**
 *
 * @author concu
 */

public class ChiTietSanPham implements Serializable {

    
    private Integer MaCTSP;

    
    private String TenCTSP;

    
    private Integer SoLuong;

   
    private BigDecimal Gia;

    
    private BigDecimal GiamGia;

    
    private int TrangThai;

    
    private KichThuoc kichThuoc;

    
    private XuatXu xuatXu;

    
    private ChatLieu chatLieu;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(Integer MaCTSP, String TenCTSP, Integer SoLuong, BigDecimal Gia, BigDecimal GiamGia, int TrangThai, KichThuoc kichThuoc, XuatXu xuatXu, ChatLieu chatLieu) {

        this.MaCTSP = MaCTSP;
        this.TenCTSP = TenCTSP;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.GiamGia = GiamGia;
        this.TrangThai = TrangThai;
        this.kichThuoc = kichThuoc;
        this.xuatXu = xuatXu;
        this.chatLieu = chatLieu;
    }

    public Integer getMaCTSP() {
        return MaCTSP;
    }

    public void setMaCTSP(Integer MaCTSP) {
        this.MaCTSP = MaCTSP;
    }

    public String getTenCTSP() {
        return TenCTSP;
    }

    public void setTenCTSP(String TenCTSP) {
        this.TenCTSP = TenCTSP;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getGia() {
        return Gia;
    }

    public void setGia(BigDecimal Gia) {
        this.Gia = Gia;
    }

    public BigDecimal getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(BigDecimal GiamGia) {
        this.GiamGia = GiamGia;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public KichThuoc getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(KichThuoc kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public XuatXu getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(XuatXu xuatXu) {
        this.xuatXu = xuatXu;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "MaCTSP=" + MaCTSP + ", TenCTSP=" + TenCTSP + ", SoLuong=" + SoLuong + ", Gia=" + Gia + ", GiamGia=" + GiamGia + ", TrangThai=" + TrangThai + ", kichThuoc=" + kichThuoc + ", xuatXu=" + xuatXu + ", chatLieu=" + chatLieu + '}';
    }

}
