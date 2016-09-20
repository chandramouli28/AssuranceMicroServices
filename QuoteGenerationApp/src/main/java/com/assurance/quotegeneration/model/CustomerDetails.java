package com.assurance.quotegeneration.model;

import java.util.List;


/**
 * @Entity CustomerDetails
 * @author Srinivas Kondapaneni
 *
 */
public class CustomerDetails {

	private List<String> driverList;
	private String ssn;
	private String vin;
	private String education;
	private int vehicleMakeYear;

	public int getVehicleMakeYear() {
		return vehicleMakeYear;
	}

	public void setVehicleMakeYear(int vehicleMakeYear) {
		this.vehicleMakeYear = vehicleMakeYear;
	}

	public List<String> getDriverList() {
		return driverList;
	}

	public void setDriverList(List<String> driverList) {
		this.driverList = driverList;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

}
