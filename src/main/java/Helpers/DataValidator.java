/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
    
    public static void vailidatePhoneNumber(JTextField field, StringBuilder sb) {
        if (field.getText().startsWith("03") || field.getText().startsWith("09")) {
            if (field.getText().length() == 10) {
                field.setBackground(Color.white);

            } else {
                sb.append("Số điện thoại phải 10 kí tự").append("\n");
                field.setBackground(Color.red);
                field.requestFocus();
            }
        } else {
            sb.append("Vui Lòng nhập số điện thoại đầu 03 hoặc 09").append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }
    }

    public static boolean vailidateDate(JTextField field, StringBuilder sb) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        return sdf.parse(field.getText(), new ParsePosition(0)) != null;
    }

    public static void checkVailidateDate(JTextField field, StringBuilder sb) throws ParseException {
        if (vailidateDate(field, sb)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDateTime now = LocalDateTime.now();
            String dateNow = dtf.format(now);
            Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(field.getText());
            Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(dateNow);
            if (date1.after(date2) == true) {
                sb.append("Vui Lòng nhập ngày nhỏ hơn ngày hiện tại").append("\n");
                field.setBackground(Color.red);
                field.requestFocus();
            } else {
                field.setBackground(Color.white);
            }
        } else {
            sb.append("Sai Định Dạng Ngày").append("\n");
            field.setBackground(Color.red);
            field.requestFocus();

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
