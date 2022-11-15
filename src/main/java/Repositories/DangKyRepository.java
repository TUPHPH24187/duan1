/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NguoiDung;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author concu
 */
public class DangKyRepository {
    public List<NguoiDung> layDSND() throws SQLException {
        List<NguoiDung> nguoiDungs = new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "Select * from NguoiDung";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            
            String TenDangNhap = rs.getString(1);
            String MatKhau = rs.getString(2);
            String VaiTro = rs.getString(3);
      
            NguoiDung nguoiDung = new NguoiDung(TenDangNhap, MatKhau, VaiTro);
            nguoiDungs.add(nguoiDung);
        }
        return nguoiDungs;
    }
    
    
    public boolean ThemNguoiDung(NguoiDung nguoiDung) throws SQLException {
        int index = 0;
        try {
            Connection connection = DBConnection.openDbConnection();
            String sql = "Insert into NguoiDung (TenDangNhap,MatKhau,VaiTro) values(?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nguoiDung.getTenDangNhap());
            statement.setString(2, nguoiDung.getMatKhau());
            statement.setString(3, nguoiDung.getVaiTro());
   
            index = statement.executeUpdate();

        } catch (Exception e) {
        }
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean XoaNguoiDung(String tenDangNhap) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
        String sql = "Delete from NguoiDung where TenDangNhap = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, tenDangNhap);

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean SuaNguoiDung(NguoiDung nguoiDung) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
        String sql = "Update NguoiDung set TenDangNhap = ? ,MatKhau = ? , VaiTro = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, nguoiDung.getTenDangNhap());       
        statement.setString(2, nguoiDung.getMatKhau());
        statement.setString(3, nguoiDung.getVaiTro());
        

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;

        } else {
            return true;
        }
    }
}
