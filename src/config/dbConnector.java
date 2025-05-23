package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class dbConnector {
 
    private Connection connect;
    
    public dbConnector(){
        try{
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/campo", "root", "");
        }catch(SQLException ex){
            System.out.println("Can't connect to database: "+ex.getMessage());
        }
    } 
    
    public ResultSet getData(String sql)throws SQLException{
        Statement stmt = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);       
        return rst;        
    }
    
        public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }  

        public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        }
        public void deleteData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Deleted Successfully!");
                        }else{
                            System.out.println("Data Delete Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        }
        
                    // Function to log user activity
        public void logActivity(int userId, String action) {
            String query = "INSERT INTO tbl_logs (log_uid, log_action) VALUES (?, ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(query)) {
                pstmt.setInt(1, userId);
                pstmt.setString(2, action);
                pstmt.executeUpdate();
                System.out.println("Activity logged: " + action);
            } catch (SQLException e) {
                System.out.println("Error logging activity: " + e.getMessage());
            }
        }
        
        public ResultSet getLogs() throws SQLException {
            String query = "SELECT l.log_id, u.u_user, l.log_action, l.log_timestamp FROM tbl_logs l " +
                           "JOIN tbl_user u ON l.log_uid = u.u_id " +
                           "ORDER BY l.log_timestamp DESC";
            return getData(query);
        }

    public Connection getConnection() {
        return connect;
    }
    
    public int getActiveUsersCount() {
            try {
                String sql = "SELECT COUNT(*) FROM tbl_admin WHERE u_status = 'Active'";
                PreparedStatement pst = connect.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (SQLException ex) {
                System.out.println("Error getting active users count: " + ex.getMessage());
            }
            return 0;
        }
    
    public int getCountWithCondition(String tableName, String condition) {
        int count = 0;
        try {
            String query = "SELECT COUNT(*) FROM " + tableName;
            if (condition != null && !condition.isEmpty()) {
                query += " WHERE " + condition;
            }

            ResultSet rs = getData(query);
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return count;
    }
    
     public int getCount(String tableName) {
            try {
                String sql = "SELECT COUNT(*) FROM " + tableName;
                PreparedStatement pst = connect.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (SQLException ex) {
                System.out.println("Error getting count: " + ex.getMessage());
            }
            return 0;
        }
}
