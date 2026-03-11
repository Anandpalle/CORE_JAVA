package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    private Connection con = null;

    public Connection getConnection() {
        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Database credentials
            String url = "jdbc:mysql://localhost:3306/anand_db";
            String user = "root";
            String password = "root";

            // 3. Establish connection
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace(); 
        }
        return con;
    }
}