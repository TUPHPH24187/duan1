/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import Utilities.DBConnection;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class HoaDonRepository {
    Session ss;
    public HoaDonRepository(){
        ss = DBConnection.getFACTORY().openSession();
    }  
    public List<HoaDon> getList(){
        List<HoaDon> hoaDons;
        try(Session session = DBConnection.getFACTORY().openSession()){
            TypedQuery<HoaDon> query = session.createQuery("from HoaDon where TrangThai = 0");
            hoaDons = query.getResultList();
        }
        return hoaDons;
    }
    public List<HoaDon> getListThanhToan(){
        //List<HoaDon> hoaDons;
        //try(Session session = HibernateUltis.getSessionFactory().openSession()){
//            TypedQuery<HoaDon> query = session.createQuery("from HoaDon where TrangThai = 1");
//            hoaDons = query.getResultList();
        //}
        //return hoaDons;
        System.out.println("chay ");
        Query query = ss.createQuery("from HoaDon where TrangThai = 1");
        System.out.println(query.list().get(0));
        return query.list();
    }
}
