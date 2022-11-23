package Repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Utilities.DBConnection;
import java.util.ArrayList;
import DomainModels.KichThuoc;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class KichThuocRepository {
    Session session = DBConnection.getFACTORY().openSession();

    public ArrayList<KichThuoc> getList() {
        Query q = session.createQuery("From KichThuoc");// truy vấn trên entity(HQL)
        ArrayList<KichThuoc> list = (ArrayList<KichThuoc>) q.getResultList();
        return list;
    }
    
    public String themKichThuoc(KichThuoc kt){
          try ( Session ss = DBConnection.getFACTORY().openSession()) {
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.save(kt);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Thêm không thành công";
            }
        }
        return "Thêm thành công nhé!";
    }
    
    public String suaKichThuoc(KichThuoc kt){
          try ( Session ss = DBConnection.getFACTORY().openSession()) {
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.update(kt);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Thêm không thành công";
            }
        }
        return "Thêm thành công nhé!";
    }
    
}
