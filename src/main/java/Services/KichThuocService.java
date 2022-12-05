/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.KichThuoc;
import Repositories.KichThuocRepository;
import java.sql.SQLException;

/**
 *
 * @author concu
 */
public class KichThuocService {
    KichThuocRepository CLRepo = new KichThuocRepository();
    
    public String AddKichThuoc(KichThuoc kt) {
        if (CLRepo.add(kt)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }
    
    public boolean XoaKichThuoc(Integer maKT) throws SQLException {
        return CLRepo.XoaKichThuoc(maKT);
    }
}
