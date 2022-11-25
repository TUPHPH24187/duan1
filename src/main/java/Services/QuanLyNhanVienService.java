/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import Repositories.NhanVienRepository;
import ViewModels.KhanhHangViewModel;
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
    public java.util.List<NhanVien> layNhanViens() throws SQLException {
        java.util.List<NhanVien> nhanViens = nhanVienRepository.layNhanViens();
        java.util.List<NhanVien> qlNhanViens = new ArrayList<>();
        for (NhanVien nhanVien : nhanViens) {

            qlNhanViens.add(new NhanVien(nhanVien.getMaNV(), nhanVien.getTenNV(), nhanVien.getNgaySinh(), nhanVien.getGioiTinh(),
                    nhanVien.getSDT(), nhanVien.getDiaChi(),nhanVien.getEmail(), nhanVien.getTrangThai()));
        }
        return qlNhanViens;
    }
    public boolean ThemNhanVien(NhanVien nhanVien) throws SQLException {
        if(nhanVienRepository.ThemNhanVien(nhanVien)){
            return true;
        }else {
            return false;
        }
    }

    public boolean SuaNhanVien(NhanVien nhanVien, Integer maNV) throws SQLException {


        return nhanVienRepository.SuaNhanVien(nhanVien, maNV);
    }
    
    public boolean XoaNhanVien(Integer maNV) throws SQLException{
        return nhanVienRepository.XoaNhanVien(maNV);
    }
}
