package com.mechanicbuddy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mechanicbuddy.utility.DBConnection;

public class AdminDAOImpl implements AdminDAO {

    public boolean loginAdmin(String email,String password) {

        boolean status=false;

        try {

            Connection con = DBConnection.getConnection();

            String sql="select * from admin where email=? and password=?";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,email);
            ps.setString(2,password);

            ResultSet rs=ps.executeQuery();

            if(rs.next()) {

                status=true;

            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        return status;
    }
}