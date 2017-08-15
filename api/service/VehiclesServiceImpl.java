package spring.priyank.tracker.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.priyank.tracker.entity.Vehicles;
import spring.priyank.tracker.repository.VehiclesRepository;


@Service

public class VehiclesServiceImpl implements VehiclesService{
@Autowired
VehiclesRepository repo;
	@Transactional(readOnly=true)
	public List<Vehicles> findAll() {
	    return repo.findAll();
			    
	}

	public Vehicles findOne(String vehicleVIN) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	public List<Vehicles> create(List<Vehicles> veh) {
		String vin;
		List<Vehicles> result= new ArrayList<Vehicles>();
		for(Vehicles vehicle:veh){
			vin=vehicle.getVin();
			Vehicles existing=repo.findOne(vin);
			if(existing!=null){
				result.add(repo.update(vehicle));
			}else{
				result.add(repo.create(vehicle));
			}
		}
		return result;
	}
    @Transactional
	public Vehicles update(String vehicleVIN, Vehicles veh) {
		Vehicles existing= repo.findOne(vehicleVIN);
		if(existing==null)
		{
			repo.create(veh);
		}
		return repo.update(existing);
	}

//	public void delete(String vehicleVIN) {
//		// TODO Auto-generated method stub
//		
//	}
		

}
