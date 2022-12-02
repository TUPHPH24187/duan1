/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADM
 */
public class KhachHangRepository {
ăăă
    public List<KhachHang> layDSKH() throws SQLException {
        List<KhachHang> khachHangs = new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "Select * from KhachHang";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            String maKH = rs.getString(1);
            String hoTen = rs.getString(2);
            String ngaySinh = rs.getString(3);
            String gioiTinh = rs.getString(4);
            String sDT = rs.getString(5);
            String diaChi = rs.getString(6);
            String trangThai = rs.getString(7);

            KhachHang khachHang = new KhachHang(maKH, hoTen, ngaySinh, gioiTinh, sDT, diaChi, trangThai);
            khachHangs.add(khachHang);
        }
        return khachHangs;
    }

    public boolean ThemKhachHang(KhachHang khachHang) throws SQLException {
        int index = 0;
        try {
            Connection connection = DBConnection.openDbConnection();
            String sql = "Insert into KhachHang (TenKH,NgaySinh,GioiTinh,SoDienThoai,DiaChi,TrangThai) values(?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, khachHang.getHoTen());
            statement.setString(2, khachHang.getNgaySinh());
            statement.setString(3, khachHang.getGioiTinh());
            statement.setString(4, khachHang.getsDT());
            statement.setString(5, khachHang.getDiaChi());
            statement.setString(6, khachHang.getTrangThai());

            index = statement.executeUpdate();

        } catch (Exception e) {
        }
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean XoaKhachHang(String maKH) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
        String sql = "Delete from KhachHang where MaKH = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, maKH);

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean SuaKhachHang(KhachHang khachHang) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
        String sql = "Update KhachHang set TenKH = ? ,NgaySinh = ? , GioiTinh = ? , SoDienThoai = ? ,DiaChi = ?,TrangThai = ? where MaKH = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, khachHang.getHoTen());       
        statement.setString(2, khachHang.getNgaySinh());
        statement.setString(3, khachHang.getGioiTinh());
        statement.setString(4, khachHang.getsDT());   
        statement.setString(5, khachHang.getDiaChi()); 
        statement.setString(6, khachHang.getTrangThai()); 
        statement.setString(7, khachHang.getMaKH());

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;

        } else {
            return true;
        }
    }
}
