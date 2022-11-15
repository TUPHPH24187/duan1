/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NguoiDung;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author concu
 */
public class NguoiDungRepository {

    public NguoiDung checkLogin(String tenDangNhap, String matKhau) throws Exception {
        String sql = "select tenDangNhap,matKhau ,vaitro from NguoiDung"
                + "where tenDangNhap=? and matKhau = ? ";

        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement pst = con.prepareStatement(sql);) {
            pst.setString(1, tenDangNhap);
            pst.setString(2, matKhau);

            try ( ResultSet rs = pst.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaiTro(rs.getString("vaitro"));
                    return nd;
                }
            }
        }

        return null;
    }
}
