/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.impl;

import DomainModels.NguoiDung;
import Views.DangKyDialog;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author concu
 */
public interface QuanLyDangKy {
    
    
    
    public List<DangKyDialog> layDSKH() throws SQLException;
    
    public boolean ThemNguoiDung(DangKyDialog dangKy) throws SQLException;
    
    public boolean XoaNguoiDung(String TenDangNhap) throws SQLException;
    
    public boolean SuaNguoiDung(DangKyDialog dangKy) throws SQLException;
}
