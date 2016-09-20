package com.ekthasol.asurance.models;

import java.util.List;

public class Quote {

	
	private String quoteId;
	private Double quoteAmount;
	private Double perMonth;
	private Double liability;
	private String vin;
	private String vehicleMakeYear;
	private List<String> driverList;	
	private String ssn;
	private String education;
	public String getQuoteId() {
		return quoteId;
	}
	public Double getQuoteAmount() {
		return quoteAmount;
	}
	public Double getPerMonth() {
		return perMonth;
	}
	public Double getLiability() {
		return liability;
	}
	public String getVin() {
		return vin;
	}
	public String getVehicleMakeYear() {
		return vehicleMakeYear;
	}
	public List<String> getDriverList() {
		return driverList;
	}
	public String getSsn() {
		return ssn;
	}
	public String getEducation() {
		return education;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public void setQuoteAmount(Double quoteAmount) {
		this.quoteAmount = quoteAmount;
	}
	public void setPerMonth(Double perMonth) {
		this.perMonth = perMonth;
	}
	public void setLiability(Double liability) {
		this.liability = liability;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public void setVehicleMakeYear(String vehicleMakeYear) {
		this.vehicleMakeYear = vehicleMakeYear;
	}
	public void setDriverList(List<String> driverList) {
		this.driverList = driverList;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	
	
	
	
}
