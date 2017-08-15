package spring.priyank.tracker.entity;
import java.util.ArrayList;


public class VehicleReading {
	private String vin;
	private float latitude;
	private float longitude;
	private int timestamp;
	private float fuelVolume;
	private float speed ;
	private float engineHp ;
	private boolean checkEngineLightOn;
	private boolean engineCoolantLow;
	private boolean cruiseControlOn;
	private int engineRpm;
	private ArrayList<Tires> tires = new ArrayList<Tires>();
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public int getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	public float getFuelVolume() {
		return fuelVolume;
	}
	public void setFuelVolume(float fuelVolume) {
		this.fuelVolume = fuelVolume;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getEngineHp() {
		return engineHp;
	}
	public void setEngineHp(float engineHp) {
		this.engineHp = engineHp;
	}
	public boolean isCheckEngineLightOn() {
		return checkEngineLightOn;
	}
	public void setCheckEngineLightOn(boolean checkEngineLightOn) {
		this.checkEngineLightOn = checkEngineLightOn;
	}
	public boolean isEngineCoolantLow() {
		return engineCoolantLow;
	}
	public void setEngineCoolantLow(boolean engineCoolantLow) {
		this.engineCoolantLow = engineCoolantLow;
	}
	public boolean isCruiseControlOn() {
		return cruiseControlOn;
	}
	public void setCruiseControlOn(boolean cruiseControlOn) {
		this.cruiseControlOn = cruiseControlOn;
	}
	public int getEngineRpm() {
		return engineRpm;
	}
	public void setEngineRpm(int engineRpm) {
		this.engineRpm = engineRpm;
	}
	public ArrayList<Tires> getTires() {
		return tires;
	}
	public void setTires(ArrayList<Tires> tires) {
		this.tires = tires;
	}
	
	
}
