/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhuyenMai;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhuyenMaiRepository {

    public List<KhuyenMai> layDSKM() throws SQLException {
        List<KhuyenMai> khuyenMais = new ArrayList<>();
        Connection conn = DBConnection.openDbConnection();
        String sql = "Select * from KhuyenMai";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Integer MaKhuyenMai = rs.getInt(1);
            String TenKhuyenMai = rs.getString(2);
            String NgayBatDau = rs.getString(3);
            String NgayKetThuc = rs.getString(4);
            Integer GiamGia = rs.getInt(5);
            Integer TrangThai = rs.getInt(6);

            KhuyenMai khuyenMai = new KhuyenMai(MaKhuyenMai, TenKhuyenMai, NgayBatDau, NgayKetThuc, GiamGia, TrangThai);
            khuyenMais.add(khuyenMai);
        }
        return khuyenMais;
    }

    public boolean ThemKhuyenMai(KhuyenMai khuyenMai) throws SQLException {
        int index = 0;
        try {
            Connection connection = DBConnection.openDbConnection();
            String sql = "Insert into KhuyenMai (TenKhuyenMai,NgayBatDau,NgayKetThuc,GiamGia,TrangThai) values(?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, khuyenMai.getTenKhuyenMai());
            statement.setString(2, khuyenMai.getNgayBatDau());
            statement.setString(3, khuyenMai.getNgayKetThuc());
            statement.setInt(4, khuyenMai.getGiamGia());
            statement.setInt(5, khuyenMai.getTrangThai());

            index = statement.executeUpdate();

        } catch (Exception e) {
        }
        if (index == 0) {
            return false;
        } else {
            return true;
        }
        
    }

    public boolean XoaKhuyenMai(String MaKhuyenMai) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
        String sql = "Delete form KhachHang where MaKhuyenMai = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, MaKhuyenMai);

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean SuaKhuyenMai(KhuyenMai khuyenMai) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
String sql = "Update KhuyenMai set TenKhuyenMai = ? ,NgayBatDau = ? ,NgayKetThuc = ? ,GiamGia = ? ,TrangThai = ? where MaKhuyenMai = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, khuyenMai.getTenKhuyenMai());
        statement.setString(2, khuyenMai.getNgayBatDau());
        statement.setString(3, khuyenMai.getNgayKetThuc());
        statement.setInt(4, khuyenMai.getGiamGia());
        statement.setInt(5, khuyenMai.getTrangThai());
        statement.setInt(6, khuyenMai.getMaKhuyenMai());

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }

    }
}