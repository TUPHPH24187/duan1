/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HDCT;
import Utilities.DBConnection;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author concu
 */
public class HDCTRepository {
    public List<HDCT> getList(){
        List<HDCT> hdcts;
        try(Session session = DBConnection.getFACTORY().openSession()){
            TypedQuery<HDCT> query = session.createQuery("from HoaDonChiTiet");
            hdcts = query.getResultList();
        }
        return hdcts;
    }
    
}
