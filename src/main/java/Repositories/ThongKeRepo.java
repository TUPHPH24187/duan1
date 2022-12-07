/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;


import DomainModels.ThongKe;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ThongKeRepo {
    public List<ThongKe> thongKeTong(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select sum(HoaDonChiTiet.SoLuong),sum((giaban*(100- khuyenmai.Mucgiamgia))/100) as 'Giadagiam' from HoaDon join HoaDonChiTiet on HoaDon.MaHD = HoaDonChiTiet.MaHD \n"
                + "					 join KhuyenMai on HoaDonChiTiet.MaKhuyenMai = KhuyenMai.MaKhuyenMai\n"
                + "					 join ChiTietSanPham on HoaDonChiTiet.MaCTSP = ChiTietSanPham.MaCTSP\n"
                + "					 where NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);
            double tongdanhthu = rs.getDouble(2);
            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);
            san.setDoanhThu(tongdanhthu);
            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKele(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select ChiTietSanPham.MaCTSP, TenCTSP,sum(HoaDonChiTiet.SoLuong),ChiTietSanPham.SoLuong,sum((giaban*(100- khuyenmai.Mucgiamgia))/100) as 'Giadagiam' from HoaDon join HoaDonChiTiet on HoaDon.MaHD = HoaDonChiTiet.MaHD \n"
                + "					 join KhuyenMai on HoaDonChiTiet.MaKhuyenMai = KhuyenMai.MaKhuyenMai\n"
                + "					 join ChiTietSanPham on HoaDonChiTiet.MaCTSP = ChiTietSanPham.MaCTSP\n"
                + "					 where NgayKhoiTao >= ? and NgayKhoiTao <= ?\n"
                + "					 group by ChiTietSanPham.MaCTSP, TenCTSP,ChiTietSanPham.SoLuong";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maSP = rs.getString(1);
            String tenSP = rs.getString(2);
            int tongSLBan = rs.getInt(3);
            int tongSLton = rs.getInt(4);
            double tongdanhthu = rs.getDouble(5);
            ThongKe san = new ThongKe();
            san.setMaSP(maSP);
            san.setTenSP(tenSP);
            san.setSoLuongTon(tongSLton);
            san.setSoLuongBan(tongSLBan);
            san.setDoanhThu(tongdanhthu);
            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeletheoSP(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select ChiTietSanPham.MaCTSP, TenCTSP,sum(HoaDonChiTiet.SoLuong),ChiTietSanPham.SoLuong,sum((giaban*(100- khuyenmai.Mucgiamgia))/100) as 'Giadagiam' from HoaDon join HoaDonChiTiet on HoaDon.MaHD = HoaDonChiTiet.MaHD \n"
                + "					 join KhuyenMai on HoaDonChiTiet.MaKhuyenMai = KhuyenMai.MaKhuyenMai\n"
                + "					 join ChiTietSanPham on HoaDonChiTiet.MaCTSP = ChiTietSanPham.MaCTSP\n"
                + "					 where NgayKhoiTao >= ? and NgayKhoiTao <= ? \n"
                + "					 group by ChiTietSanPham.MaCTSP, TenCTSP,ChiTietSanPham.SoLuong\n"
                + "					 order by sum(HoaDonChiTiet.SoLuong) desc";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maSP = rs.getString(1);
            String tenSP = rs.getString(2);
            int tongSLBan = rs.getInt(3);
            int tongSLton = rs.getInt(4);
            double tongdanhthu = rs.getDouble(5);
            ThongKe san = new ThongKe();
            san.setMaSP(maSP);
            san.setTenSP(tenSP);
            san.setSoLuongTon(tongSLton);
            san.setSoLuongBan(tongSLBan);
            san.setDoanhThu(tongdanhthu);
            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeletheoDT(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select ChiTietSanPham.MaCTSP, TenCTSP,sum(HoaDonChiTiet.SoLuong),ChiTietSanPham.SoLuong,sum((giaban*(100- khuyenmai.Mucgiamgia))/100) as 'Giadagiam' from HoaDon join HoaDonChiTiet on HoaDon.MaHD = HoaDonChiTiet.MaHD \n"
                + "					 join KhuyenMai on HoaDonChiTiet.MaKhuyenMai = KhuyenMai.MaKhuyenMai\n"
                + "					 join ChiTietSanPham on HoaDonChiTiet.MaCTSP = ChiTietSanPham.MaCTSP\n"
                + "					 where NgayKhoiTao >= ? and NgayKhoiTao <= ? \n"
                + "					 group by ChiTietSanPham.MaCTSP, TenCTSP,ChiTietSanPham.SoLuong\n"
                + "					 order by sum((giaban*(100- khuyenmai.Mucgiamgia))/100) desc";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maSP = rs.getString(1);
            String tenSP = rs.getString(2);
            int tongSLBan = rs.getInt(3);
            int tongSLton = rs.getInt(4);
            double tongdanhthu = rs.getDouble(5);
            ThongKe san = new ThongKe();
            san.setMaSP(maSP);
            san.setTenSP(tenSP);
            san.setSoLuongTon(tongSLton);
            san.setSoLuongBan(tongSLBan);
            san.setDoanhThu(tongdanhthu);
            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeTuDau() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select sum(HoaDonChiTiet.SoLuong),sum((giaban*(100- khuyenmai.Mucgiamgia))/100) as 'Giadagiam' from HoaDon join HoaDonChiTiet on HoaDon.MaHD = HoaDonChiTiet.MaHD \n"
                + "					 join KhuyenMai on HoaDonChiTiet.MaKhuyenMai = KhuyenMai.MaKhuyenMai\n"
                + "					 join ChiTietSanPham on HoaDonChiTiet.MaCTSP = ChiTietSanPham.MaCTSP";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);
            double tongdanhthu = rs.getDouble(2);
            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);
            san.setDoanhThu(tongdanhthu);
            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKehoanthanh() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(TrangThai) from HoaDon where TrangThai = 2";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeDangThanhToan() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(TrangThai) from HoaDon where TrangThai = 1";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeHuy() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(TrangThai) from HoaDon where TrangThai = 3";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeTienMat() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(MaHTTT) from HoaDon where MaHTTT = 1";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeQuetThe() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(MaHTTT) from HoaDon where MaHTTT = 2";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeChuyenKhoan() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(MaHTTT) from HoaDon where MaHTTT = 3";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeKHMoi() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "Select COUNT(MaKhuyenMai) from HoaDonChiTiet where MaKhuyenMai = 2";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeKHTQ() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "Select COUNT(MaKhuyenMai) from HoaDonChiTiet where MaKhuyenMai = 3";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeCMSN() throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "Select COUNT(MaKhuyenMai) from HoaDonChiTiet where MaKhuyenMai = 4";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKehoanthanhTheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(TrangThai) from HoaDon where TrangThai = 2 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeDangThanhToanTheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(TrangThai) from HoaDon where TrangThai = 1 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeHuyTheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(TrangThai) from HoaDon where TrangThai = 3 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeTienMatTheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(MaHTTT) from HoaDon where MaHTTT = 1 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeQuetTheTheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(MaHTTT) from HoaDon where MaHTTT = 2 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeChuyenKhoantheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(MaHTTT) from HoaDon where MaHTTT = 3 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeKHMoiTheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(HoaDonChiTiet.MaKhuyenMai) from HoaDon join HoaDonChiTiet on HoaDon.MaHD = HoaDonChiTiet.MaHD  where HoaDonChiTiet.MaKhuyenMai = 2 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeKHTQTheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(HoaDonChiTiet.MaKhuyenMai) from HoaDon join HoaDonChiTiet on HoaDon.MaHD = HoaDonChiTiet.MaHD  where HoaDonChiTiet.MaKhuyenMai = 3 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    }

    public List<ThongKe> thongKeCMSNTheoNgay(String ngayBD, String ngayKT) throws SQLException {
        List<ThongKe> TK = new ArrayList();
        String sql = "select COUNT(HoaDonChiTiet.MaKhuyenMai) from HoaDon join HoaDonChiTiet on HoaDon.MaHD = HoaDonChiTiet.MaHD  where HoaDonChiTiet.MaKhuyenMai = 4 and NgayKhoiTao >= ? and NgayKhoiTao <= ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ngayBD);
        ps.setString(2, ngayKT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int tongSLBan = rs.getInt(1);

            ThongKe san = new ThongKe();

            san.setSoLuongBan(tongSLBan);

            TK.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return TK;
    } 
}
