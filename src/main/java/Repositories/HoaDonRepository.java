/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class HoaDonRepository {
    private final Session session = DBConnection.getFACTORY().openSession();

    public ArrayList<HoaDon> getList() {
        Query q = session.createQuery("From HoaDon");// truy vấn trên entity(HQL)
        ArrayList<HoaDon> list = (ArrayList<HoaDon>) q.getResultList();
        return list;
    }
    
    
}
