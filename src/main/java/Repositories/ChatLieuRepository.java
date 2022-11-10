/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Utilities.HibernateConfig;
import java.util.ArrayList;
import DomainModels.ChatLieu;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author concu
 */
public class ChatLieuRepository {
    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<ChatLieu> getList() {
        Query q = session.createQuery("From ChatLieu");// truy vấn trên entity(HQL)
        ArrayList<ChatLieu> list = (ArrayList<ChatLieu>) q.getResultList();
        return list;
    }
    
    
    
}
