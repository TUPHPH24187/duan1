/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.ChiTietSanPham;

import model.KichThuoc;

import model.ChatLieu;
import model.XuatXu;

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
   
    String deleteCTSanPham(ChiTietSanPham ctsp);
//   String updateCTSanPham(ChiTietSanPham ctsp);
}
