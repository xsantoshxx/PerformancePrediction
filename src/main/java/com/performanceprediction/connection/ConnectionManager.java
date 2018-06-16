/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.connection;

import java.sql.*;

/**
 *
 * @author sanji
 */
public class ConnectionManager {

    static Connection con;
    static String url;
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:spp";
    private static final String DB_USER = "system";
    private static final String DB_PASSWORD = "spp";

    public static Connection getConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Not Connected to Database");
        }

        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;

    }
}
