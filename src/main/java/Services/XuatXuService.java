/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.XuatXu;
import Repositories.XuatXuRepository;

/**
 *
 * @author concu
 */
public class XuatXuService {
    XuatXuRepository xxRepo = new XuatXuRepository();
    
    public String AddXuatXu(XuatXu xx) {
        if (xxRepo.add(xx)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }
}
