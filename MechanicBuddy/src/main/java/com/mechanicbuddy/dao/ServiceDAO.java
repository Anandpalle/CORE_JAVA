package com.mechanicbuddy.dao;

import java.util.List;
import com.mechanicbuddy.model.Service;

public interface ServiceDAO {

    boolean addService(Service service);

    List<Service> getServicesByMechanic(int mechanicId);

    Service getServiceById(int serviceId);

    List<Service> getAllServices();

}