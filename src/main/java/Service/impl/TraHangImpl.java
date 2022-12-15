/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.impl;

import DomainModels.TraHang;
import ViewModels.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface TraHangImpl {
   List<TraHang> getList();
   public boolean traHang(TraHang traHang,String MaHD);
    List<HoaDonChiTiet> getlist();
}
