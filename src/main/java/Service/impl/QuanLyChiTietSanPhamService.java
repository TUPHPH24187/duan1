package Service.impl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


import java.util.ArrayList;
import ViewModels.ChiTietSanPham;
import DomainModels.KichThuoc;
import DomainModels.ChatLieu;
import DomainModels.XuatXu;

/**
 *
 * @author concu
 */
public interface QuanLyChiTietSanPhamService {

    ArrayList<ChiTietSanPham> getListChiTietSanPham();
    ArrayList<ChatLieu> getListChatLieu();   
    ArrayList<XuatXu> getListXuatXu();  
    ArrayList<KichThuoc> getListKichThuoc();
    
    String addCTSanPham(ChiTietSanPham ctsp);
    
}
