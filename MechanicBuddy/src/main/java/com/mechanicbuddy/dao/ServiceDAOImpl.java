package com.mechanicbuddy.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mechanicbuddy.model.Service;
import com.mechanicbuddy.utility.DBConnection;

public class ServiceDAOImpl implements ServiceDAO {

	@Override
	public boolean addService(Service service) {
	    boolean status = false;

	    try (Connection con = DBConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(
	             "INSERT INTO services(mechanic_id, service_name, description, price) VALUES (?, ?, ?, ?)",
	             Statement.RETURN_GENERATED_KEYS)) {

	        ps.setInt(1, service.getMechanicId());
	        ps.setString(2, service.getServiceName());
	        ps.setString(3, service.getDescription());
	        ps.setDouble(4, service.getPrice());

	        int rows = ps.executeUpdate();

	        if (rows > 0) {
	            status = true;
	            try (ResultSet rs = ps.getGeneratedKeys()) {
	                if (rs.next()) {
	                    int generatedId = rs.getInt(1);
	                    service.setServiceId(generatedId); 
	                    System.out.println("Generated service_id: " + generatedId);
	                }
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return status;
	}


    @Override
    public List<Service> getServicesByMechanic(int mechanicId) {

        List<Service> list=new ArrayList<>();

        try {

            Connection con=DBConnection.getConnection();

            String sql="select * from services where mechanic_id=?";

            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, mechanicId);

            ResultSet rs=ps.executeQuery();

            while(rs.next()) {

                Service s=new Service();

                s.setServiceId(rs.getInt("service_id"));
                s.setMechanicId(rs.getInt("mechanic_id"));
                s.setServiceName(rs.getString("service_name"));
                s.setDescription(rs.getString("description"));
                s.setPrice(rs.getDouble("price"));

                list.add(s);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Service getServiceById(int serviceId) {

        Service s=null;

        try {

            Connection con=DBConnection.getConnection();

            String sql="select * from services where service_id=?";

            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, serviceId);

            ResultSet rs=ps.executeQuery();

            if(rs.next()) {

                s=new Service();

                s.setServiceId(rs.getInt("service_id"));
                s.setMechanicId(rs.getInt("mechanic_id"));
                s.setServiceName(rs.getString("service_name"));
                s.setDescription(rs.getString("description"));
                s.setPrice(rs.getDouble("price"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return s;
    }

    @Override
    public List<Service> getAllServices() {

        List<Service> list=new ArrayList<>();

        try {

            Connection con=DBConnection.getConnection();

            String sql="select * from services";

            PreparedStatement ps=con.prepareStatement(sql);

            ResultSet rs=ps.executeQuery();

            while(rs.next()) {

                Service s=new Service();

                s.setServiceId(rs.getInt("service_id"));
                s.setMechanicId(rs.getInt("mechanic_id"));
                s.setServiceName(rs.getString("service_name"));
                s.setDescription(rs.getString("description"));
                s.setPrice(rs.getDouble("price"));

                list.add(s);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}