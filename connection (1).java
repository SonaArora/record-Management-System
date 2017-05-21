/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentrecordmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sonal
 */

public class connection {
    
    public static Connection connect() throws SQLException
    {
        Connection c=null;
        try {
             Class.forName("com.mysql.jdbc.Driver");
             String s="jdbc:mysql://localhost/studentrecordmanagement";
             c=DriverManager.getConnection(s,"root","");
             System.out.println(c);
             System.out.println("Connection  established");
            return c;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    }
    public static void main(String[] args) {
        try {
            connect();
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
