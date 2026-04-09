package com.mechanicbuddy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mechanicbuddy.model.User;
import com.mechanicbuddy.utility.DBConnection;

public class UserDAOImpl implements UserDAO {

	// =========================
	// Register User
	// =========================
	@Override
	public boolean registerUser(User user) {

		boolean status = false;

		try {

			Connection con = DBConnection.getConnection();

			String sql = "INSERT INTO users(name,email,phone,password,address,city,state,pincode) VALUES(?,?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhone());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getCity());
			ps.setString(7, user.getState());
			ps.setString(8, user.getPincode());

			int rows = ps.executeUpdate();

			if (rows > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	// =========================
	// Login User
	// =========================
	@Override
	public User loginUser(String email, String password) {

		User user = null;

		try {

			Connection con = DBConnection.getConnection();

			String sql = "SELECT * FROM users WHERE email=? AND password=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				user = new User();

				user.setUserId(rs.getInt("user_id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setAddress(rs.getString("address"));
				user.setCity(rs.getString("city"));
				user.setState(rs.getString("state"));
				user.setPincode(rs.getString("pincode"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	// =========================
	// Get All Users
	// =========================
	@Override
	public List<User> getAllUsers() {

		List<User> list = new ArrayList<>();

		try {

			Connection con = DBConnection.getConnection();

			String sql = "SELECT * FROM users";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				User user = new User();

				user.setUserId(rs.getInt("user_id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setAddress(rs.getString("address"));
				user.setCity(rs.getString("city"));
				user.setState(rs.getString("state"));
				user.setPincode(rs.getString("pincode"));

				list.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public boolean updateUser(User user) {

		boolean status = false;

		try {

			Connection con = DBConnection.getConnection();

			String sql = "update users set name=?,phone=?,address=?,city=?,state=?,pincode=? where email=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user.getName());
			ps.setString(2, user.getPhone());
			ps.setString(3, user.getAddress());
			ps.setString(4, user.getCity());
			ps.setString(5, user.getState());
			ps.setString(6, user.getPincode());
			ps.setString(7, user.getEmail());

			int rows = ps.executeUpdate();

			if (rows > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
}