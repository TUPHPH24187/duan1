/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import Utilities.DBConnection;
import ViewModels.HoaDonView;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author admin
 */
public class HoaDonDAO {
    Session ss;
    public HoaDonDAO(){
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
    public List<HoaDonView> getListThanhToan(){
        //List<HoaDon> hoaDons;
        //try(Session session = HibernateUltis.getSessionFactory().openSession()){
//            TypedQuery<HoaDon> query = session.createQuery("from HoaDon where TrangThai = 1");
//            hoaDons = query.getResultList();
        //}
        //return hoaDons;
        
        Query query = ss.createQuery("from HoaDon where TrangThai = 1");
        System.out.println(query.list().get(0));
        return query.list();
    }
    public String save(HoaDonView hd){
        try(Session session = DBConnection.getFACTORY().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.save(hd);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Không thành công";
            }
        }
        return "Tạo hóa đơn thành công";
    }
    public String update(HoaDonView hd){
        try(Session session = DBConnection.getFACTORY().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.update(hd);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Không thành công";
            }
        }
        return "Thanh toán hóa đơn thành công";
    }
}
