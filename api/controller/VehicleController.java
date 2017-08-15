package spring.priyank.tracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;	
import org.springframework.web.bind.annotation.RestController;
import spring.priyank.tracker.entity.Vehicles;
import spring.priyank.tracker.service.VehiclesService;
@RestController
@CrossOrigin(origins = "http://mocker.egen.io")
@RequestMapping(value="vehicles")
public class VehicleController {
	@Autowired
	VehiclesService services;
	@RequestMapping(value="getAllVehicles",method=RequestMethod.GET)
	public List<Vehicles> findAll(){
		//return new ArrayList<Vehicles>();
		return services.findAll();	
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Vehicles findOne(@PathVariable("id") String vehicleVIN){
		return services.findOne(vehicleVIN);
		
	}
	@RequestMapping(method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Vehicles> create(@RequestBody List<Vehicles> veh){
		return services.create(veh);
		 
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public Vehicles update(@PathVariable("id") String vehicleVIN, @RequestBody Vehicles veh){
		return services.update(vehicleVIN, veh);
		
	}
	
}
