/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.XuatXu;
import Helpers.DataValidator;
import Helpers.MessageDialogHelper;
import Service.impl.QuanLyChiTietSanPhamService;
import Services.QuanLyChiTietSanPhamImpl;
import Services.XuatXuService;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author concu
 */
public class XuatXuJpanel extends javax.swing.JFrame {
    private XuatXuService xxService = new XuatXuService();
    private DefaultTableModel defaultTableModel;
    private QuanLyChiTietSanPhamService quanLySanPhamService = new QuanLyChiTietSanPhamImpl();
    /**
     * Creates new form XuatXuJpanel1
     */
    public XuatXuJpanel() {
        initComponents();
        
        loadTable(quanLySanPhamService.getListXuatXu());
        this.setLocationRelativeTo(null);
    }
    
    private void loadTable(ArrayList<XuatXu> list) {
        defaultTableModel = (DefaultTableModel) tbXuatXu.getModel();
        defaultTableModel.setRowCount(0);
        for (XuatXu xx : list) {
            defaultTableModel.addRow(new Object[]{
                xx.getMaXuatXu(), xx.getTenXuatXu(), xx.getTrangThai() == 1 ? "Hoạt động" : "Không hoạt động",});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbXuatXu = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        rbHoatdong = new javax.swing.JRadioButton();
        rbKhonghoatdong = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaXuatXu = new javax.swing.JTextField();
        txtTenXuatXu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbXuatXu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã xuất xứ", "Tên xuất xứ", "Trạng thái"
            }
        ));
        tbXuatXu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbXuatXuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbXuatXu);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThoat.setText("Exit");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        rbHoatdong.setText("Hoạt động");

        rbKhonghoatdong.setText("Không hoạt động");

        jLabel1.setText("Mã xuất xứ:");

        jLabel2.setText("Tên xuất xứ:");

        txtMaXuatXu.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbHoatdong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(rbKhonghoatdong))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaXuatXu, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(txtTenXuatXu)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnThoat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHoatdong)
                    .addComponent(rbKhonghoatdong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(229, 229, 229)
                        .addComponent(btnThoat))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbXuatXuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbXuatXuMouseClicked
        int selecRow = tbXuatXu.getSelectedRow();

        String maXX = tbXuatXu.getValueAt(selecRow, 0).toString();
        String tenXX = tbXuatXu.getValueAt(selecRow, 1).toString();
        String TrangThai = tbXuatXu.getValueAt(selecRow, 2).toString();

        txtMaXuatXu.setText(maXX);
        txtTenXuatXu.setText(tenXX);
    }//GEN-LAST:event_tbXuatXuMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();

        DataValidator.vailidateEmpty(txtTenXuatXu, sb, "Tên xuất xứ không được để trống");
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(this, sb.toString(), "Lỗi");
            return;
        }

        XuatXu xx = new XuatXu();

        String tenXX = txtTenXuatXu.getText();

        xx.setTenXuatXu(tenXX);
        xx.setTrangThai(rbHoatdong.isSelected() ? 1 : 0);
        try {

            int xacNhan = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thêm không", "Xác nhận", JOptionPane.YES_NO_OPTION);

            if (xacNhan == JOptionPane.YES_OPTION) {
                String result = xxService.AddXuatXu(xx);
                JOptionPane.showMessageDialog(this, result);
                loadTable(quanLySanPhamService.getListXuatXu());
                this.txtMaXuatXu.setText("");
                this.txtTenXuatXu.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không đúng định dạng");
            this.txtMaXuatXu.setText("");
            this.txtTenXuatXu.setText("");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XuatXuJpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XuatXuJpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XuatXuJpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XuatXuJpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XuatXuJpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbHoatdong;
    private javax.swing.JRadioButton rbKhonghoatdong;
    private javax.swing.JTable tbXuatXu;
    private javax.swing.JTextField txtMaXuatXu;
    private javax.swing.JTextField txtTenXuatXu;
    // End of variables declaration//GEN-END:variables
}
