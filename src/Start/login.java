package Start;

import admin.adminDashboard;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userDashboard;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }
    
    static String status;
    static String type;
    
    public static boolean loginAcc(String username, String password){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user WHERE u_user = '" + username + "'";
            ResultSet resultSet = connector.getData(query);
            if(resultSet.next()){
                String hashedPass = resultSet.getString("u_pass");
                String rehashedPass = passwordHasher.hashPassword(password);
                if(hashedPass.equals(rehashedPass)){
                    status = resultSet.getString("u_status");
                    type = resultSet.getString("u_type");
                        Session sess = Session.getInstance();
                        sess.setUid(resultSet.getInt("u_id"));
                        sess.setEmail(resultSet.getString("u_email"));
                        sess.setUser(resultSet.getString("u_user"));
                        sess.setType(resultSet.getString("u_type"));
                        sess.setStatus(resultSet.getString("u_status"));
                        return true;
                }else{
                    return false;
                }  
            }else{
                return false;
            }
            }catch (SQLException | NoSuchAlgorithmException ex){
                return false;
            }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        donthaveaccount = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        donthaveaccount1 = new javax.swing.JLabel();
        donthaveaccount2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/2-removebg-preview.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 400, 540));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("____________________________________________________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 710, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("SIGN IN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 260, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Enter Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 220, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Enter Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 220, 60));

        donthaveaccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donthaveaccount.setText("click here to Register");
        donthaveaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donthaveaccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donthaveaccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donthaveaccountMouseExited(evt);
            }
        });
        jPanel1.add(donthaveaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 150, 20));

        loginButton.setBackground(new java.awt.Color(102, 204, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginButton.setText("SUBMIT");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 150, 40));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 400, 40));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 400, 40));

        donthaveaccount1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donthaveaccount1.setText("Forgot Password? click here");
        donthaveaccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donthaveaccount1MouseClicked(evt);
            }
        });
        jPanel1.add(donthaveaccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 190, 20));

        donthaveaccount2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donthaveaccount2.setText("Don't have an account yet?   ");
        jPanel1.add(donthaveaccount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 190, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
    if(loginAcc(user.getText(), pass.getText())){
        if(!status.equals("Active")){
            JOptionPane.showMessageDialog(this, "In-Active Account contact Admin", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(type.equals("Admin")){
                dbConnector dbc = new dbConnector();
                JOptionPane.showMessageDialog(null, "Login Successfully!");
                Session sess = Session.getInstance();
                dbc.logActivity(sess.getUid(), "User Login: " + user.getText());
                adminDashboard ad = new adminDashboard();
                ad.setVisible(true);
                this.dispose();
            }else if(type.equals("User")){
                JOptionPane.showMessageDialog(null, "Login Successfully!");
                userDashboard ud = new userDashboard();
                ud.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "No Account type found contact the Admin", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }else{
        JOptionPane.showMessageDialog(this, "Invalid Account", "Error", JOptionPane.ERROR_MESSAGE);
        }                              
    }//GEN-LAST:event_loginButtonActionPerformed

    private void donthaveaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donthaveaccountMouseClicked
        register re = new register();
        re.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_donthaveaccountMouseClicked

    private void donthaveaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donthaveaccountMouseEntered
       
        donthaveaccount.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_donthaveaccountMouseEntered

    private void donthaveaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donthaveaccountMouseExited
        donthaveaccount.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_donthaveaccountMouseExited

    private void donthaveaccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donthaveaccount1MouseClicked
        emailSearch es = new emailSearch();
        es.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_donthaveaccount1MouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel donthaveaccount;
    private javax.swing.JLabel donthaveaccount1;
    private javax.swing.JLabel donthaveaccount2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}
