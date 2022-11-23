/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import DomainModels.HoaDon;
import Repositories.HoaDonDAO;
import ViewModels.HoaDonView;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class HoaDonService {
    HoaDonDAO hoaDonDAO;

    public HoaDonService() {
        hoaDonDAO = new HoaDonDAO();
    }
    public List<HoaDon> getList(){
        return hoaDonDAO.getList();
    }
    public List<HoaDon> getListThanhToan(){
        return hoaDonDAO.getListThanhToan();
    }
    public String add(HoaDonView x){
        return hoaDonDAO.save(new HoaDon(x.getMaHoaDon(), x.getNgayTao(), x.getMaKhachHang(), x.getMaNhanVien(),x.getTrangThai()));
    }
    public String edit(HoaDonView x){
        return hoaDonDAO.update(new HoaDon(x.getMaHoaDon(), x.getNgayTao(), x.getMaKhachHang(), x.getMaNhanVien(),x.getTrangThai()));
    }
    public List timKiemHoaDonTT(int ma){
        List<HoaDon> dons = new ArrayList<>();
        for (HoaDon x : hoaDonDAO.getListThanhToan()) {
            if(x.getMaKhachHang().getMaKhachHang() == ma){
                dons.add(x);
            }
        }
        return dons;
    }
}
