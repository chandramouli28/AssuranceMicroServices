package com.asurance.quotegeneration.entity;

public class DriverDataVO {

	private boolean isPrimary;
	private int age;
	private int numOfTickets;
	private int points;
	private boolean hasPrevInsurance;
	private String educationLevel;
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
