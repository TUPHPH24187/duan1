/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.impl;

import Views.QLKhachHang;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ADM
 */
public interface QuanLyKhachHang {
    public List<QLKhachHang> layDSKH() throws SQLException;
    
    public boolean ThemKhachHang(QLKhachHang khachHang) throws SQLException;
    
    public boolean XoaKhachHang(String maKH) throws SQLException;
    
    public boolean SuaKhachHang(QLKhachHang khachHang) throws SQLException;
}
