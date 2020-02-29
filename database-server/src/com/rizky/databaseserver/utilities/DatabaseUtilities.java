/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizky.databaseserver.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhamad Rizky
 */
public class DatabaseUtilities {
    
    private static Connection connection;

    public static Connection getConnection() {
        
        if (connection == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                //default port "jdbc:mysql://localhost:3306/clientServer", "root", ""
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientServer", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }    
}