package com.mechanicbuddy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mechanicbuddy.model.Mechanic;
import com.mechanicbuddy.utility.DBConnection;

public class MechanicDAOImpl implements MechanicDAO {

	@Override
	public boolean registerMechanic(Mechanic m) {

		try {

			Connection con = DBConnection.getConnection();

			String sql = "insert into mechanics(name,email,phone,specialization,city,password) values(?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, m.getName());
			ps.setString(2, m.getEmail());
			ps.setString(3, m.getPhone());
			ps.setString(4, m.getSpecialization());
			ps.setString(5, m.getCity());
			ps.setString(6, m.getPassword());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Mechanic loginMechanic(String email, String password) {

	    Mechanic m = null;

	    try {

	        Connection con = DBConnection.getConnection();

	        String sql = "select * from mechanics where email=? and password=?";

	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setString(1, email);
	        ps.setString(2, password);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {

	            m = new Mechanic();

	            m.setMechanicId(rs.getInt("mechanic_id"));
	            m.setName(rs.getString("name"));
	            m.setEmail(rs.getString("email"));
	            m.setPhone(rs.getString("phone"));
	            m.setSpecialization(rs.getString("specialization"));
	            m.setCity(rs.getString("city"));
	            m.setAvailableStatus(rs.getBoolean("available_status"));

	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return m;
	}
	

	@Override
	public List<Mechanic> searchMechanics(String city) {

		List<Mechanic> list = new ArrayList<>();

		try {

			Connection con = DBConnection.getConnection();

			String sql = "select * from mechanics where city=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, city);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
			    Mechanic m = new Mechanic();
			    m.setMechanicId(rs.getInt("mechanic_id"));
			    m.setPhone(rs.getString("phone"));
			    m.setName(rs.getString("name"));
			    m.setSpecialization(rs.getString("specialization"));
			    m.setExperienceYears(rs.getInt("experience_years"));
			    m.setCity(rs.getString("city"));
			    m.setAvailableStatus(rs.getBoolean("available_status"));  
			    m.setRating(rs.getDouble("rating"));                     
			    list.add(m);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Mechanic> getAllMechanics() {

		List<Mechanic> mechanicList = new ArrayList<>();

		try {

			Connection con = DBConnection.getConnection();

			String sql = "SELECT * FROM mechanics";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
			    Mechanic mechanic = new Mechanic();
			    mechanic.setMechanicId(rs.getInt("mechanic_id"));
			    mechanic.setName(rs.getString("name"));
			    mechanic.setEmail(rs.getString("email"));
			    mechanic.setPhone(rs.getString("phone"));
			    mechanic.setPassword(rs.getString("password"));
			    mechanic.setExperienceYears(rs.getInt("experience_years"));
			    mechanic.setSpecialization(rs.getString("specialization"));
			    mechanic.setCity(rs.getString("city"));
			    mechanic.setState(rs.getString("state"));
			    mechanic.setAvailableStatus(rs.getBoolean("available_status")); 
			    mechanic.setRating(rs.getDouble("rating"));                    
			    mechanicList.add(mechanic);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return mechanicList;
	}

	public boolean updateAvailability(int mechanicId, boolean availableStatus) {

		boolean status = false;

		try {

			Connection con = DBConnection.getConnection();

			String sql = "update mechanics set available_status=? where mechanic_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setBoolean(1, availableStatus);
			ps.setInt(2, mechanicId);

			int rows = ps.executeUpdate();

			if (rows > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public boolean updateMechanic(Mechanic m) {

		boolean status = false;

		try {

			Connection con = DBConnection.getConnection();

			String sql = "update mechanics set name=?,phone=?,specialization=?,city=? where mechanic_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, m.getName());
			ps.setString(2, m.getPhone());
			ps.setString(3, m.getSpecialization());
			ps.setString(4, m.getCity());
			ps.setInt(5, m.getMechanicId());

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