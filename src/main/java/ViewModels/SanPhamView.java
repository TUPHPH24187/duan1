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
    private Integer MaCTSP;

    
    private String TenCTSP;

    
    private Integer SoLuong;

    private BigDecimal Gia;

    
    private BigDecimal GiamGia;

    
    private int TrangThai;

    
    private KichThuoc kichThuoc;

    
    private XuatXu XuatXu;

    
    private ChatLieu ChatLieu;

    public SanPhamView() {
    }

    public SanPhamView(Integer MaCTSP, String TenCTSP, Integer SoLuong, BigDecimal Gia, BigDecimal GiamGia, int TrangThai, KichThuoc kichThuoc, XuatXu XuatXu, ChatLieu ChatLieu) {
        this.MaCTSP = MaCTSP;
        this.TenCTSP = TenCTSP;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.GiamGia = GiamGia;
        this.TrangThai = TrangThai;
        this.kichThuoc = kichThuoc;
        this.XuatXu = XuatXu;
        this.ChatLieu = ChatLieu;
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
        return XuatXu;
    }

    public void setXuatXu(XuatXu XuatXu) {
        this.XuatXu = XuatXu;
    }

    public ChatLieu getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(ChatLieu ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    
    
    
}
