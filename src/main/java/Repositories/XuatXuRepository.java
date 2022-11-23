package Repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Utilities.DBConnection;
import java.util.ArrayList;
import DomainModels.XuatXu;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class XuatXuRepository {
    Session session = DBConnection.getFACTORY().openSession();

    public ArrayList<XuatXu> getList() {
        Query q = session.createQuery("From XuatXu");// truy vấn trên entity(HQL)
        ArrayList<XuatXu> list = (ArrayList<XuatXu>) q.getResultList();
        return list;
    }
    
    public String themXuatXu(XuatXu xx){
          try ( Session ss = DBConnection.getFACTORY().openSession()) {
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.save(xx);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Thêm không thành công";
            }
        }
        return "Thêm thành công nhé!";
    }
    
    public String suaXuatXu(XuatXu xx){
          try ( Session ss = DBConnection.getFACTORY().openSession()) {
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.update(xx);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Thêm không thành công";
            }
        }
        return "Thêm thành công nhé!";
    }
    
       public String maXuatXu(String ten){
        String name;
        try ( Session ss = DBConnection.getFACTORY().openSession()) {
            String sql = "select MaXuatXu from XuatXu where TenXuatXu =: MaCTSP";
            javax.persistence.Query qr = ss.createQuery(sql);
            qr.setParameter("MaCTSP", ten);
            name = String.valueOf(qr.getSingleResult());
        }
        return name;
    }
    
}
