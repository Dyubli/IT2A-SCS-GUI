package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



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

    public Connection getConnection() {
        return connect;
    }

}
