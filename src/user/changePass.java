/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Start.login;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC
 */
public class changePass extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public changePass() {
        initComponents();
    }   
    Color hovercolor = new Color (255,204,204);
    Color navcolor = new Color(204,204,255);  
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        oldpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        changepass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(410, 480));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Old Password: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 131, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("New Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 131, 30));

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 110, 30));
        jPanel1.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, 30));

        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BACK");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 70, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CHANGE PASSWORD");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 43));

        changepass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        changepass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepass.setText("Add Security Question? Click here");
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
        });
        jPanel1.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 240, 29));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      userDetails lfr = new userDetails();
       lfr.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String oldpass1 = new String(oldpass.getPassword());
        String password1 = new String(newpass.getPassword());
        dbConnector dbc = new dbConnector();
        Session sess = Session.getInstance();

        if (oldpass1.isEmpty() || password1.isEmpty()){
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (newpass.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
            newpass.setText("");
        } else {
            try {
                String query = "SELECT u_pass FROM tbl_user WHERE u_id = " + sess.getUid() + ";";
                ResultSet rs = dbc.getData(query);

                if (rs.next()) {
                    String oldbpass = rs.getString("u_pass");
                    String oldhash = passwordHasher.hashPassword(oldpass.getText());
                    String npass = passwordHasher.hashPassword(newpass.getText());

                    if (oldbpass.equals(oldhash)) {
                        if (oldbpass.equals(npass)) {
                            JOptionPane.showMessageDialog(null, "Old Password and New Password cannot be the same!");
                            newpass.setText("");
                        } else {
                            dbc.updateData("UPDATE tbl_user SET u_pass = '" + npass + "' WHERE u_id = '" + sess.getUid() + "'");
                            JOptionPane.showMessageDialog(null, "Password Changed Successfully!");

                            login lf = new login();
                            lf.setVisible(true);
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Old Password is Incorrect!");
                        oldpass.setText("");
                    }
                }
            } catch (SQLException | NoSuchAlgorithmException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        SecurityQ sq = new SecurityQ();
        sq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changepassMouseClicked

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
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changepass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    // End of variables declaration//GEN-END:variables
}
