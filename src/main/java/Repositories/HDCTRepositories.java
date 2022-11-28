/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HDCT;
import Utilities.DBConnection;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author DAO THANH QUYEN
 */
public class HDCTRepositories {
    private final Session session = DBConnection.getFACTORY().openSession();

    public ArrayList<HDCT> getList() {
        Query q = session.createQuery("From HDCT");// truy vấn trên entity(HQL)
        ArrayList<HDCT> list = (ArrayList<HDCT>) q.getResultList();
        return list;
    }
}
