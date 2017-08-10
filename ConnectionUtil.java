/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hitBrain
 */
public class ConnectionUtil {
    static String URL = "jdbc:sqlserver://localhost:1433;database=EmployeeDB";
    static String USER = "test";
    static String PASSWORD = "1234";
    public static Connection getConnection()
    {
        try { 
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
