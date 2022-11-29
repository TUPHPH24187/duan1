/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;




import Utilities.DBConnection;
import DomainModels.NhanVien;
import Views.ManHinhHeThongBanGiay;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Date;
import javax.persistence.Query;

/**
 *
 * @author concu
 */
public class NhanVienRepository {

    public List<NhanVien> layNhanViens() throws SQLException{
        List<NhanVien> nhanViens = new ArrayList<>();
        Connection conn = DBConnection.openDbConnection();
        String sql = "Select * from NhanVien";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            Integer MaNV = rs.getInt(1);
            String TenNV = rs.getString(2);
            String NgaySinh = rs.getString(3);
            Integer GioiTinh = rs.getInt(4);
            String SDT = rs.getString(5);
            String DiaChi = rs.getString(6);
            String Email = rs.getString(7);
            String MatKhau = rs.getString(8);
            String ChucVu = rs.getString(9);
            Integer TrangThai = rs.getInt(10);
            
            NhanVien nhanVien = new NhanVien( MaNV,TenNV, NgaySinh, GioiTinh, SDT, DiaChi, Email,MatKhau, ChucVu, TrangThai);
            nhanViens.add(nhanVien);
            
        }
        return nhanViens;
    }
         
     public boolean ThemNhanVien(NhanVien nhanVien) throws SQLException {
        int index = 0;
        try {
            Connection connection = DBConnection.openDbConnection();
            String sql = "Insert into NhanVien (TenNV,NgaySinh,GioiTinh,SoDienThoai,DiaChi,Email,MatKhau,ChucVu,TrangThai) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
         
            statement.setString(1, nhanVien.getTenNV());
            statement.setString(2,  nhanVien.getNgaySinh());
            statement.setInt(3, nhanVien.getGioiTinh());
            statement.setString(4, nhanVien.getSDT());
            statement.setString(5, nhanVien.getDiaChi());
            statement.setString(6, nhanVien.getEmail());
            statement.setString(7, nhanVien.getMatKhau());
            statement.setString(8, nhanVien.getChucVu());
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
     
     public boolean SuaNhanVien(NhanVien nhanVien,Integer maNV) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
        String sql = "Update NhanVien set TenNV = ? ,NgaySinh = ?,GioiTinh = ?  ,SoDienThoai = ? , DiaChi = ?,Email = ?,MatKhau = ? ,ChucVu = ? ,TrangThai = ? where MaNV = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(10, nhanVien.getMaNV());
        statement.setString(1, nhanVien.getTenNV());
        statement.setString(2, nhanVien.getNgaySinh());
        statement.setInt(3, nhanVien.getGioiTinh());
        statement.setString(4, nhanVien.getSDT());
        statement.setString(5, nhanVien.getDiaChi());
        statement.setString(6, nhanVien.getEmail());
        statement.setString(7, nhanVien.getMatKhau());
        statement.setString(8, nhanVien.getChucVu());
        statement.setInt(9, nhanVien.getTrangThai());
        

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }
   
     
     
    public boolean XoaNhanVien(Integer maNV) throws SQLException {
         Connection connection = DBConnection.openDbConnection();
        String sql = "Delete from NhanVien where MaNV = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, maNV);
        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public NhanVien checkLogin(String tenDangNhap, String matKhau) 
        throws Exception {
        String sql = "select Email, MatKhau , ChucVu from NhanVien " 
                +" where Email=? and matKhau = ?";

        try ( Connection con = DBConnection.openDbConnection();  
                PreparedStatement pst = con.prepareStatement(sql);
                
            ){
            pst.setString(1, tenDangNhap);
            pst.setString(2, matKhau);

            try ( ResultSet rs = pst.executeQuery();) {
                if (rs.next()) {
                    NhanVien nv = new NhanVien();
                    nv.setEmail(tenDangNhap);
                    nv.setChucVu(rs.getString("chucvu"));
                    return nv;
                }
            }
        }

        return null;
    }
    
    
    public String passNhanVien(String user,String email){
          String pass = null;
        String err = null;
        try ( org.hibernate.Session ss = DBConnection.getFACTORY().openSession()) {
            String ten = "select MatKhau from NhanVien where MaNV =: MaNV and Email =:email ";
            Query qr = ss.createQuery(ten);
            qr.setParameter("MaNV", user);
            qr.setParameter("email", email);
            pass = (String) qr.getSingleResult();
        } catch (Exception e) {
            err = "Rỗng";
            return err;
        }

        return pass;
    }
}
