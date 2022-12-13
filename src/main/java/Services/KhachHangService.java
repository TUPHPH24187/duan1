/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.GioHangModel;
import DomainModels.Hienthigannhat;
import DomainModels.HoaDonChiTietModel;
import DomainModels.HoaDonMode;
import DomainModels.KhachHangModel;
import DomainModels.SanPhamModel;
import DomainModels.giamGiamodel;
import DomainModels.yeuCaumodel;
import Repositories.KhachHang_repo;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author DELL
 */
public class KhachHangService {

    private final KhachHang_repo repo;

    public KhachHangService() {
        repo = new KhachHang_repo();
    }

    public List<KhachHangModel> timKiemKHHHH(String SDT) {
        try {
            return repo.timKiemKH(SDT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<SanPhamModel> timKiemSPPPPP(String maSP) {
        try {
            return repo.timKiemSP(maSP);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<SanPhamModel> listSP() {
        try {
            return repo.listSP();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void insert(HoaDonMode HD) {
        repo.insert(HD);
    }

    public List<Hienthigannhat> HienThiSPGN() {
        try {
            return repo.Hienthigannhat();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Hienthigannhat> HienThiHD() {
        try {
            return repo.Hienthidanhsach();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void delete(String maHD) throws SQLException {
        repo.huyHoaDon(maHD);
    }

    public List<Hienthigannhat> hienthiHDtheomaKH(String maKH) {
        try {
            return repo.HienthiHDtheomaKH(maKH);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Hienthigannhat> hienthiHDtheomaHD(String maHDCT) {
        try {
            return repo.HienthiHDtheomaHD(maHDCT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void insertHDCT(HoaDonChiTietModel HDCT) {
        repo.insertHDchitiet(HDCT);
    }

    public List<giamGiamodel> listGG() {
        try {
            return repo.listGiamGia();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<GioHangModel> listGioHang(String maHDtim) {
        try {
            return repo.listGioHang(maHDtim);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteHDCT(String maHDCT) throws SQLException {
        repo.deleteHDCT(maHDCT);
    }

    public List<GioHangModel> tinhTong(String maHDtim) {
        try {
            return repo.tinhTong(maHDtim);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void thanhtoanthanhcong(String maHD) throws SQLException {
        repo.thanhToanthanhcong(maHD);
    }

    public void suaSLSP(int soLuongXoa, String maSP) throws SQLException {
        repo.suaSlSP(soLuongXoa, maSP);
    }

    public void themSLSP(int soLuongThem, String maSP) throws SQLException {
        repo.ThemSlSP(soLuongThem, maSP);
    }

    public List<yeuCaumodel> yeuCau(String taiKhoan, String MatKhau) {
        try {
            return repo.yeuCau(taiKhoan, MatKhau);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
 
}
