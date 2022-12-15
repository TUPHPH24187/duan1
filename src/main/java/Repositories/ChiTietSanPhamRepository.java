package Repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Utilities.DBConnection;
import Utilities.DBConnection;
import java.util.ArrayList;
import DomainModels.ChiTietSanPham;
import DomainModels.SanPhamModel;
import ViewModels.SanPhamView;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class ChiTietSanPhamRepository {

     private final Session ss = DBConnection.getFACTORY().openSession();
     
    public ArrayList<ChiTietSanPham> getList() {
        Query q = ss.createQuery("From ChiTietSanPham");// truy vấn trên entity(HQL)
        ArrayList<ChiTietSanPham> list = (ArrayList<ChiTietSanPham>) q.getResultList();
        return list;
    }

    public Boolean add(ChiTietSanPham ctsp) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = DBConnection.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(ctsp);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
     
    ////////////////////////////////////////////////////////////////////////////////////
   
     public boolean SuaSanPham(SanPhamView sp) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
        String sql = "Update Chitietsanpham set TenCTSP = ? ,SoLuong = ? , GiaBan = ? , GiaNhap = ? ,GiamGia = ?,TrangThai = ? where MaCTSP = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, sp.getTenCTSP());       
        statement.setString(2, sp.getSoLuong());
        statement.setString(3, sp.getGiaBan());
        statement.setString(4, sp.getGiaNhap());
        statement.setString(5, sp.getGiamGia());
        statement.setString(6, sp.getTrangThai()); 
        statement.setString(7, sp.getMaCTSP());

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;

        } else {
            return true;
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    
    
    
    public List<ChiTietSanPham> layDSSP() throws SQLException {
        List<ChiTietSanPham> chiTietSanPhams = new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "Select * from chiTietSanPham where MaCTSP = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Integer MaCTSP = rs.getInt(1);
            

            ChiTietSanPham chiTietSanPham = new ChiTietSanPham(MaCTSP);
            chiTietSanPhams.add(chiTietSanPham);
        }
        return chiTietSanPhams;
    }
    
    
    public boolean XoaSanPham(Integer MaCTSP) throws SQLException{
        Connection connection = DBConnection.openDbConnection();
        String sql = "Delete from ChiTietSanPham where MaCTSP = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, MaCTSP);

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }
    
  
}
