/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Helpers.DataValidator;
import Helpers.MessageDialogHelper;
import Services.QuanLyKhachHangSevice;
import ViewModels.KhanhHangViewModel;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author concu
 */
public class QLKhachHang extends javax.swing.JPanel {

    QuanLyKhachHangSevice quanLyKhachHangSevice;

    /**
     * Creates new form QLKhachHang
     */
    public QLKhachHang() {
        initComponents();
        quanLyKhachHangSevice = new QuanLyKhachHangSevice();
        hienTHi();
    }

    public void hienTHi() {
        try {
            DefaultTableModel model = (DefaultTableModel) JBang.getModel();
            model.setRowCount(0);
            List<KhanhHangViewModel> khachHang = quanLyKhachHangSevice.layDSKH();
            for (KhanhHangViewModel kh : khachHang) {
                Object[] khs = new Object[]{
                    kh.getMaKH(),
                    kh.getHoTen(),
                    kh.getNgaySinh(),
                    kh.getGioiTinh().contains("1") ? "Nam" : "Nữ",
                    kh.getsDT(),
                    kh.getDiaChi(),
                    kh.getTrangThai().contains("1") ? "Hoạt động" : "Không hoạt động",};
                model.addRow(khs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public KhanhHangViewModel layTT() {
        String gioiTinh;
        String maKH = txtMaKH.getText();
        String hoTen = txtTen.getText();
        String ngaySinh = txtNgaySinh.getText();
        if (rbNam.isSelected()) {
            gioiTinh = "1";
        } else {
            gioiTinh = "2";
        }
        String sDt = txtSDT.getText();
        String diaChi = txtDiaChi.getText();
        String trangThai = cbbTrangThai.getSelectedItem().toString();

        KhanhHangViewModel khanhHang = new KhanhHangViewModel(maKH, hoTen, ngaySinh, gioiTinh, sDt, diaChi, trangThai);
        return khanhHang;
    }

    public void fill() {
        int index = JBang.getSelectedRow();
        String maKH = JBang.getValueAt(index, 0).toString();
        String hoTen = JBang.getValueAt(index, 1).toString();
        String ngaySinh = JBang.getValueAt(index, 2).toString();
        String gioiTinh = JBang.getValueAt(index, 3).toString();
        String sDt = JBang.getValueAt(index, 4).toString();
        String diaChi = JBang.getValueAt(index, 5).toString();
        String trangThai = JBang.getValueAt(index, 6).toString();

        txtMaKH.setText(maKH);
        txtTen.setText(hoTen);
        txtNgaySinh.setText(ngaySinh);
        if (gioiTinh.contains("1")) {
            rbNam.setSelected(true);
            rbNu.setSelected(false);
        } else {
            rbNam.setSelected(false);
            rbNu.setSelected(true);

        }
        txtSDT.setText(sDt);
        txtDiaChi.setText(diaChi);
        cbbTrangThai.setSelectedItem(trangThai);
    }

    public void hienTHi1() {
        try {
            DefaultTableModel model = (DefaultTableModel) JBang.getModel();
            model.setRowCount(0);
            List<KhanhHangViewModel> khachHang = quanLyKhachHangSevice.layDSKH();
            for (KhanhHangViewModel kh : khachHang) {
                Object[] khs = new Object[]{
                    kh.getMaKH(),
                    kh.getHoTen(),
                    kh.getNgaySinh(),
                    kh.getGioiTinh().contains("1") ? "Nam" : "Nữ",
                    kh.getsDT(),
                    kh.getDiaChi(),
                    kh.getTrangThai().contains("1") ? "Hoạt động" : "Không hoạt động",};
                model.addRow(khs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public KhanhHangViewModel layTT1() {
        String gioiTinh;
        String maKH = txtMaKH.getText();
        String hoTen = txtTen.getText();
        String ngaySinh = txtNgaySinh.getText();
        if (rbNam.isSelected()) {
            gioiTinh = "1";
        } else {
            gioiTinh = "2";
        }
        String sDt = txtSDT.getText();
        String diaChi = txtDiaChi.getText();
        String trangThai = cbbTrangThai.getSelectedItem().toString();

        KhanhHangViewModel khanhHang = new KhanhHangViewModel(maKH, hoTen, ngaySinh, gioiTinh, sDt, diaChi, trangThai);
        return khanhHang;
    }

    public void fill1() {
        int index = JBang.getSelectedRow();
        String maKH = JBang.getValueAt(index, 0).toString();
        String hoTen = JBang.getValueAt(index, 1).toString();
        String ngaySinh = JBang.getValueAt(index, 2).toString();
        String gioiTinh = JBang.getValueAt(index, 3).toString();
        String sDt = JBang.getValueAt(index, 4).toString();
        String diaChi = JBang.getValueAt(index, 5).toString();
        String trangThai = JBang.getValueAt(index, 6).toString();

        txtMaKH.setText(maKH);
        txtTen.setText(hoTen);
        txtNgaySinh.setText(ngaySinh);
        if (gioiTinh.contains("1")) {
            rbNam.setSelected(true);
            rbNu.setSelected(false);
        } else {
            rbNam.setSelected(false);
            rbNu.setSelected(true);

        }
        txtSDT.setText(sDt);
        txtDiaChi.setText(diaChi);
        cbbTrangThai.setSelectedItem(trangThai);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtSDT = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        cbbTrangThai = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JBang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã KH:");

        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");

        buttonGroup1.add(rbNu);
        rbNu.setText("Nữ");

        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", " " }));
        cbbTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTrangThaiActionPerformed(evt);
            }
        });

        jLabel11.setText("Địa chỉ:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        JBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Họ Tên", "Ngày Sinh", "Giới Tính", "Số Điện Thoại", "Địa Chỉ", "Trạng Thái"
            }
        ));
        JBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JBang);

        jLabel2.setText("Họ Tên:");

        jLabel3.setText("Ngày sinh");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel4.setText("SĐT:");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel5.setText("Giới tính:");

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

        jLabel7.setText("Trạng thái:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTen)
                    .addComponent(txtNgaySinh)
                    .addComponent(cbbTrangThai, 0, 409, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoi))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                .addComponent(txtSDT)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbNam)
                            .addComponent(rbNu)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(5, 5, 5))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed

        txtMaKH.setText("");
        txtTen.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        txtNgaySinh.setText("");
        rbNam.setSelected(true);

    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "bạn muốn thêm không?", "THông báo", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.YES_OPTION) {
            StringBuilder kh = new StringBuilder();

            DataValidator.vailidateEmpty(txtMaKH, kh, "Mã KH không được để trống");
            DataValidator.vailidateEmpty(txtTen, kh, "Tên không được để trống");
            DataValidator.vailidateEmpty(txtNgaySinh, kh, "Ngày sinh không được để trống");
            DataValidator.vailidateEmpty(txtSDT, kh, "Số điện thoại không được để trống");
            DataValidator.vailidateEmpty(txtDiaChi, kh, "Địa chỉ không được để trống");

            DataValidator.vailidatePhoneNumber(txtSDT, kh);

            try {
                DataValidator.checkVailidateDate(txtNgaySinh, kh);
            } catch (ParseException ex) {
                Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (kh.length() > 0) {
                MessageDialogHelper.showErrorDialog(this, kh.toString(), "Lỗi");
                return;
            }

            try {
                // TODO add your handling code here:
                KhanhHangViewModel khachHang = layTT();
                if (quanLyKhachHangSevice.ThemKhachHang(khachHang) == true) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    hienTHi();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                    hienTHi();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnThemActionPerformed

    private void cbbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTrangThaiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "bạn muốn xóa không?", "THông báo", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.YES_OPTION) {
            try {
                // TODO add your handling code here:
                int index = JBang.getSelectedRow();
                String ma = JBang.getValueAt(index, 0).toString();
                if(quanLyKhachHangSevice.XoaKhachHang(txtMaKH.getText())){                 
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                hienTHi();
                }else{
                     JOptionPane.showMessageDialog(this, "Vui Lòng CHọn Dữ Liệu Muốn Xóa");
                     hienTHi();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void JBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBangMouseClicked
        // TODO add your handling code here:
        fill();
    }//GEN-LAST:event_JBangMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "bạn muốn sửa không?", "THông báo", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.YES_OPTION) {

            try {
                // TODO add your handling code here:
                KhanhHangViewModel khachHang = layTT();
                if (quanLyKhachHangSevice.SuaKhachHang(khachHang)) {
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    hienTHi();
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu muốn sửa");
                }
            } catch (SQLException ex) {
                Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JBang;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
