package com.assurance.claims.model;

/**
 * @author Chandra Mouli This is an entity class to store the claimsamount and the number of claims
 */
public class ClaimsInfo {

	private int NumOfClaims;
	private double claimAmount;

	public int getNumOfClaims() {
		return NumOfClaims;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setNumOfClaims(int numOfClaims) {
		NumOfClaims = numOfClaims;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

}
