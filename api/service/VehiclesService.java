package spring.priyank.tracker.service;

import java.util.List;

import spring.priyank.tracker.entity.Vehicles;

public interface VehiclesService {

	    List<Vehicles> findAll();

	    Vehicles findOne(String vehicleVIN);

	    List<Vehicles> create(List<Vehicles> veh);

	    Vehicles update(String vehicleVIN, Vehicles veh);
	
}
