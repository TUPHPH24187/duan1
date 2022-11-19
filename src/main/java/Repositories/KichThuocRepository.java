package Repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Utilities.HibernateConfig;
import java.util.ArrayList;
import DomainModels.KichThuoc;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class KichThuocRepository {
    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<KichThuoc> getList() {
        Query q = session.createQuery("From KichThuoc");// truy vấn trên entity(HQL)
        ArrayList<KichThuoc> list = (ArrayList<KichThuoc>) q.getResultList();
        return list;
    }
}
