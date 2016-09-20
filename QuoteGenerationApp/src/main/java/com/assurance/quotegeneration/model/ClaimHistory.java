package com.assurance.quotegeneration.model;


/**
 * @Entity ClaimHistory
 * @author Srinivas Kondapaneni
 *
 */
public class ClaimHistory {

	//private String vin;
	private int numOfClaims;
	private int claimAmount;

	
	public int getNumOfClaims() {
		return numOfClaims;
	}

	public void setNumOfClaims(int numOfClaims) {
		this.numOfClaims = numOfClaims;
	}

	public int getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(int claimAmount) {
		this.claimAmount = claimAmount;
	}
}
