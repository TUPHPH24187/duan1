package Services;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import DomainModels.ChiTietSanPham;
import DomainModels.KichThuoc;
import DomainModels.ChatLieu;
import DomainModels.XuatXu;
import Repositories.ChiTietSanPhamRepository;
import Repositories.KichThuocRepository;
import Repositories.XuatXuRepository;
import Repositories.ChatLieuRepository;
import Service.impl.QuanLyChiTietSanPhamService;
import Utilities.DBConnection;
import ViewModels.SanPhamView;
import Views.QLSanPham;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;

public class QuanLyChiTietSanPhamImpl implements QuanLyChiTietSanPhamService {

    Session session = DBConnection.getFACTORY().openSession();

    private KichThuocRepository kichThuocRepository = new KichThuocRepository();
    private XuatXuRepository xuatXuRepository = new XuatXuRepository();
    private ChatLieuRepository chatLieuRepository = new ChatLieuRepository();

    private ChiTietSanPhamRepository chiTietsanPhamRepository = new ChiTietSanPhamRepository();

    @Override
    public ArrayList<ChiTietSanPham> getListChiTietSanPham() {
        return chiTietsanPhamRepository.getList();
    }

    @Override
    public ArrayList<ChatLieu> getListChatLieu() {
        return chatLieuRepository.getList();
    }

    @Override
    public ArrayList<XuatXu> getListXuatXu() {
        return xuatXuRepository.getList();
    }

    @Override
    public ArrayList<KichThuoc> getListKichThuoc() {
        return kichThuocRepository.getList();
    }

    @Override
    public String addCTSanPham(ChiTietSanPham ctsp) {
        if (chiTietsanPhamRepository.add(ctsp)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }

    }

    

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public QuanLyChiTietSanPhamImpl() {
        chiTietsanPhamRepository = new ChiTietSanPhamRepository();
    }

    @Override
    public List<ChiTietSanPham> layDSlayDSSP() throws SQLException {
        java.util.List<ChiTietSanPham> chiTietSanPhams = chiTietsanPhamRepository.layDSSP();
        java.util.List<ChiTietSanPham> qlChiTietSanPhams = new ArrayList<>();
        for (ChiTietSanPham ctsp : chiTietSanPhams) {

            qlChiTietSanPhams.add(new ChiTietSanPham(ctsp.getMaCTSP(), ctsp.getTenCTSP(), ctsp.getSoLuong(), ctsp.getGiaBan(),ctsp.getGiaNhap(), ctsp.getGiamGia(), ctsp.getTrangThai(),
                    ctsp.getKichThuoc(), ctsp.getXuatXu(), ctsp.getChatLieu()));
        }
        return qlChiTietSanPhams;
    }

    @Override
    public boolean XoaSanPham(Integer maCTSP) throws SQLException {
        return chiTietsanPhamRepository.XoaSanPham(maCTSP);
    }
    
    public List<ChiTietSanPham> timKiem(String ten){
        List<ChiTietSanPham> spS = new ArrayList<>();
        for (ChiTietSanPham x : chiTietsanPhamRepository.getList()) {
            if(x.getTenCTSP().toLowerCase().contains(ten.toLowerCase())){
                spS.add(x);
            }
        }
        return spS;
    }

        public boolean SuaSP(SanPhamView sp) throws SQLException {
       SanPhamView sp1 = new SanPhamView();
        sp1.setMaCTSP(sp.getMaCTSP());
        sp1.setTenCTSP(sp.getTenCTSP());
        sp1.setSoLuong(sp.getSoLuong());
        sp1.setGiaBan(sp.getGiaBan());
        sp1.setGiaNhap(sp.getGiaNhap());
        sp1.setGiamGia(sp.getGiamGia());
        sp1.setTrangThai(sp.getTrangThai());

        return chiTietsanPhamRepository.SuaSanPham(sp);
    }
    
    
   
    
}
