/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Views.QLKhachHang;
import Views.QLNhanVien;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface QuanLyNhanVien {
    public List<QLNhanVien> layNhanViens() throws SQLException;
    
    public boolean ThemNhanVien(QLNhanVien nhanVien) throws SQLException;
    
}