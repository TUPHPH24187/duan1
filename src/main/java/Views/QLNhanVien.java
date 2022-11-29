/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import DomainModels.NhanVien;
import Helpers.DataValidator;
import Helpers.MessageDialogHelper;
import Repositories.NhanVienRepository;
import Services.NhanVienService;
import Utilities.DBConnection;
import ViewModels.KhanhHangViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author concu
 */
public class QLNhanVien extends javax.swing.JPanel {

    NhanVienService quanLyNhanVienService;

    private DefaultComboBoxModel defaultComboBoxModel;

    /**
     * Creates new form QLNhanVien
     */
    public QLNhanVien() {
        initComponents();

        quanLyNhanVienService = new NhanVienService();
        hienTHi();

    }

    public void hienTHi() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbNhanVien.getModel();
            model.setRowCount(0);
            List<NhanVien> nhanVien = quanLyNhanVienService.layNhanViens();
            String gioiTinh = "";
            for (NhanVien nv : nhanVien) {
                if (nv.getGioiTinh() == 1) {
                    gioiTinh = "Nam";
                } else {
                    gioiTinh = "Nu";
                }
                Object[] nds = new Object[]{nv.getMaNV(),
                    nv.getTenNV(), nv.getNgaySinh(), gioiTinh, nv.getSDT(), nv.getDiaChi(), nv.getEmail(), nv.getTrangThai(),};
                model.addRow(nds);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public NhanVien layTT() {
        Integer gioiTinh;
        Integer maNV = Integer.parseInt(txtManv.getText());
        String hoTen = txtTen.getText();
        String ngaySinh = txtns.getText();
        if (rbNam.isSelected()) {
            gioiTinh = 1;
        } else {
            gioiTinh = 2;
        }
        String SDT = txtSDT.getText();
        String DiaChi = txtDiaChi.getText();
        String Email = txtEmail.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        String chucVu = txtChucVu.getText();
        Integer tt;
        if (rbHoatDong.isSelected()) {
            tt = 1;

        } else {
            tt = 2;
        }
        NhanVien nv = new NhanVien(maNV, hoTen, ngaySinh, gioiTinh, SDT, DiaChi, Email, matKhau, chucVu, tt);
        return nv;

    }

    public void fill() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        int index = tbNhanVien.getSelectedRow();

        String ma = tbNhanVien.getValueAt(index, 0).toString();
        String Ten = tbNhanVien.getValueAt(index, 1).toString();
        String NgaySinh = tbNhanVien.getValueAt(index, 2).toString();
        String GioiTinh = tbNhanVien.getValueAt(index, 3).toString();
        String SDT = tbNhanVien.getValueAt(index, 4).toString();
        String DiaChi = tbNhanVien.getValueAt(index, 5).toString();
        String Email = tbNhanVien.getValueAt(index, 6).toString();
        String matKhau = tbNhanVien.getValueAt(index, 7).toString();
        String ChucVu = tbNhanVien.getValueAt(index, 8).toString();
        String TrangThai = tbNhanVien.getValueAt(index, 9).toString();
//            txtid.setText(id);
        txtManv.setText(ma);
        txtTen.setText(Ten);
        txtns.setText(NgaySinh);
        txtSDT.setText(SDT);
        txtDiaChi.setText(DiaChi);
        txtEmail.setText(Email);
        txtMatKhau.setText(matKhau);
        txtChucVu.setText(ChucVu);
        if (GioiTinh.equalsIgnoreCase("Nam")) {
            rbNam.setSelected(true);
        } else {
            rbNu.setSelected(true);
        }
        if (TrangThai.equalsIgnoreCase("HoatDong")) {
            rbHoatDong.setSelected(true);
        } else {
            rbKhonghoatDong.setSelected(true);
        }

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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtns = new javax.swing.JTextField();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        rbHoatDong = new javax.swing.JRadioButton();
        rbKhonghoatDong = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        txtChucVu = new javax.swing.JTextField();

        jLabel9.setText("Ngày sinh:");

        jLabel10.setText("Email:");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel11.setText("Địa chỉ:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");
        jLabel1.setMaximumSize(new java.awt.Dimension(139, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(139, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(139, 20));

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ma", "Tên NV", "Ngay Sinh", "Gioi Tinh", "So Dien Thoai", "Dia Chi", "Email", "TrangThai"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        jLabel2.setText("Họ Tên:");

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

        txtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnsActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNu);
        rbNu.setText("Nữ");

        buttonGroup3.add(rbHoatDong);
        rbHoatDong.setText("Hoat dong");
        rbHoatDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHoatDongActionPerformed(evt);
            }
        });

        buttonGroup3.add(rbKhonghoatDong);
        rbKhonghoatDong.setText("Khong hoat dong");

        jLabel3.setText("Ma nv:");

        jLabel6.setText("Mật khẩu:");

        jLabel8.setText("Chức vụ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbNam)
                                .addGap(40, 40, 40)
                                .addComponent(rbNu))
                            .addComponent(txtManv)
                            .addComponent(txtTen)
                            .addComponent(txtns, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49)
                        .addComponent(rbHoatDong)
                        .addGap(92, 92, 92)
                        .addComponent(rbKhonghoatDong))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail)
                                .addComponent(txtSDT)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtChucVu))))
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(510, 510, 510))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbNam)
                            .addComponent(rbNu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)
                            .addComponent(btnMoi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbKhonghoatDong))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        StringBuilder nv = new StringBuilder();

        DataValidator.vailidateEmpty(txtManv, nv, "Mã KH không được để trống");
        DataValidator.vailidateEmpty(txtTen, nv, "Tên không được để trống");
        DataValidator.vailidateEmpty(txtns, nv, "Ngày sinh không được để trống");
        DataValidator.vailidateEmpty(txtSDT, nv, "Số điện thoại không được để trống");
        DataValidator.vailidateEmpty(txtDiaChi, nv, "Địa chỉ không được để trống");
        DataValidator.vailidateEmpty(txtEmail, nv, "Email không được để trống");
        DataValidator.vailidateEmpty(txtMatKhau, nv, "Mật khẩu không được để trống");
        DataValidator.vailidateEmpty(txtChucVu, nv, "Chức vụ không được để trống");

        if (nv.length() > 0) {
            MessageDialogHelper.showErrorDialog(this, nv.toString(), "Lỗi");
            return;
        }

        try {
            // TODO add your handling code here:
            NhanVien nhanVien = layTT();
            if (quanLyNhanVienService.ThemNhanVien(nhanVien) == true) {
                JOptionPane.showMessageDialog(this, "Them Thanh Cong");
                hienTHi();
            } else {
                JOptionPane.showMessageDialog(this, "Them that Bai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnThemActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        fill();

    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNamActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            NhanVien nhanVien = layTT();
            int index = tbNhanVien.getSelectedRow();
            Integer Ma = Integer.parseInt(tbNhanVien.getValueAt(index, 0).toString());
            if (quanLyNhanVienService.XoaNhanVien(Ma) == true) {
                JOptionPane.showMessageDialog(this, "Xoa Thanh Cong");
                hienTHi();
            } else {
                JOptionPane.showMessageDialog(this, "Xoa that Bai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            NhanVien nhanVien = layTT();
            int index = tbNhanVien.getSelectedRow();
            Integer Ma = Integer.parseInt(tbNhanVien.getValueAt(index, 0).toString());
            if (quanLyNhanVienService.SuaNhanVien(nhanVien, Ma) == true) {
                JOptionPane.showMessageDialog(this, "Sua Thanh Cong");
                hienTHi();
            } else {
                JOptionPane.showMessageDialog(this, "Sua that Bai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:

        txtManv.setText("");
        txtTen.setText("");
        txtns.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        txtEmail.setText("");


    }//GEN-LAST:event_btnMoiActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnsActionPerformed

    private void rbHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHoatDongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbHoatDongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbHoatDong;
    private javax.swing.JRadioButton rbKhonghoatDong;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtManv;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtns;
    // End of variables declaration//GEN-END:variables
}
