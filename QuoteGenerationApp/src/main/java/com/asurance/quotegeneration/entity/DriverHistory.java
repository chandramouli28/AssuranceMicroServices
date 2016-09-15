package com.asurance.quotegeneration.entity;

public class DriverHistory {

	
	private String licenceNumber;
	
	private String name;

	private String dob;
	
	private String expiryDate;
	
	private String points;
	
	private String tickets;
	
	private String claimsByDriver;
	
	public String getClaimsByDriver() {
		return claimsByDriver;
	}

	public void setClaimsByDriver(String claimsByDriver) {
		this.claimsByDriver = claimsByDriver;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getTickets() {
		return tickets;
	}

	public void setTickets(String tickets) {
		this.tickets = tickets;
	}

	public String getIssuingState() {
		return issuingState;
	}

	public void setIssuingState(String issuingState) {
		this.issuingState = issuingState;
	}

	private String issuingState;
}