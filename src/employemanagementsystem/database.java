/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asus
 */
class database {
    
     public static Connection connectDb(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "root");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
     
     public static void main(String[] args) {
        Connection connection = database.connectDb();
        if (connection != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
    
}
