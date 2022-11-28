/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author concu
 */
public class DataValidator {
    public static void vailidateEmpty(JTextField field, StringBuilder sb,String errorMessage) {
        if (field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
    
    public static void vailidateEmpty(JPasswordField field, StringBuilder sb,String errorMessage) {
        String passwork = new String(field.getPassword());
        if (passwork.equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }

    public static void vailidateEmpty(JDateChooser JDNS, StringBuilder nv, String ngày_sinh_không_được_để_trống) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
