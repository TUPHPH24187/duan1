/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHangModel;
import DomainModels.Hienthigannhat;
import DomainModels.HoaDonChiTietModel;
import DomainModels.HoaDonMode;
import DomainModels.KhachHangModel;
import DomainModels.SanPhamModel;
import DomainModels.giamGiamodel;
import DomainModels.yeuCaumodel;
import Utilities.DBConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author DELL
 */
public class KhachHang_repo {

    public List<KhachHangModel> timKiemKH(String SDT) throws SQLException {
        List<KhachHangModel> KH = new ArrayList();
        String sql = "select MaKH, TenKH,NgaySinh,GioiTinh,SoDienThoai from KhachHang where SoDienThoai like ? ";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, SDT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maKH = rs.getString(1);
            String tenKH = rs.getString(2);
            String ngaySinh = rs.getString(3);
            int gioiTinh = rs.getInt(4);
            String sdt = rs.getString(5);
            KhachHangModel khach = new KhachHangModel();
            khach.setMaKH(maKH);
            khach.setGioiTinh(gioiTinh);
            khach.setNgaySinh(ngaySinh);
            khach.setTenKH(tenKH);
            khach.setSdt(sdt);
            KH.add(khach);

        }
        rs.close();
        ps.close();
        con.close();
        return KH;
    }

    public List<SanPhamModel> timKiemSP(String maSP) throws SQLException {
        List<SanPhamModel> SP = new ArrayList();
        String sql = "select MaCTSP, TenCTSP, TenChatLieu, TenKichThuoc,TenXuatXu, GiaBan,soLuong from ChiTietSanPham join ChatLieu on ChiTietSanPham.MaChatLieu = ChatLieu.MaChatLieu\n"
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
            double gia = rs.getDouble(6);
            int soLuong = rs.getInt(7);
            SanPhamModel san = new SanPhamModel();
            san.setChatLieu(chatLieu);
            san.setGiaBan(gia);
            san.setKichThuoc(kichThuoc);
            san.setMaSP(masp);
            san.setTenSP(tensp);
            san.setXuatXu(xuatXu);
            san.setSoLuong(soLuong);
            SP.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return SP;
    }

    public boolean insert(HoaDonMode HD) {
        String sql = "insert into HoaDon(MaKH,MaNV,MaHTTT,NgayKhoiTao,GhiChu,Trangthai) values (?,?,?,?,?,?) ";
        try (Connection con = DBConnection.openDbConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, HD.getmKH());
            pstmt.setString(2, HD.getMaNV());

            pstmt.setString(3, HD.getThanhToan());
            pstmt.setString(4, HD.getNgayTao());

            pstmt.setString(5, HD.getGhiChu());
            pstmt.setInt(6, HD.getTrangThai());

            int affectadRows = pstmt.executeUpdate();
            return affectadRows > 0;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }

    public List<Hienthigannhat> Hienthigannhat() throws SQLException {
        List<Hienthigannhat> HTGN = new ArrayList();
        String sql = "select top (1) MaHD,MaNV, TenKH,TenHTTT,NgayKhoiTao,GhiChu,HoaDon.TrangThai from HoaDon join KhachHang on HoaDon.MaKH = KhachHang.MaKH\n"
                + "								join HinhThucThanhToan on HoaDon.MaHTTT = HinhThucThanhToan.MaHTTT\n"
                + "								order by MaHD desc";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maHD = rs.getString(1);
            String maNV = rs.getString(2);
            String tenKH = rs.getString(3);
            String tenHTTT = rs.getString(4);
            String ngayTao = rs.getString(5);

            String ghiChu = rs.getString(6);
            int trangThai = rs.getInt(7);
            Hienthigannhat htgn = new Hienthigannhat();
            htgn.setGhiChu(ghiChu);
            htgn.setMaHD(maHD);
            htgn.setMaNV(maNV);
            htgn.setNgayTao(ngayTao);
            htgn.setTenHTTT(tenHTTT);
            htgn.setTenKH(tenKH);
            htgn.setTrangThai(trangThai);

            HTGN.add(htgn);

        }
        rs.close();
        ps.close();
        con.close();
        return HTGN;
    }

    public List<Hienthigannhat> Hienthidanhsach() throws SQLException {
        List<Hienthigannhat> HTDS = new ArrayList();
        String sql = "select  MaHD,MaNV, TenKH,TenHTTT,NgayKhoiTao,GhiChu,HoaDon.TrangThai from HoaDon join KhachHang on HoaDon.MaKH = KhachHang.MaKH\n"
                + "                								join HinhThucThanhToan on HoaDon.MaHTTT = HinhThucThanhToan.MaHTTT";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maHD = rs.getString(1);
            String maNV = rs.getString(2);
            String tenKH = rs.getString(3);
            String tenHTTT = rs.getString(4);
            String ngayTao = rs.getString(5);

            String ghiChu = rs.getString(6);
            int trangThai = rs.getInt(7);
            Hienthigannhat htds = new Hienthigannhat();
            htds.setGhiChu(ghiChu);
            htds.setMaHD(maHD);
            htds.setMaNV(maNV);
            htds.setNgayTao(ngayTao);
            htds.setTenHTTT(tenHTTT);
            htds.setTenKH(tenKH);
            htds.setTrangThai(trangThai);
            HTDS.add(htds);

        }
        rs.close();
        ps.close();
        con.close();
        return HTDS;
    }

    public void huyHoaDon(String maHD) throws SQLException {
        String sql = "update hoadon set trangthai = 3 where maHD = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, maHD);
        int aff = pstmt.executeUpdate();
        pstmt.close();
        con.close();

    }

    public List<Hienthigannhat> HienthiHDtheomaKH(String maKH) throws SQLException {
        List<Hienthigannhat> HTTKH = new ArrayList();
        String sql = "select  MaHD,MaNV, TenKH,TenHTTT,NgayKhoiTao,GhiChu,HoaDon.TrangThai from HoaDon join KhachHang on HoaDon.MaKH = KhachHang.MaKH\n"
                + "                								join HinhThucThanhToan on HoaDon.MaHTTT = HinhThucThanhToan.MaHTTT\n"
                + "												where KhachHang.MaKH = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maKH);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maHD = rs.getString(1);
            String maNV = rs.getString(2);
            String tenKH = rs.getString(3);
            String tenHTTT = rs.getString(4);
            String ngayTao = rs.getString(5);
            int trangThai = rs.getInt(7);

            String ghiChu = rs.getString(6);
            Hienthigannhat httkh = new Hienthigannhat();
            httkh.setGhiChu(ghiChu);
            httkh.setMaHD(maHD);
            httkh.setMaNV(maNV);
            httkh.setNgayTao(ngayTao);
            httkh.setTenHTTT(tenHTTT);
            httkh.setTenKH(tenKH);
            httkh.setTrangThai(trangThai);

            HTTKH.add(httkh);

        }
        rs.close();
        ps.close();
        con.close();
        return HTTKH;
    }

    public List<Hienthigannhat> HienthiHDtheomaHD(String maHDCanTim) throws SQLException {
        List<Hienthigannhat> HTTHD = new ArrayList();
        String sql = "select  MaHD,MaNV, TenKH,TenHTTT,NgayKhoiTao,GhiChu,hoaDon.TrangThai from HoaDon join KhachHang on HoaDon.MaKH = KhachHang.MaKH\n"
                + "                								join HinhThucThanhToan on HoaDon.MaHTTT = HinhThucThanhToan.MaHTTT\n"
                + "												where HoaDon.MaHD = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maHDCanTim);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maHD = rs.getString(1);
            String maNV = rs.getString(2);
            String tenKH = rs.getString(3);
            String tenHTTT = rs.getString(4);
            String ngayTao = rs.getString(5);

            String ghiChu = rs.getString(6);
            int trangThai = rs.getInt(7);
            Hienthigannhat htthd = new Hienthigannhat();
            htthd.setGhiChu(ghiChu);
            htthd.setMaHD(maHD);
            htthd.setMaNV(maNV);
            htthd.setNgayTao(ngayTao);
            htthd.setTenHTTT(tenHTTT);
            htthd.setTenKH(tenKH);
            htthd.setTrangThai(trangThai);

            HTTHD.add(htthd);

        }
        rs.close();
        ps.close();
        con.close();
        return HTTHD;
    }

    public boolean insertHDchitiet(HoaDonChiTietModel HDCT) {
        String sql = "insert into hoadonchitiet(maHD,maCTSP,SoLuong,MaKhuyenMai) values (?,?,?,?)";
        try (Connection con = DBConnection.openDbConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, HDCT.getMaHD());
            pstmt.setString(2, HDCT.getMaSp());

            pstmt.setInt(3, HDCT.getSoLuong());
            pstmt.setString(4, HDCT.getMaGiamgia());

            int affectadRows = pstmt.executeUpdate();
            return affectadRows > 0;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }

    public List<SanPhamModel> listSP() throws SQLException {
        List<SanPhamModel> SP = new ArrayList();
        String sql = "select MaCTSP, SoLuong from ChiTietSanPham";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String masp = rs.getString(1);

            int soLuong = rs.getInt(2);
            SanPhamModel san = new SanPhamModel();

            san.setMaSP(masp);

            san.setSoLuong(soLuong);
            SP.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return SP;
    }

    public List<giamGiamodel> listGiamGia() throws SQLException {
        List<giamGiamodel> GG = new ArrayList();
        String sql = "select makhuyenmai, tenkhuyenmai, Mucgiamgia from khuyenmai";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String magg = rs.getString(1);
            String tenkm = rs.getString(2);
            int mucGiam = rs.getInt(3);
            giamGiamodel san = new giamGiamodel();

            san.setMucGiamGia(mucGiam);
            san.setMagiamgia(magg);
            san.setTenGiamGIa(tenkm);
            GG.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return GG;
    }

    public List<GioHangModel> listGioHang(String maHDtim) throws SQLException {
        List<GioHangModel> GH = new ArrayList();
        String sql = "select HoaDonchitiet.MaHD,Chitietsanpham.tenCTSP,HoaDonChiTiet.SoLuong, tenkichthuoc,giaban,tenkhuyenmai, (giaban*(100- khuyenmai.Mucgiamgia))/100 as 'Giadagiam',maHDCT,ChiTietSanPham.maCTSP  from hoadonchitiet join chitietsanpham on hoadonchitiet.maCTSP = chitietsanpham.MaCTSP\n"
                + "							join khuyenmai on hoadonchitiet.makhuyenmai = khuyenmai.makhuyenmai \n"
                + "							join kichthuoc on chitietsanpham.makichthuoc = kichthuoc.makichthuoc where hoadonchitiet.maHD = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maHDtim);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maHD = rs.getString(1);
            String tenSP = rs.getString(2);
            int soLuong = rs.getInt(3);
            String tenKichThuoc = rs.getString(4);
            double giaBan = rs.getDouble(5);
            String tenKhuyenmai = rs.getString(6);
            double giaDaGiam = rs.getDouble(7);
            String maHDCT = rs.getString(8);
            String maCTSP = rs.getString(9);

            GioHangModel gh = new GioHangModel();
            gh.setGiaBan(giaBan);
            gh.setGiaDaGiam(giaDaGiam);
            gh.setMaHD(maHD);
            gh.setSoLuong(soLuong);
            gh.setTenSp(tenSP);
            gh.setTenkhuyemai(tenKhuyenmai);
            gh.setTenkichthuoc(tenKichThuoc);
            gh.setMaHDCT(maHDCT);
            gh.setMaSP(maCTSP);

            GH.add(gh);

        }
        rs.close();
        ps.close();
        con.close();
        return GH;
    }

    public void deleteHDCT(String maHDCT) throws SQLException {
        String sql = "delete from HoaDonChiTiet where MaHDCT = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, maHDCT);
        int aff = pstmt.executeUpdate();
        pstmt.close();
        con.close();

    }

    public List<GioHangModel> tinhTong(String maHDtim) throws SQLException {
        List<GioHangModel> GH = new ArrayList();
        String sql = " select HoaDonChiTiet.maHD,  sum( ((giaban*(100 - khuyenmai.Mucgiamgia))/100)*HoaDonChiTiet.SoLuong) from hoadonchitiet join chitietsanpham on hoadonchitiet.maCTSP = chitietsanpham.MaCTSP\n"
                + "                						join khuyenmai on hoadonchitiet.makhuyenmai = khuyenmai.makhuyenmai \n"
                + "                						join kichthuoc on chitietsanpham.makichthuoc = kichthuoc.makichthuoc  \n"
                + "										where HoaDonChiTiet.MaHD = ?\n"
                + "										group by HoaDonChiTiet.MaHD";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maHDtim);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String maHD = rs.getString(1);

            double tienTong = rs.getDouble(2);

            GioHangModel gh = new GioHangModel();

            gh.setTongTien(tienTong);
            gh.setMaHD(maHD);

            GH.add(gh);

        }
        rs.close();
        ps.close();
        con.close();
        return GH;
    }

    public void thanhToanthanhcong(String maHD) throws SQLException {
        String sql = "update hoadon set trangthai = 2 where maHD = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, maHD);
        int aff = pstmt.executeUpdate();
        pstmt.close();
        con.close();

    }

    public void suaSlSP(int soLuongXoa, String maSp) throws SQLException {
        String sql = "update ChiTietSanPham set SoLuong= SoLuong- ? where maCTSP = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, soLuongXoa);
        pstmt.setString(2, maSp);

        int aff = pstmt.executeUpdate();
        pstmt.close();
        con.close();

    }

    public void ThemSlSP(int soLuongthem, String maSp) throws SQLException {
        String sql = "update ChiTietSanPham set SoLuong= SoLuong+ ? where maCTSP = ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, soLuongthem);
        pstmt.setString(2, maSp);

        int aff = pstmt.executeUpdate();
        pstmt.close();
        con.close();

    }

    public List<yeuCaumodel> yeuCau(String Email, String MatKhau) throws SQLException {
        List<yeuCaumodel> GG = new ArrayList();
        String sql = "select ChucVu from NhanVien where Email like ? and MatKhau like ?";
        Connection con = DBConnection.openDbConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, Email);
        ps.setString(2, MatKhau);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            int ChucVu = rs.getInt(1);
            yeuCaumodel san = new yeuCaumodel();

            san.setTrangThai(ChucVu);
            GG.add(san);

        }
        rs.close();
        ps.close();
        con.close();
        return GG;
    }
}
