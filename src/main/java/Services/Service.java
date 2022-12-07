/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;



import DomainModels.ThongKe;
import Repositories.ThongKeRepo;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Service {
     private final ThongKeRepo repo;

    public Service() {
        repo = new ThongKeRepo();
    }
     public List<ThongKe> thongKeTong(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeTong(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKeLe(String ngayBD, String ngayKT) {
        try {
            return repo.thongKele(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKeLetheoSP(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeletheoSP(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKeLetheoDT(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeletheoDT(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKeTuDau() {
        try {
            return repo.thongKeTuDau();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKehoanthanh() {
        try {
            return repo.thongKehoanthanh();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKeDangThanhToan() {
        try {
            return repo.thongKeDangThanhToan();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKehuy() {
        try {
            return repo.thongKeHuy();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     public List<ThongKe> thongKeTienMat() {
        try {
            return repo.thongKeTienMat();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public List<ThongKe> thongKeQuetThe() {
        try {
            return repo.thongKeQuetThe();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      
       public List<ThongKe> thongKeChuyenKhoan() {
        try {
            return repo.thongKeChuyenKhoan();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       
        public List<ThongKe> thongKeKHMoi() {
        try {
            return repo.thongKeKHMoi();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
         public List<ThongKe> thongKeKHTQ() {
        try {
            return repo.thongKeKHTQ();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public List<ThongKe> thongKeCMSN() {
        try {
            return repo.thongKeCMSN();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      
        public List<ThongKe> thongKehoanthanhTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKehoanthanhTheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKeDangThanhToanTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeDangThanhToanTheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ThongKe> thongKehuyTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeHuyTheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     public List<ThongKe> thongKeTienMatTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeTienMatTheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public List<ThongKe> thongKeQuetTheTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeQuetTheTheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      
       public List<ThongKe> thongKeChuyenKhoanTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeChuyenKhoantheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       
        public List<ThongKe> thongKeKHMoiTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeKHMoiTheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
         public List<ThongKe> thongKeKHTQTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeKHTQTheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public List<ThongKe> thongKeCMSNTheoNgay(String ngayBD, String ngayKT) {
        try {
            return repo.thongKeCMSNTheoNgay(ngayBD, ngayKT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
