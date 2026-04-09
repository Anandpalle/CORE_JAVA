package com.mechanicbuddy.dao;

import java.util.List;
import com.mechanicbuddy.model.Mechanic;

public interface MechanicDAO {

	boolean registerMechanic(Mechanic mechanic);

	Mechanic loginMechanic(String email, String password);

	List<Mechanic> searchMechanics(String city);

	List<Mechanic> getAllMechanics();

	boolean updateAvailability(int mechanicId, boolean availableStatus);

	boolean updateMechanic(Mechanic mechanic);
}