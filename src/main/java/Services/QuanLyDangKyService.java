/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NguoiDung;
import Repositories.DangKyRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import Service.impl.QuanLyDangKy;

/**
 *
 * @author concu
 */
public class QuanLyDangKyService {
    DangKyRepository dangKyRepository;

     public QuanLyDangKyService() {
        dangKyRepository = new DangKyRepository();
    }

     
    public java.util.List<NguoiDung> layDSNguoiDung() throws SQLException {
        java.util.List<NguoiDung> nguoiDungs = dangKyRepository.layDSND();
        java.util.List<NguoiDung> qLNguoiDungs = new ArrayList<>();
        for (NguoiDung nguoiDung : nguoiDungs) {

            qLNguoiDungs.add(new NguoiDung(nguoiDung.getTenDangNhap(),nguoiDung.getMatKhau(),nguoiDung.getVaiTro()));
        }
        return qLNguoiDungs;
    }

    public boolean ThemNguoiDung(NguoiDung nguoiDung) throws SQLException {
        NguoiDung nguoiDung1 = new NguoiDung();
        nguoiDung1.setTenDangNhap(nguoiDung.getTenDangNhap());
        nguoiDung1.setMatKhau(nguoiDung.getMatKhau());
        nguoiDung1.setVaiTro(nguoiDung.getVaiTro());
        

        return dangKyRepository.ThemNguoiDung(nguoiDung1);
    }

    public boolean XoaNguoiDung(String TenNguoiDung) throws SQLException {
        return dangKyRepository.XoaNguoiDung(TenNguoiDung);
    }

    public boolean SuaNguoiDung(NguoiDung nguoiDung) throws SQLException {
       NguoiDung nguoiDung1 = new NguoiDung();
        nguoiDung1.setTenDangNhap(nguoiDung.getTenDangNhap());
        nguoiDung1.setMatKhau(nguoiDung.getMatKhau());
        nguoiDung1.setVaiTro(nguoiDung.getVaiTro());

        return dangKyRepository.SuaNguoiDung(nguoiDung1);
    }
}
