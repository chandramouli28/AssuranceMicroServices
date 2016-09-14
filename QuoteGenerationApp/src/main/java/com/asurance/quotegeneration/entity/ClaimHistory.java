package com.asurance.quotegeneration.entity;

public class ClaimHistory {

	private String vin;
	private int numOfClaims;
	private int claimAmount;

	public String getVin() {
		return vin;
	}

	public int getNumOfClaims() {
		return numOfClaims;
	}

	public void setNumOfClaims(int numOfClaims) {
		this.numOfClaims = numOfClaims;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(int claimAmount) {
		this.claimAmount = claimAmount;
	}
}
