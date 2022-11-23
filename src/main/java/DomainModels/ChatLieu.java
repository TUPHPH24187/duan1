package DomainModels;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author concu
 */
@Entity
@Table(name = "ChatLieu")
public class ChatLieu implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaChatLieu")
    private Integer MaChatLieu;
    
    @Column(name = "TenChatLieu")
    private String TenChatLieu;
    
    @Column(name = "TrangThai")
    private int trangThai;
    
    @OneToMany(mappedBy = "chatLieu", fetch = FetchType.LAZY)
    private List<ChiTietSanPham> listChiTietSanPham;

    public ChatLieu() {
    }

    public ChatLieu(Integer MaChatLieu, String TenChatLieu, int trangThai, List<ChiTietSanPham> listChiTietSanPham) {
        this.MaChatLieu = MaChatLieu;
        this.TenChatLieu = TenChatLieu;
        this.trangThai = trangThai;
        this.listChiTietSanPham = listChiTietSanPham;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    

    public Integer getMaChatLieu() {
        return MaChatLieu;
    }

    public void setMaChatLieu(Integer MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    public String getTenChatLieu() {
        return TenChatLieu;
    }

    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }

    public List<ChiTietSanPham> getListChiTietSanPham() {
        return listChiTietSanPham;
    }

    public void setListChiTietSanPham(List<ChiTietSanPham> listChiTietSanPham) {
        this.listChiTietSanPham = listChiTietSanPham;
    }

    

    
    @Override
    public String toString() {
        return TenChatLieu;
    }
    
    
    
}
