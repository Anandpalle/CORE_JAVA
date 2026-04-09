package com.mechanicbuddy.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mechanicbuddy.model.ServiceRequest;
import com.mechanicbuddy.utility.DBConnection;

public class ServiceRequestDAOImpl implements ServiceRequestDAO {

    // ================= CREATE REQUEST =================
    @Override
    public boolean createRequest(ServiceRequest request) {
        boolean status = false;

        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO service_requests " +
                    "(user_id, mechanic_id, service_id, problem_description, service_location, status, request_date) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, request.getUserId());
            ps.setInt(2, request.getMechanicId());
            ps.setInt(3, request.getServiceId());
            ps.setString(4, request.getProblemDescription());
            ps.setString(5, request.getServiceLocation());
            ps.setString(6, "Pending");
            ps.setTimestamp(7, Timestamp.valueOf(request.getRequestDate()));

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // ================= USER REQUESTS =================
    @Override
    public List<ServiceRequest> getRequestsByUser(int userId) {
        List<ServiceRequest> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM service_requests WHERE user_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(mapRow(rs));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ================= MECHANIC REQUESTS (IMPORTANT 🔥) =================
    @Override
    public List<ServiceRequest> getRequestsByMechanic(int mechanicId) {
        List<ServiceRequest> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            // 🔥 You can upgrade this query to join user table (see below)
            String sql = "SELECT * FROM service_requests WHERE mechanic_id=? ORDER BY request_date DESC";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mechanicId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(mapRow(rs));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ================= ALL REQUESTS =================
    @Override
    public List<ServiceRequest> getAllRequests() {
        List<ServiceRequest> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM service_requests ORDER BY request_date DESC";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(mapRow(rs));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ================= UPDATE STATUS =================
    @Override
    public boolean updateStatus(int requestId, String status) {
        try (Connection con = DBConnection.getConnection()) {

            String sql = "UPDATE service_requests SET status=? WHERE request_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, requestId);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // ================= ADD RATING =================
    @Override
    public boolean addRating(int requestId, int rating) {
        try (Connection con = DBConnection.getConnection()) {

            String sql = "UPDATE service_requests SET rating=? WHERE request_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rating);
            ps.setInt(2, requestId);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // ================= COMMON MAPPER =================
    private ServiceRequest mapRow(ResultSet rs) throws SQLException {

        ServiceRequest s = new ServiceRequest();

        s.setRequestId(rs.getInt("request_id"));
        s.setUserId(rs.getInt("user_id"));
        s.setMechanicId(rs.getInt("mechanic_id"));
        s.setServiceId(rs.getInt("service_id"));
        s.setProblemDescription(rs.getString("problem_description"));
        s.setServiceLocation(rs.getString("service_location"));

        Timestamp ts = rs.getTimestamp("request_date");
        if (ts != null) {
            s.setRequestDate(ts.toLocalDateTime());
        }

        s.setStatus(rs.getString("status"));

        return s;
    }
}