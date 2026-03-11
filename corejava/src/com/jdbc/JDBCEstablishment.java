package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCEstablishment implements JDBCEstablishmentInterface {

    @Override
    public void insert() {
        String sql = "INSERT INTO student (student_name, student_marks) VALUES (?, ?)";
        try (Connection con = new DBconnection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "chintu");
            ps.setInt(2, 96);

            int n = ps.executeUpdate();
            if (n > 0) {
                System.out.println(n + " rows affected");
            } else {
                System.out.println("Something went wrong!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void select() {
        String sql = "SELECT * FROM student";
        try (Connection con = new DBconnection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("student_id") + " | " +
                    rs.getString("student_name") + " | " +
                    rs.getInt("student_marks")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}