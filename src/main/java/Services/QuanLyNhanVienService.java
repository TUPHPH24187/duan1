/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import Repositories.NhanVienRepository;
import ViewModels.KhanhHangViewModel;
import ViewModels.NhanVienViewModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QuanLyNhanVienService {
    
    NhanVienRepository nhanVienRepository;
    public  QuanLyNhanVienService(){
        nhanVienRepository = new NhanVienRepository();
    }
    public java.util.List<NhanVienViewModel> layNhanViens() throws SQLException {
        java.util.List<NhanVien> nhanViens = nhanVienRepository.layNhanViens();
        java.util.List<NhanVienViewModel> qlNhanViens = new ArrayList<>();
        for (NhanVien nhanVien : nhanViens) {

            qlNhanViens.add(new NhanVienViewModel(nhanVien.getMaNV(), nhanVien.getTenNV(), nhanVien.getNgaySinh(), nhanVien.getGioiTinh(),
                    nhanVien.getSoDienThoai(), nhanVien.getDiaChi(),nhanVien.getEmail(),nhanVien.getMatKhau(), nhanVien.getTrangThai(),nhanVien.getChucVu()));
        }
        return qlNhanViens;
    }
    public boolean ThemNhanVien(NhanVienViewModel nhanVien) throws SQLException {
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.setMaNV(nhanVien.getMaNV());
        nhanVien1.setTenNV(nhanVien.getTenNV());
        nhanVien1.setNgaySinh(nhanVien.getNgaySinh());
        nhanVien1.setGioiTinh(nhanVien.getGioiTinh());
        nhanVien1.setSoDienThoai(nhanVien.getSoDienThoai());
        nhanVien1.setDiaChi(nhanVien.getDiaChi());
        nhanVien1.setEmail(nhanVien.getEmail());
         nhanVien1.setMatKhau(nhanVien.getMatKhau());
        nhanVien1.setTrangThai(nhanVien.getTrangThai());

        return nhanVienRepository.ThemNhanVien(nhanVien1);
    }
}
