/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernateConfig;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author concu
 */
public class DBContext {
    
   
    
    public static Connection getConnection()  throws ClassNotFoundException{
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLBG";
            String user = "sa";
            String pass = "123456";
            conn = DriverManager.getConnection(url, user, pass);
            if(conn != null) {
                //System.out.println("KEt Noi thanh cong");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
    
    
    
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        String dbpn = conn.getMetaData().getDatabaseProductName();
        System.out.println(dbpn);
    }
 
    
   
}
