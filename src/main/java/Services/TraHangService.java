/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.TraHang;
import Repositories.TraHangRepositori;
import Service.impl.TraHangImpl;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TraHangService implements TraHangImpl{
private TraHangRepositori trahangRepository = new TraHangRepositori();

    @Override
    public List<TraHang> getList() {
    try {
        return trahangRepository.listTraHang();
    } catch (SQLException ex) {
        Logger.getLogger(TraHangService.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }

    @Override
    public boolean traHang(TraHang traHang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

}
