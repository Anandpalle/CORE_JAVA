package com.mechanicbuddy.dao;

import java.util.List;
import com.mechanicbuddy.model.ServiceRequest;

public interface ServiceRequestDAO {

	boolean createRequest(ServiceRequest request);

	List<ServiceRequest> getRequestsByUser(int userId);

	List<ServiceRequest> getRequestsByMechanic(int mechanicId);

	boolean updateStatus(int requestId, String status);

	List<ServiceRequest> getAllRequests();

boolean addRating(int requestId, int rating);
}