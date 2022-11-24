package Repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Utilities.DBConnection;
import java.util.ArrayList;
import DomainModels.ChatLieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
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
    
    public Boolean add(ChatLieu cl) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = DBConnection.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(cl);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<ChatLieu> layChatLieu() throws SQLException {
        List<ChatLieu> ChatLieus = new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "Select * from ChatLieu where MaChatLieu = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Integer MaCL = rs.getInt(1);
            
            ChatLieu cl = new ChatLieu(MaCL);
            ChatLieus.add(cl);
        }
        return ChatLieus;
    }
    
    
    public boolean XoaChatLieu(Integer MaChatLieu) throws SQLException{
        Connection connection = DBConnection.openDbConnection();
        String sql = "Delete from ChatLieu where MaChatLieu = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, MaChatLieu);

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }
    
}
