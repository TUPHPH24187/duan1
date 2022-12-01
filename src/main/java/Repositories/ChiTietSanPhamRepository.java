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
    
     SessionFactory sf = DBConnection.getFACTORY();
    
     public ChiTietSanPham find(Integer MaCTSP) {
         try {
             sf.getCurrentSession().beginTransaction();
         
         return (ChiTietSanPham) sf.getCurrentSession().get(ChiTietSanPham.class, MaCTSP);
         } catch (Exception e) {
             return null;
         }
     }
    
     public Boolean update(ChiTietSanPham ctsp) {
        
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().update(ctsp);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
       
    }
     
     
     
     public List<SanPhamModel> timKiemSP(String maSP) throws SQLException {
        List<SanPhamModel> SP = new ArrayList();
        String sql = "select MaCTSP, TenCTSP , TenChatLieu, TenKichThuoc,TenXuatXu, GiaBan,GiaNhap,GiamGia,soLuong,TrangThai from ChiTietSanPham join ChatLieu on ChiTietSanPham.MaChatLieu = ChatLieu.MaChatLieu\n"
                + "											join XuatXu on ChiTietSanPham.MaXuatXu = XuatXu.MaXuatXu\n"
                + "											join KichThuoc on ChiTietSanPham.MaKichThuoc = KichThuoc.MaKichThuoc\n"
                + "											where MaCTSP = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maSP);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String masp = rs.getString(1);
            String tensp = rs.getString(2);
            String chatLieu = rs.getString(3);
            String kichThuoc = rs.getString(4);
            String xuatXu = rs.getString(5);
            double giaBan = rs.getDouble(6);
            double giaNhap = rs.getDouble(7);
            double giamGia = rs.getDouble(8);       
            int soLuong = rs.getInt(9);
            int trangThai = rs.getInt(10);
            
            SanPhamModel san = new SanPhamModel();
            
            san.setChatLieu(chatLieu);
            san.setGiaBan(giaBan);
            san.setKichThuoc(kichThuoc);
            san.setMaSP(masp);
            san.setTenSP(tensp);
            san.setXuatXu(xuatXu);
            san.setSoLuong(soLuong);
            san.setGiaNhap(giaNhap);
            san.setGiamGia(giamGia);
            san.setTrangThai(trangThai);
            SP.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return SP;
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
