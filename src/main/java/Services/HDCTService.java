/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.HDCT;
import Repositories.HDCTDAO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class HDCTService {
    HDCTDAO hdctdao;

    public HDCTService() {
        hdctdao = new HDCTDAO();
    }
    public List<HDCT> getList(){
        return hdctdao.getList();
    }
    
    public String add(HDCT x){
        return hdctdao.save(new HDCT(x.getMaHDCT(), x.getSoLuong(), x.getGia(), x.getThanhTien(), x.getTrangThai(), x.getMaHD(),x .getMaCTSP()));
    }
    public String delete(int id){
        return hdctdao.delete(id);
    }
    public List<HDCT> timKiem(int ma){
        List<HDCT> hd = new ArrayList<>();
        for (HDCT x : hdctdao.getList()) {
            if(x.getMaHD().getMaHD() == ma){
                hd.add(x);
            }
        }
        return hd;
    }
}
