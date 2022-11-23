/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author concu
 */
public class ChatLieuView {
    private Integer MaChatLieu;
    
    
    private String TenChatLieu;
    
    
    private int trangThai;

    public ChatLieuView(Integer MaChatLieu, String TenChatLieu, int trangThai) {
        this.MaChatLieu = MaChatLieu;
        this.TenChatLieu = TenChatLieu;
        this.trangThai = trangThai;
    }

    public ChatLieuView() {
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
