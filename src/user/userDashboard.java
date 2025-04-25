/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Start.login;
import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import medicine.meds;
import patient.patientdash;

/**
 *
 * @author russe
 */
public class userDashboard extends javax.swing.JFrame {

    private String u_user;

    /**
     * Creates new form userDashboard
     */
    public userDashboard() {
        initComponents();
    }
    Color hovercolor = new Color(0,102,153);
    Color navcolor = new Color(0,153,204);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        p_dashboard = new javax.swing.JPanel();
        dashboard1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        dashboard2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("LOGOUT");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_3161848.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 70));

        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        p_dashboard.setBackground(new java.awt.Color(0, 153, 204));
        p_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_dashboardMouseExited(evt);
            }
        });
        p_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard1.setBackground(new java.awt.Color(255, 255, 255));
        dashboard1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dashboard1.setForeground(new java.awt.Color(255, 255, 255));
        dashboard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard1.setText("ACCOUNT");
        dashboard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboard1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboard1MouseExited(evt);
            }
        });
        p_dashboard.add(dashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 19));

        jPanel1.add(p_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 190, 60));

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("PATIENT");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        jPanel4.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 19, 120, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 190, 60));

        dashboard2.setBackground(new java.awt.Color(255, 255, 255));
        dashboard2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dashboard2.setForeground(new java.awt.Color(255, 255, 255));
        dashboard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard2.setText("MEDICATION");
        dashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboard2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboard2MouseExited(evt);
            }
        });
        jPanel1.add(dashboard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 170, 20));

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 190, 60));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SCHOOL CLINIC SYSTEM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 460, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 720, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_logoutMouseExited

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked

    }//GEN-LAST:event_dashboardMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered

    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited

    }//GEN-LAST:event_dashboardMouseExited

    private void p_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_dashboardMouseClicked
       Session sess = Session.getInstance();
       dbConnector db = new dbConnector();
        try {
            String query = "SELECT u_contact FROM tbl_user WHERE u_id = '" + sess.getUid() + "'";
            ResultSet rs = db.getData(query);

            if (rs.next()) {
                    userDetails ud = new userDetails();
                    ud.con.setText(""+rs.getString("u_contact"));
                    ud.setVisible(true);
                    ud.setVisible(true);
                    this.dispose();
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_p_dashboardMouseClicked

    private void p_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_dashboardMouseEntered
        p_dashboard.setBackground(hovercolor);
    }//GEN-LAST:event_p_dashboardMouseEntered

    private void p_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_dashboardMouseExited
        p_dashboard.setBackground(navcolor);
    }//GEN-LAST:event_p_dashboardMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            dbConnector dbc = new dbConnector();
            login lg = new login();
            lg.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getInstance();
       if(sess.getUid() == 0){
        JOptionPane.showMessageDialog(null, "No account login, Go to login page");
        login lf = new login();
        lf.setVisible(true);
        this.dispose();
       }else{
            acc_name.setText(""+sess.getUser());
       }
    }//GEN-LAST:event_formWindowActivated

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
            patientdash pd = new patientdash();
            pd.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void dashboard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboard1MouseClicked

    private void dashboard1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboard1MouseEntered

    private void dashboard1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboard1MouseExited

    private void dashboard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboard2MouseClicked

    private void dashboard2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboard2MouseEntered

    private void dashboard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboard2MouseExited

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
      meds md = new meds();
      md.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

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
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new userDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel dashboard1;
    private javax.swing.JLabel dashboard2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel p_dashboard;
    // End of variables declaration//GEN-END:variables

    
}
