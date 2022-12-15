/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDonChiTietModel;
import DomainModels.TraHang;
import Utilities.DBConnection;
import ViewModels.HoaDonChiTiet;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class TraHangRepositori {

    public List<TraHang> layDSKH() throws SQLException {
        List<TraHang> trahang = new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "Select * from TraHang";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            int maHD = rs.getInt(2);
            String tenkhachhang = rs.getString(1);
            BigDecimal tienDaThanhToan = rs.getBigDecimal(3);
            String ngayTraHang = rs.getString(4);
            String tongTien = rs.getString(5);

            TraHang traHang = new TraHang(tenkhachhang, maHD, tienDaThanhToan, ngayTraHang, tongTien);
            trahang.add(traHang);
        }
        return trahang;
    }
 public List<HoaDonChiTiet> layDLHD() throws SQLException {
        List<HoaDonChiTiet> hoaDonChiTiets= new ArrayList<>();
        Connection connection = DBConnection.openDbConnection();
        String sql = "select MaHD,HoaDonChiTiet.MaCTSP,HoaDonChiTiet.MaKhuyenMai,HoaDonChiTiet.SoLuong,GiaBan,HoaDonChiTiet.TrangThai,HoaDonChiTiet.MaHD,  sum( ((giaban*(100 - khuyenmai.GiamGia))/100)*HoaDonChiTiet.SoLuong) from hoadonchitiet join chitietsanpham on hoadonchitiet.maCTSP = chitietsanpham.MaCTSP\n" +
"                              						join khuyenmai on hoadonchitiet.makhuyenmai = khuyenmai.makhuyenmai \n" +
"                         						join kichthuoc on chitietsanpham.makichthuoc = kichthuoc.makichthuoc \n" +
"          									\n" +
"               									group by HoaDonChiTiet.MaHD,HoaDonChiTiet.MaCTSP,HoaDonChiTiet.MaKhuyenMai,HoaDonChiTiet.SoLuong,ChiTietSanPham.GiaBan,HoaDonChiTiet.TrangThai";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            int maHDCT = rs.getInt(1);
            int maHD = rs.getInt(2);
            int maCTSP = rs.getInt(3);
            int maKM = rs.getInt(4);
            int soLuong = rs.getInt(5);
            BigDecimal gia = rs.getBigDecimal(6);
            BigDecimal thanhTien = rs.getBigDecimal(7);
            int trangThai = rs.getInt(8);

            HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet(maHD, maHDCT, maCTSP, maKM, soLuong, gia, thanhTien, trangThai);
            hoaDonChiTiets.add(hoaDonChiTiet);
        }
        return hoaDonChiTiets;
    }
    public boolean Sua(TraHang th, String MaHD) {
        Connection con = DBConnection.openDbConnection();
        String sql = "UPDATE [dbo].[TraHang]\n"
                + "   SET [TenKH] = ?\n"
                + "      ,[TienDTT] = ?\n"
                + "      ,[NgayTH] = ?\n"
                + "      ,[TongTien] = ?\n"
                + " WHERE MaHD = ?";

        try ( PreparedStatement pr = con.prepareStatement(sql)) {
            pr.setString(1, th.getTenkhachhang());
            pr.setBigDecimal(2, th.getTienDaThanhToan());
            pr.setString(3, th.getNgayTraHang());
            pr.setString(4, th.getTongTien());
            pr.setString(5, MaHD);
            pr.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
