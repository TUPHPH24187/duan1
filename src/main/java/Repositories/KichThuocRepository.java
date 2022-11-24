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
    
    public Boolean add(KichThuoc kt) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = DBConnection.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(kt);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}