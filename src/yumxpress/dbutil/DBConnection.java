/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author nehal0323
 */
public class DBConnection {
    private static Connection conn;
    static{
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "yumxpress", "foodie");
            JOptionPane.showMessageDialog(null,"Connection opened");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Cannot open the connection");
            ex.printStackTrace();
            //System.exit(0);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Cannot close the connection");
            ex.printStackTrace();
        }
    }
    
    
}

        
        
    

