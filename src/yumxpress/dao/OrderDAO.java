/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import yumxpress.dbutil.DBConnection;
import yumxpress.pojo.PlaceOrderPojo;

/**
 *
 * @author nehal0323
 */
public class OrderDAO {
    
       public static String getNewId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(order_id) from orders");
        rs.next();
        String id = rs.getString(1);
        String orderId = "";
        if (id != null) {
            id = id.substring(4);
            orderId = "ORD-" + (Integer.parseInt(id) + 1);
        } else {
            orderId = "ORD-101";
        }
        return orderId;
    }
       public static String placeOrder(PlaceOrderPojo placeOrder)throws SQLException{
            Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into orders values(?,?,?,?,?,?,?,?)");
       placeOrder.setOrderId(getNewId());
       ps.setString(1, placeOrder.getOrderId());
       ps.setString(2, placeOrder.getProductId());
       ps.setString(3,placeOrder.getCustomerId());
       ps.setString(4, placeOrder.getDeliveryStaffId());
       ps.setString(5, "");
       ps.setString(6, "ORDERED"); 
       ps.setString(7, placeOrder.getCompanyId());
       Random rand = new Random();
       int otp = rand .nextInt(1000);
       ps.setInt(8, otp);
       if(ps.executeUpdate()==1)
           return placeOrder.getOrderId();
       return null;
       }
        
    
}
