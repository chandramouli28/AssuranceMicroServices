package com.assurance.dmvacessor.driverinfogeneration.model;

public class Address {	

	private int addressId;
	private String addressLine1;
	public Address(int addressid, String addressLine1, String addressLine2, String city, String state, String zipCode) {
		super();
		this.addressId = addressid;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zipCode;
	}
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
	public int getAddressid() {
		return addressId;
	}
	public void setAddressid(int addressid) {
		this.addressId = addressid;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zip;
	}
	public void setZipCode(String zipCode) {
		this.zip = zipCode;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zip + "]";
	}
	
}
