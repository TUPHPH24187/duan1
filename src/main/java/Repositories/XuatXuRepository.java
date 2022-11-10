/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Utilities.HibernateConfig;
import java.util.ArrayList;
import DomainModels.XuatXu;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class XuatXuRepository {
    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<XuatXu> getList() {
        Query q = session.createQuery("From XuatXu");// truy vấn trên entity(HQL)
        ArrayList<XuatXu> list = (ArrayList<XuatXu>) q.getResultList();
        return list;
    }
}
