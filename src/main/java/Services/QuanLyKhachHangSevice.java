/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import Repositories.KhachHangRepository;
import ViewModels.KhanhHangViewModel;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class QuanLyKhachHangSevice {

    KhachHangRepository khachHangRepository;

    public QuanLyKhachHangSevice() {
        khachHangRepository = new KhachHangRepository();
    }

    public java.util.List<KhanhHangViewModel> layDSKH() throws SQLException {
        java.util.List<KhachHang> khachHangs = khachHangRepository.layDSKH();
        java.util.List<KhanhHangViewModel> qLKhachHangs = new ArrayList<>();
        for (KhachHang khachHang : khachHangs) {

            qLKhachHangs.add(new KhanhHangViewModel(khachHang.getMaKH(), khachHang.getHoTen(), khachHang.getNgaySinh(), khachHang.getGioiTinh(),
                    khachHang.getsDT(), khachHang.getDiaChi(), khachHang.getTrangThai()));
        }
        return qLKhachHangs;
    }

    public boolean ThemKhachHang(KhanhHangViewModel khachHang) throws SQLException {
        KhachHang khachHang1 = new KhachHang();
        khachHang1.setMaKH(khachHang.getMaKH());
        khachHang1.setHoTen(khachHang.getHoTen());
        khachHang1.setNgaySinh(khachHang.getNgaySinh());
        khachHang1.setGioiTinh(khachHang.getGioiTinh());
        khachHang1.setsDT(khachHang.getsDT());
        khachHang1.setDiaChi(khachHang.getDiaChi());
        khachHang1.setTrangThai(khachHang.getTrangThai());

        return khachHangRepository.ThemKhachHang(khachHang1);
    }

    public boolean XoaKhachHang(String maKH) throws SQLException {
        return khachHangRepository.XoaKhachHang(maKH);
    }

    public boolean SuaKhachHang(KhanhHangViewModel khachHang) throws SQLException {
       KhachHang khachHang1 = new KhachHang();
        khachHang1.setMaKH(khachHang.getMaKH());
        khachHang1.setHoTen(khachHang.getHoTen());
        khachHang1.setNgaySinh(khachHang.getNgaySinh());
        khachHang1.setGioiTinh(khachHang.getGioiTinh());
        khachHang1.setsDT(khachHang.getsDT());
        khachHang1.setDiaChi(khachHang.getDiaChi());
        khachHang1.setTrangThai(khachHang.getTrangThai());

        return khachHangRepository.SuaKhachHang(khachHang1);
    }
}
