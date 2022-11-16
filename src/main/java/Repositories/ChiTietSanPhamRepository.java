/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Utilities.HibernateConfig;
import java.util.ArrayList;
import ViewModels.ChiTietSanPham;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class ChiTietSanPhamRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<ChiTietSanPham> getList() {
        Query q = session.createQuery("From ChiTietSanPham");// truy vấn trên entity(HQL)
        ArrayList<ChiTietSanPham> list = (ArrayList<ChiTietSanPham>) q.getResultList();
        return list;
    }

    public Boolean add(ChiTietSanPham ctsp) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(ctsp);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    ////////////////////////////////////////////
    
    public List<ChiTietSanPham> findAll(int MaCTSP) {
       session.beginTransaction();
       List<ChiTietSanPham> list = getList();
       session.getTransaction().commit();
       return list;
   }
    
    public ChiTietSanPham findByid(int MaCTSP) {
       session.beginTransaction();
       ChiTietSanPham ctsp = findByid(MaCTSP);
       session.getTransaction().commit();
       return ctsp;
   }
    
    
   
    

    
            
   
    
   
   
}
