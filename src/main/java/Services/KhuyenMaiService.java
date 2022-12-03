/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import DomainModels.KhuyenMai;
import Repositories.KhachHangRepository;
import Repositories.KhuyenMaiRepository;
import Utilities.DBConnection;
import ViewModels.KhanhHangViewModel;
import ViewModels.KhuyenMaiViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nva20
 */
public class KhuyenMaiService {
     KhuyenMaiRepository khuyenMaiRepository;

    public KhuyenMaiService() {
        khuyenMaiRepository = new KhuyenMaiRepository();
    }

    public java.util.List<KhuyenMaiViewModel> layDSKM() throws SQLException {
        java.util.List<KhuyenMai> khuyenMais = khuyenMaiRepository.layDSKM();
        java.util.List<KhuyenMaiViewModel> qLKhuyenMais = new ArrayList<>();
        for (KhuyenMai khuyenMai : khuyenMais) {

            qLKhuyenMais.add(new KhuyenMaiViewModel(khuyenMai.getMaKhuyenMai(), khuyenMai.getTenKhuyenMai(), khuyenMai.getNgayBatDau(), khuyenMai.getNgayKetThuc(), khuyenMai.getGiamGia(), khuyenMai.getTrangThai()));
        }
        return qLKhuyenMais;
    }
    
    
    public boolean ThemKhuyenMai(KhuyenMaiViewModel khuyenMai) throws SQLException {
        KhuyenMai KhuyenMai1 = new KhuyenMai();
        KhuyenMai1.setMaKhuyenMai(khuyenMai.getMaKhuyenMai());
        KhuyenMai1.setTenKhuyenMai(khuyenMai.getTenKhuyenMai());
        KhuyenMai1.setNgayBatDau(khuyenMai.getNgayBatDau());
        KhuyenMai1.setNgayKetThuc(khuyenMai.getNgayKetThuc());
        KhuyenMai1.setGiamGia(khuyenMai.getGiamGia());
        KhuyenMai1.setTrangThai(khuyenMai.getTrangThai());
        

        return khuyenMaiRepository.ThemKhuyenMai(KhuyenMai1);
    }

    public boolean XoaKhuyenMai(String maKhuyenMai) throws SQLException {
        Connection connection = DBConnection.openDbConnection();
        String sql = "Delete from KhuyenMai where MaKhuyenMai = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, maKhuyenMai);

        int index = statement.executeUpdate();
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean SuaKhuyenMai(KhuyenMaiViewModel khuyenMai) throws SQLException {
       KhuyenMai KhuyenMai1 = new KhuyenMai();
        KhuyenMai1.setMaKhuyenMai(khuyenMai.getMaKhuyenMai());
        KhuyenMai1.setTenKhuyenMai(khuyenMai.getTenKhuyenMai());
        KhuyenMai1.setNgayBatDau(khuyenMai.getNgayBatDau());
        KhuyenMai1.setNgayKetThuc(khuyenMai.getNgayKetThuc());
        KhuyenMai1.setGiamGia(khuyenMai.getGiamGia());
        KhuyenMai1.setTrangThai(khuyenMai.getTrangThai());

        return khuyenMaiRepository.SuaKhuyenMai(KhuyenMai1);
    }

}
