/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import Start.login;
import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Christian
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDasboard
     */
    public adminDashboard() {
        initComponents();
        displayLogs();
    }
    
        public void displayLogs() {
        try {
            dbConnector db = new dbConnector();
            ResultSet rs = db.getLogs();
            table_user.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch(SQLException e) {
            System.out.println("Error loading logs: "+e.getMessage());
        }
    }
    
    Color hovercolor = new Color(0,102,153);
    Color navcolor = new Color(0,153,204);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        p_dashboard = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        p_users = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        p_settings = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        p_logs = new javax.swing.JPanel();
        logs1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_3161848.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, 70));

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
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

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

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("DASHBOARD");
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
        p_dashboard.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 22, -1, 19));

        jPanel2.add(p_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 60));

        p_users.setBackground(new java.awt.Color(0, 153, 204));
        p_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_usersMouseExited(evt);
            }
        });
        p_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setBackground(new java.awt.Color(255, 255, 255));
        users.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        users.setForeground(new java.awt.Color(255, 255, 255));
        users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users.setText("USERS");
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        p_users.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 19, 93, 20));

        jPanel2.add(p_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 60));

        p_settings.setBackground(new java.awt.Color(0, 153, 204));
        p_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_settingsMouseExited(evt);
            }
        });
        p_settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SETTINGS");
        p_settings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 230, 21));

        jPanel2.add(p_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 230, 60));

        p_logs.setBackground(new java.awt.Color(0, 153, 204));
        p_logs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_logsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_logsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_logsMouseExited(evt);
            }
        });
        p_logs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logs1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logs1.setForeground(new java.awt.Color(255, 255, 255));
        logs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logs1.setText("LOGS");
        logs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logs1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logs1MouseExited(evt);
            }
        });
        p_logs.add(logs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 230, 20));

        jPanel2.add(p_logs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table_user);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 660, 230));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 190, 120));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            dbConnector dbc = new dbConnector();
            Session sess = Session.getInstance();
            dbc.logActivity(sess.getUid(), "User Logout: " +sess.getUser());
            login lg = new login();
            lg.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

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
        this.setVisible(true);
    }//GEN-LAST:event_p_dashboardMouseClicked

    private void p_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_dashboardMouseEntered
        p_dashboard.setBackground(hovercolor);
    }//GEN-LAST:event_p_dashboardMouseEntered

    private void p_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_dashboardMouseExited
        p_dashboard.setBackground(navcolor);
    }//GEN-LAST:event_p_dashboardMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked

    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered

    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited

    }//GEN-LAST:event_usersMouseExited

    private void p_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_usersMouseClicked
        User_forms uf = new User_forms();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_usersMouseClicked

    private void p_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_usersMouseEntered
        p_users.setBackground(hovercolor);
    }//GEN-LAST:event_p_usersMouseEntered

    private void p_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_usersMouseExited
        p_users.setBackground(navcolor);
    }//GEN-LAST:event_p_usersMouseExited

    private void p_settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_settingsMouseEntered
        p_settings.setBackground(hovercolor);
    }//GEN-LAST:event_p_settingsMouseEntered

    private void p_settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_settingsMouseExited
        p_settings.setBackground(navcolor);
    }//GEN-LAST:event_p_settingsMouseExited

    private void logs1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logs1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logs1MouseEntered

    private void logs1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logs1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logs1MouseExited

    private void p_logsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_logsMouseEntered
        p_logs.setBackground(hovercolor);
    }//GEN-LAST:event_p_logsMouseEntered

    private void p_logsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_logsMouseExited
        p_logs.setBackground(navcolor);
    }//GEN-LAST:event_p_logsMouseExited

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

    private void p_logsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_logsMouseClicked
        logsForm lf = new logsForm();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_logsMouseClicked

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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logs1;
    private javax.swing.JPanel p_dashboard;
    private javax.swing.JPanel p_logs;
    private javax.swing.JPanel p_settings;
    private javax.swing.JPanel p_users;
    private javax.swing.JTable table_user;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
