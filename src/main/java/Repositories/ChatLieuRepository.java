package Repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Utilities.DBConnection;
import java.util.ArrayList;
import DomainModels.ChatLieu;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class ChatLieuRepository {
    Session session = DBConnection.getFACTORY().openSession();

    public ArrayList<ChatLieu> getList() {
        Query q = session.createQuery("From ChatLieu");// truy vấn trên entity(HQL)
        ArrayList<ChatLieu> list = (ArrayList<ChatLieu>) q.getResultList();
        return list;
    }
    
    public String themChatLieu(ChatLieu cl){
          try ( Session ss = DBConnection.getFACTORY().openSession()) {
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.save(cl);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Thêm không thành công";
            }
        }
        return "Thêm thành công nhé!";
    }
    
    public String suaChatLieu(ChatLieu cl){
          try ( Session ss = DBConnection.getFACTORY().openSession()) {
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.update(cl);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Thêm không thành công";
            }
        }
        return "Thêm thành công nhé!";
    }
    
    public String maChatLieu(String ten){
        String name;
        try ( Session ss = DBConnection.getFACTORY().openSession()) {
            String sql = "select MaChatLieu from ChatLieu where TenChatLieu =: MaCTSP";
            javax.persistence.Query qr = ss.createQuery(sql);
            qr.setParameter("MaCTSP", ten);
            name = String.valueOf(qr.getSingleResult());
        }
        return name;
    }
}
