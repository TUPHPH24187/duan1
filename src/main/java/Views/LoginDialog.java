/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Views;

import Utilities.DBConnection;

import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import DomainModels.ChucVu;
import DomainModels.NguoiDung;
import DomainModels.NhanVien;
import Helpers.DataValidator;
import Helpers.MessageDialogHelper;
import Helpers.ShareData;
import Repositories.NguoiDungRepository;
import org.jboss.jandex.Main;


import Repositories.NhanVienRepository;

/**
 *
 * @author concu
 */
public class LoginDialog extends javax.swing.JDialog {

    
    /**
     * Creates new form LoginDialog
     */
    public LoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegisterInfo = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        txtPasswork = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        lblRegisterTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRegisterTitle.setForeground(new java.awt.Color(51, 102, 255));
        lblRegisterTitle.setText("HỆ THỐNG BÁN GIÀY");

        lblUserName.setIcon(new javax.swing.ImageIcon("C:\\Users\\concu\\Downloads\\image\\user.png")); // NOI18N
        lblUserName.setText("Tên đăng nhập");

        lblPassword1.setIcon(new javax.swing.ImageIcon("C:\\Users\\concu\\Downloads\\image\\padlock.png")); // NOI18N
        lblPassword1.setText("Mật khẩu");

        btnThoat.setForeground(new java.awt.Color(255, 153, 51));
        btnThoat.setIcon(new javax.swing.ImageIcon("C:\\Users\\concu\\Downloads\\image\\power.png")); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnThoatMouseMoved(evt);
            }
        });
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThoatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThoatMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnThoatMouseReleased(evt);
            }
        });
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnDangNhap.setForeground(new java.awt.Color(255, 153, 51));
        btnDangNhap.setIcon(new javax.swing.ImageIcon("C:\\Users\\concu\\Downloads\\image\\login.png")); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
        pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);
        pnlRegisterInfoLayout.setHorizontalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(lblPassword1))
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblRegisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                                .addComponent(btnDangNhap)
                                .addGap(5, 5, 5)
                                .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addComponent(txtuser)
                            .addComponent(txtPasswork))
                        .addGap(33, 33, 33))))
        );
        pnlRegisterInfoLayout.setVerticalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblRegisterTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword1)
                    .addComponent(txtPasswork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap)
                    .addComponent(btnThoat))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseMoved

    }//GEN-LAST:event_btnThoatMouseMoved

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited

    }//GEN-LAST:event_btnThoatMouseExited

    private void btnThoatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMousePressed

    }//GEN-LAST:event_btnThoatMousePressed

    private void btnThoatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseReleased

    }//GEN-LAST:event_btnThoatMouseReleased

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.vailidateEmpty(txtuser, sb, "Tên đăng nhập không được để trống");
        DataValidator.vailidateEmpty(txtPasswork, sb, "Mật khẩu không được để trống");
        
        if(sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(this, sb.toString(),"Lỗi");
            return;
        }
        
        NguoiDungRepository ndRepo = new NguoiDungRepository();
        
        try {
            NguoiDung nd  = ndRepo.checkLogin(txtuser.getText(), new String(txtPasswork.getPassword()));
            if(nd == null) {
            MessageDialogHelper.showErrorDialog(this, "Tên đăng nhập hay mật khẩu sai", "Lỗi");
        }else{
            ShareData.nguoiDangNhap = nd;
            this.dispose();
        }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
        }

       
    }//GEN-LAST:event_btnDangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginDialog dialog = new LoginDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlRegisterInfo;
    private javax.swing.JPasswordField txtPasswork;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
