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
public class ChatLieu implements Serializable {

    private Integer MaChatLieu;

    private String TenChatLieu;

    public ChatLieu() {
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

    public ChatLieu(Integer MaChatLieu, String TenChatLieu) {
        this.MaChatLieu = MaChatLieu;
        this.TenChatLieu = TenChatLieu;
    }

    @Override
    public String toString() {
        return TenChatLieu;
    }

}
