/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChatLieu;
import Repositories.ChatLieuRepository;
import Utilities.DBConnection;
import ViewModels.ChatLieuView;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author concu
 */
public class ChatLieuService {
    ChatLieuRepository CLRepo = new ChatLieuRepository();
    
    public String AddChatLieu(ChatLieu cl) {
        if (CLRepo.add(cl)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }
    
    
}
