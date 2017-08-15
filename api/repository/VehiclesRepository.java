package spring.priyank.tracker.repository;

import java.util.List;

import spring.priyank.tracker.entity.Vehicles;

public interface VehiclesRepository {
	List<Vehicles> findAll();

    Vehicles findOne(String vehicleVIN);

    Vehicles create(Vehicles veh);

    Vehicles update(Vehicles veh);


}
