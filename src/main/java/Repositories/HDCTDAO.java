/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HDCT;
import Utilities.DBConnection;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author admin
 */
public class HDCTDAO {
    public List<HDCT> getList(){
        List<HDCT> hdcts;
        try(Session session = DBConnection.getFACTORY().openSession()){
            TypedQuery<HDCT> query = session.createQuery("from HoaDonChiTiet");
            hdcts = query.getResultList();
        }
        return hdcts;
    }
    public String save(HDCT hd){
        try(Session session = DBConnection.getFACTORY().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.save(hd);
                transaction.commit();
                System.out.println("hihi");
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Lỗi";
            }
        }
        return "Thành công";
    }
    public String delete(int id){
        System.out.println("hihihi");
        try(Session session = DBConnection.getFACTORY().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
           
            try {
                String sql = "DELETE from HoaDonChiTiet p WHERE p.STT = :MaHDCT";
                Query query = session.createQuery(sql);
                query.setParameter("id", id);
                int result = query.executeUpdate();
                System.out.println("hihihi");
                if (result == 0) {
                    id = 0;
                }
                
            } catch (Exception e) {
                e.printStackTrace();
                id = -1;
                return "Không thành công";
            }
            }
        return "Trả hàng thành công";
    }
}
