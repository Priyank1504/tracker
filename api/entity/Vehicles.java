package spring.priyank.tracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@NamedQueries({
	@NamedQuery(name = "Vehicles.findAll", query = "SELECT veh FROM Vehicles veh ORDER BY veh.vin DESC"),
	@NamedQuery(name = "Vehicles.findByVIN",
    query = "SELECT veh FROM Vehicles veh WHERE veh.vin=:paramVin")
})
public class Vehicles {
	 @Id
     @Column(columnDefinition = "VARCHAR(50)")
	 private String vin;
	
	 private String make;
	 private String model;
	 private int year;
	 private int redlineRpm;
	 private int maxFuelVolume;
	 private String lastServiceDate;
public String getVin() {
	return vin;
}
public void setVin(String vin) {
	this.vin = vin;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getRedlineRpm() {
	return redlineRpm;
}
public void setRedlineRpm(int redlineRpm) {
	this.redlineRpm = redlineRpm;
}
public int getMaxFuelVolume() {
	return maxFuelVolume;
}
public void setMaxFuelVolume(int maxFuelVolume) {
	this.maxFuelVolume = maxFuelVolume;
}
public String getLastServiceDate() {
	return lastServiceDate;
}
public void setLastServiceDate(String lastServiceDate) {
	this.lastServiceDate = lastServiceDate;
}
@Override
public String toString() {
	return "Vehicles [vin=" + vin + ", make=" + make + ", model=" + model + ", year=" + year + ", redlineRpm="
			+ redlineRpm + ", maxFuelVolume=" + maxFuelVolume + ", lastServiceDate=" + lastServiceDate + "]";
}
 

}
