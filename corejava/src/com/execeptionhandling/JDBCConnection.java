package com.execeptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCConnection {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        // 1. Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Database credentials
        String url = "jdbc:mysql://localhost:3306/anand_db";
        String user = "root";
        String password = "root";

        // 3. Establish connection
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Database connected successfully!");

        // 4. Create statement
        Statement st = con.createStatement();

        // 5. Execute query
        ResultSet rs = st.executeQuery("SELECT * FROM dept");

        while (rs.next()) {
            int deptno = rs.getInt("deptno");
            String dname = rs.getString("dname");
            String loc = rs.getString("loc");

            System.out.println(deptno + " | " + dname + " | " + loc);
        }

        // 6. Close resources
        rs.close();
        st.close();
        con.close();
    }
}
 