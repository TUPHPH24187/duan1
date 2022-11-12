/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Utilities.HibernateConfig;
import java.util.ArrayList;
import ViewModels.ChiTietSanPham;

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
            System.out.println("ma hoa don" + check);
            return check > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public  ChiTietSanPham find(Integer MaCTSP) {
        try {
            session.getSession().beginTransaction();
            return (ChiTietSanPham) session.getSession().get(ChiTietSanPham.class, MaCTSP);
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean delete(ChiTietSanPham MaCTSP) {
        try {
            session.getSession().beginTransaction();
            session.getSession().delete(MaCTSP);
            session.getSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getSession().getTransaction().rollback();
            return false;
        }
    }

    public Boolean saveorupdate(ChiTietSanPham MaCTSP) {
        try {
            session.getSession().beginTransaction();
            session.getSession().saveOrUpdate(MaCTSP);
            session.getSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getSession().getTransaction().rollback();
            return false;
        }
    }

}
