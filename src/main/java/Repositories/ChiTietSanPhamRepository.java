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
import org.hibernate.SessionFactory;
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
    
    
    private final SessionFactory sf = HibernateConfig.getFACTORY();
    public ChiTietSanPham find(int MaCTSP) {
        try {
            sf.getCurrentSession().beginTransaction();
            return (ChiTietSanPham) sf.getCurrentSession().get(ChiTietSanPham.class, MaCTSP);
        } catch (Exception e) {
            return null;
        }
   }
    
    public Boolean delete(ChiTietSanPham CTSP) {
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().delete(CTSP);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } 
   }
    
    public Boolean update(ChiTietSanPham CTSP) {
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().saveOrUpdate(CTSP);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        } 
   }
   
    

    
            
   
    
   
   
}
