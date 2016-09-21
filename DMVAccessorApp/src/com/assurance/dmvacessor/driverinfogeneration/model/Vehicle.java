package com.assurance.dmvacessor.driverinfogeneration.model;


/**
 * @author Nikshitha Nagelly 
 * This entity class provides all vehicle information
 */

public class Vehicle {

	
	private String vin;
	
	private String year;
	
	private String make;
	
	private String model;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
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
}
