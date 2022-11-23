package Service.impl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


import java.util.ArrayList;
import DomainModels.ChiTietSanPham;
import DomainModels.KichThuoc;
import DomainModels.ChatLieu;
import DomainModels.XuatXu;
import Views.QLSanPham;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author concu
 */
public interface QuanLyChiTietSanPhamService {

    ArrayList<ChiTietSanPham> getListChiTietSanPham();
    ArrayList<ChatLieu> getListChatLieu();   
    ArrayList<XuatXu> getListXuatXu();  
    ArrayList<KichThuoc> getListKichThuoc();
    
    public java.util.List<ChiTietSanPham> layDSlayDSSP() throws SQLException;
    
    String addCTSanPham(ChiTietSanPham ctsp);
    public boolean XoaSanPham(Integer maCTSP) throws SQLException;
    String updateCTSanPham(ChiTietSanPham ctsp);
}
