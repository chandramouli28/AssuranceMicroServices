package com.ekthasol.asurance.models;

public class CustomerInfo {
	
	private String gender;
	private String marital;
	private String education;
	private String employement;
	private String ssn;
	private String residence;
	private String moved;
	private String licenseStatus;
	private String years;
	private String licenseNumber;
	private String primaryEmail;
	private String residents;
	private String claims;
	private String tickets;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMarital() {
		return marital;
	}
	public void setMarital(String marital) {
		this.marital = marital;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getEmployement() {
		return employement;
	}
	public void setEmployement(String employement) {
		this.employement = employement;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getMoved() {
		return moved;
	}
	public void setMoved(String moved) {
		this.moved = moved;
	}
	public String getLicenseStatus() {
		return licenseStatus;
	}
	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public String getResidents() {
		return residents;
	}
	public void setResidents(String residents) {
		this.residents = residents;
	}
	public String getClaims() {
		return claims;
	}
	public void setClaims(String claims) {
		this.claims = claims;
	}
	public String getTickets() {
		return tickets;
	}
	public void setTickets(String tickets) {
		this.tickets = tickets;
	}
	
	@Override
	public String toString() {
		return "CustomerInfo [gender=" + gender + ", marital=" + marital + ", education=" + education + ", employement="
				+ employement + ", ssn=" + ssn + ", residence=" + residence + ", moved=" + moved + ", licenseStatus="
				+ licenseStatus + ", years=" + years + ", primaryEmail=" + primaryEmail + ", residents=" + residents
				+ ", claims=" + claims + ", tickets=" + tickets + "]";
	}
	
	
	
}
