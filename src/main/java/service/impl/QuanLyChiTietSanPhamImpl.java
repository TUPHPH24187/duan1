/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.ChiTietSanPham;

import model.KichThuoc;
import model.ChatLieu;
import model.XuatXu;
import repository.ChiTietSanPhamRepository;
import repository.KichThuocRepository;
import repository.XuatXuRepository;
import repository.ChatLieuRepository;
import service.QuanLyChiTietSanPhamService;



public class QuanLyChiTietSanPhamImpl implements QuanLyChiTietSanPhamService {

    
    private KichThuocRepository kichThuocRepository = new KichThuocRepository();
    private XuatXuRepository xuatXuRepository = new XuatXuRepository();
    private ChatLieuRepository chatLieuRepository = new ChatLieuRepository();
    
    private ChiTietSanPhamRepository chiTietsanPhamRepository = new ChiTietSanPhamRepository();
    

    @Override
    public ArrayList<ChiTietSanPham> getListChiTietSanPham() {
        return chiTietsanPhamRepository.getList();
    }
    
    @Override
    public ArrayList<ChatLieu> getListChatLieu() {
       return chatLieuRepository.getList();
    }

    @Override
    public ArrayList<XuatXu> getListXuatXu() {
        return xuatXuRepository.getList();
    }
    
    @Override
    public ArrayList<KichThuoc> getListKichThuoc() {
        return kichThuocRepository.getList();
    }

    @Override
    public String addCTSanPham(ChiTietSanPham ctsp) {
        if (chiTietsanPhamRepository.add(ctsp)) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }

    }

   

    

    }
   

    

    

    
    


