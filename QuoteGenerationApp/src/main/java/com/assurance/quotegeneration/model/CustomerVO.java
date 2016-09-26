package com.assurance.quotegeneration.model;

/**
 * @Entity CustomerVO
 * @author Srinivas Kondapaneni
 *
 */
public class CustomerVO {

	private int numOfClaimsOnVehicle;
	private double claimOnVehicle;
	private int numOfClaimsByDrivers;
	private int vehicleMakeYear;
	private boolean isPrimary;
	private int age;
	private int numOfTickets;
	private int points;
	private boolean hasPrevInsurance;
	private String educationLevel;
	

	public int getNumOfClaimsOnVehicle() {
		return numOfClaimsOnVehicle;
	}

	public void setNumOfClaimsOnVehicle(int numOfClaimsOnVehicle) {
		this.numOfClaimsOnVehicle = numOfClaimsOnVehicle;
	}

	public double getClaimOnVehicle() {
		return claimOnVehicle;
	}

	public void setClaimOnVehicle(double claimOnVehicle) {
		this.claimOnVehicle = claimOnVehicle;
	}

	public int getNumOfClaimsByDrivers() {
		return numOfClaimsByDrivers;
	}

	public void setNumOfClaimsByDrivers(int numOfClaimsByDrivers) {
		this.numOfClaimsByDrivers = numOfClaimsByDrivers;
	}

	public int getVehicleMakeYear() {
		return vehicleMakeYear;
	}

	public void setVehicleMakeYear(int vehicleMakeYear) {
		this.vehicleMakeYear = vehicleMakeYear;
	}

	public boolean isPrimary() {
		return isPrimary;
	}

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumOfTickets() {
		return numOfTickets;
	}

	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public boolean isHasPrevInsurance() {
		return hasPrevInsurance;
	}

	public void setHasPrevInsurance(boolean hasPrevInsurance) {
		this.hasPrevInsurance = hasPrevInsurance;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

}
