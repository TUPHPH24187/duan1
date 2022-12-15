/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import DomainModels.ChiTietSanPham;
import Helpers.DataValidator;
import Helpers.MessageDialogHelper;
import Service.impl.QuanLyChiTietSanPhamService;
import Services.KhuyenMaiService;
import Services.QuanLyChiTietSanPhamImpl;
import ViewModels.KhanhHangViewModel;
import ViewModels.KhuyenMaiViewModel;
import ViewModels.SanPhamView;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author concu
 */
public class QLKhuyenMai extends javax.swing.JPanel {

    KhuyenMaiService khuyenMaiService;
        private QuanLyChiTietSanPhamService quanLySanPhamService = new QuanLyChiTietSanPhamImpl();

    SanPhamView sanPhamView;

    /**
     * Creates new form QLKhuyenMai
     */
    public QLKhuyenMai() {
        initComponents();
        khuyenMaiService = new KhuyenMaiService();
        sanPhamView = new SanPhamView();
        hienTHi();
        hienTHiSanPham();
    }

    
      public void hienTHiSanPham() {
          DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
          model.setRowCount(0);
          ArrayList<ChiTietSanPham> sanPham = quanLySanPhamService.getListChiTietSanPham();
            for (ChiTietSanPham ctsp : sanPham) {
                Object[] ctsps = new Object[]{
                    ctsp.getMaCTSP(), ctsp.getTenCTSP(), ctsp.getXuatXu(), ctsp.getKichThuoc(),
                ctsp.getChatLieu(), ctsp.getSoLuong(), ctsp.getGiaBan(), ctsp.getGiaNhap(), 
                ctsp.getGiamGia(), ctsp.getTrangThai() == 1 ? "Hoạt động" : "Không hoạt động",};
                model.addRow(ctsps);
            }
    }
      
    
    public void hienTHi() {
        try {
            DefaultTableModel model = (DefaultTableModel) JBang.getModel();
            model.setRowCount(0);
            List<KhuyenMaiViewModel> khuyenMai = khuyenMaiService.layDSKM();
            for (KhuyenMaiViewModel km : khuyenMai) {
                Object[] kms = new Object[]{
                    km.getMaKhuyenMai(),
                    km.getTenKhuyenMai(),
                    km.getNgayBatDau(),
                    km.getNgayKetThuc(),
                    km.getGiamGia(),
                    km.getTrangThai() == 1 ? "Hoạt động" : "Không hoạt động",};
                model.addRow(kms);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//--thêm
     public void hienTHâi() {
        try {
            DefaultTableModel model = (DefaultTableModel) JBang.getModel();
            model.setRowCount(0);
            List<KhuyenMaiViewModel> khuyenMai = khuyenMaiService.layDSKM();
            for (KhuyenMaiViewModel km : khuyenMai) {
                Object[] kms = new Object[]{
                    km.getMaKhuyenMai(),
                    km.getTenKhuyenMai(),
                    km.getNgayBatDau(),
                    km.getNgayKetThuc(),
                    km.getGiamGia(),
                    km.getTrangThai() == 1 ? "Hoạt động" : "Không hoạt động",};
                model.addRow(kms);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //--thêm
     public void hienTHâ2i() {
        try {
            DefaultTableModel model = (DefaultTableModel) JBang.getModel();
            model.setRowCount(0);
            List<KhuyenMaiViewModel> khuyenMai = khuyenMaiService.layDSKM();
            for (KhuyenMaiViewModel km : khuyenMai) {
                Object[] kms = new Object[]{
                    km.getMaKhuyenMai(),
                    km.getTenKhuyenMai(),
                    km.getNgayBatDau(),
                    km.getNgayKetThuc(),
                    km.getGiamGia(),
                    km.getTrangThai() == 1 ? "Hoạt động" : "Không hoạt động",};
                model.addRow(kms);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public KhuyenMaiViewModel layTT() {
        
        String maKM = txtMaKM.getText();
        String tenCT = txtTen.getText();
        String maGG = txtMuc.getText();
        String ngayBD = dateBD.getDateStringOrEmptyString();
        String ngayKT = dateKT.getDateStringOrEmptyString();
      

        KhuyenMaiViewModel khuyenMai = new KhuyenMaiViewModel(Integer.parseInt(maKM), tenCT, ngayBD, ngayKT, Integer.parseInt(maGG), 1);
        return khuyenMai;
    }
    
    public KhuyenMaiViewModel layTT234() {
        
        String maKM = txtMaKM.getText();
        String tenCT = txtTen.getText();
        String maGG = txtMuc.getText();
        String ngayBD = dateBD.getText();
        String ngayKT = dateKT.getText();
      

        KhuyenMaiViewModel khuyenMai = new KhuyenMaiViewModel(Integer.parseInt(maKM), tenCT, ngayBD, ngayKT, Integer.parseInt(maGG), 1);
        return khuyenMai;
    }

    public void fill() {
        int index = JBang.getSelectedRow();
        String maKM = JBang.getValueAt(index, 0).toString();
        String tenKM = JBang.getValueAt(index, 1).toString();
        String ngayBD = JBang.getValueAt(index, 2).toString();
        String ngayKT = JBang.getValueAt(index, 3).toString();
        String giamGia = JBang.getValueAt(index, 4).toString();
        
        

        txtMaKM.setText(maKM);
        txtTen.setText(tenKM);
        
        dateBD.setText(ngayBD);
        dateKT.setText(ngayKT);
        txtMuc.setText(giamGia);
       
    }
    
    
    public void fill123() {
        int index = JBang.getSelectedRow();
        String maKM = JBang.getValueAt(index, 0).toString();
        String tenKM = JBang.getValueAt(index, 1).toString();
        String ngayBD = JBang.getValueAt(index, 2).toString();
        String ngayKT = JBang.getValueAt(index, 3).toString();
        String giamGia = JBang.getValueAt(index, 4).toString();
        
        

        txtMaKM.setText(maKM);
        txtTen.setText(tenKM);
        
        dateBD.setText(ngayBD);
        dateKT.setText(ngayKT);
        txtMuc.setText(giamGia);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JBang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtMuc = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnCapNhap = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        dateBD = new com.github.lgooddatepicker.components.DatePicker();
        dateKT = new com.github.lgooddatepicker.components.DatePicker();
        TrangThai = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHUYẾN MÃI");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MaCTSP", "TenCTSP", "MaChatLieu", "MaXuatXu", "MaKichThuoc", "SoLuong", "GiaNhap", "GiaBan", "GiamGia", "TrangThai"
            }
        ));
        jScrollPane1.setViewportView(tbSanPham);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên Khuyến Mãi", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Giảm Giá", "Trạng Thái"
            }
        ));
        JBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JBang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Danh sách sản phẩm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Danh sách khuyến mãi");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Tên chương trình");

        jLabel5.setText("Mức giảm giá (%)");

        jLabel6.setText("Ngày bắt đầu");

        jLabel7.setText("Ngày kết thúc");

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnCapNhap.setText("Cập nhập");
        btnCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã khuyến mãi");

        txtMaKM.setEnabled(false);

        btnCapNhat.setText("Load...");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCapNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMuc, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaKM)
                            .addComponent(dateBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(dateBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dateKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt Động", "Không Hoạt Động", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(467, 467, 467)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int index = JBang.getSelectedRow();
            String ma = JBang.getValueAt(index, 0).toString();
            khuyenMaiService.XoaKhuyenMai(txtMaKM.getText());
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            hienTHi();
        } catch (SQLException ex) {
            Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        
        
        
        
          try {
              StringBuilder km = new StringBuilder();

     
        DataValidator.vailidateEmpty(txtTen, km, "Tên không được để trống");
        
        DataValidator.vailidateEmpty(txtMuc, km, "Mức giảm giá không được để trống");
        
        DataValidator.vailidateMucGiam(txtMuc, km);
        
         if (txtMuc.getText().isBlank() || txtTen.getText().isBlank() || dateBD.getText().isBlank() || dateKT.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Bạn phải nhập đầy đủ thông tin");
                return;
            }
            if (dateBD.getDate().isAfter(LocalDate.now())) {
                JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải lớn hơn hoặc bằng ngày hiện tại");
                return;
            }
            if (dateBD.getDate().isAfter(dateKT.getDate())) {
                JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải lớn hơn ngày kết thúc");
                return;
            }
            if (Integer.parseInt(txtMuc.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0");
                return;
            }

            if (Integer.parseInt(txtMuc.getText()) == 0) {
                JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0");
                return;
            }
            if (Integer.parseInt(txtMuc.getText()) > 100) {
                JOptionPane.showMessageDialog(this, "Số lượng phải nhỏ hơn 100");
                return;
            }
            String regex = "^[a-zA-Z]+$";
            if (txtMuc.getText().matches(regex)) {
                JOptionPane.showMessageDialog(this, "Số lượng phải là số nguyên dương");
                return;
            }
            // TODO add your handling code here:
            KhuyenMaiViewModel khuyenMai = layTT();
            if (khuyenMaiService.ThemKhuyenMai(khuyenMai) == true) {
                JOptionPane.showMessageDialog(this, "Luu thành công");
                hienTHi();
            } else {
                JOptionPane.showMessageDialog(this, "Luu thất bại");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapActionPerformed
        // TODO add your handling code here:
        
         try {
            // TODO add your handling code here:
            KhuyenMaiViewModel khuyenMai = layTT();
            if (khuyenMaiService.SuaKhuyenMai(khuyenMai)) {
                JOptionPane.showMessageDialog(this, "Cap Nhat thành công");
                hienTHi();
            } else {
                JOptionPane.showMessageDialog(this, "Cap Nhat thất bại");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapNhapActionPerformed

    private void JBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBangMouseClicked

        // TODO add your handling code here:
        fill();
    }//GEN-LAST:event_JBangMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        txtMaKM.setText("");
        txtTen.setText("");
        dateBD.setText("");
        dateKT.setText("");
        txtMuc.setText("");
        
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        hienTHi();
        hienTHiSanPham();
        
        
        
        
        
    }//GEN-LAST:event_btnCapNhatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JBang;
    private javax.swing.JComboBox<String> TrangThai;
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnXoa;
    private com.github.lgooddatepicker.components.DatePicker dateBD;
    private com.github.lgooddatepicker.components.DatePicker dateKT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtMuc;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
