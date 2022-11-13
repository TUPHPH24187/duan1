/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;



import DomainModels.ChucVu;
import DomainModels.KhachHang;
import Utilities.DBConnection;
import DomainModels.NhanVien;
import Views.ManHinhHeThongBanGiay;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author concu
 */
public class NhanVienRepository {

    private ChucVu chucVu;
    public List<NhanVien> layNhanViens() throws SQLException{
        List<NhanVien> nhanViens = new ArrayList<>();
        Connection conn = DBConnection.openDbConnection();
        String sql = "Select * from NhanVien";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            Integer Ma = rs.getInt(1);
            String Ten = rs.getString(2);
            String NgaySinh = rs.getString(3);
            Integer GioiTinh = rs.getInt(4);
            String Sdt = rs.getString(5);
            String DiaChi = rs.getString(6);
            String Email = rs.getString(7);
            String MatKhau = rs.getString(8);
            Integer TrangThai = rs.getInt(9);
            String ChucVu = rs.getString(10);
                
            
            NhanVien nhanVien = new NhanVien(Ma, Ten, NgaySinh, GioiTinh, Sdt, DiaChi, Email, MatKhau, TrangThai, chucVu);
            nhanViens.add(nhanVien);
            
        }
        return nhanViens;
    }
         
     public boolean ThemNhanVien(NhanVien nhanVien) throws SQLException {
        int index = 0;
        try {
            Connection connection = DBConnection.openDbConnection();
            String sql = "Insert into NhanVien (MaNV,TenNV,NgaySinh,GioiTinh,SoDienThoai,DiaChi,Email,MatKhau,TrangThai) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, nhanVien.getMaNV());
            statement.setString(2, nhanVien.getTenNV());
            statement.setString(3, nhanVien.getNgaySinh());
            statement.setInt(4, nhanVien.getGioiTinh());
            statement.setString(5, nhanVien.getSoDienThoai());
            statement.setString(6, nhanVien.getDiaChi());
            statement.setString(7, nhanVien.getEmail());
            statement.setString(8, nhanVien.getMatKhau());
            statement.setInt(9, nhanVien.getTrangThai());

            index = statement.executeUpdate();

        } catch (Exception e) {
        }
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }
    
}
