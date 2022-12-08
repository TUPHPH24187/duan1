/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.SQLException;
import java.util.List;
import model.GioHangModel;
import model.Hienthigannhat;
import model.HoaDonChiTietModel;
import model.HoaDonMode;
import model.KhachHangModel;
import model.SanPhamModel;
import model.giamGiamodel;
import repository.KhachHang_repo;

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
    
    public void deleteHDCT(String maHDCT)throws SQLException{
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
 public void suaSLSP(String maHD,String maSP)throws SQLException{
       repo.suaSlSP(maHD, maSP);
    }
 
}
