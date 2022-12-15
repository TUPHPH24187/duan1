package Repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Utilities.DBConnection;
import java.util.ArrayList;
import DomainModels.XuatXu;
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
public class XuatXuRepository {
    Session session = DBConnection.getFACTORY().openSession();

    public ArrayList<XuatXu> getList() {
        Query q = session.createQuery("From XuatXu");// truy vấn trên entity(HQL)
        ArrayList<XuatXu> list = (ArrayList<XuatXu>) q.getResultList();
        return list;
    }
    
    public Boolean add(XuatXu xx) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = DBConnection.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(xx);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<XuatXu> layXuatXu() throws SQLException {
        List<XuatXu> ChatLieus = new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "Select * from XuatXu where MaXuatXu = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Integer MaXX = rs.getInt(1);
            
            XuatXu xx = new XuatXu(MaXX);
            ChatLieus.add(xx);
        }
        return ChatLieus;
    }
    
    
    public boolean XoaXuatXu(Integer MaXuatXu) throws SQLException{
        Connection connection = DBConnection.openDbConnection();
        String sql = "Delete from XuatXu where MaXuatXu = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, MaXuatXu);

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }
    
}
