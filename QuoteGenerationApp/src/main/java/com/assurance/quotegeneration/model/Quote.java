package com.assurance.quotegeneration.model;

/**
 * @Entity Quote
 * @author Srinivas Kondapaneni
 *
 */
public class Quote {

	private String quoteId;
	private double quoteAmount;

	
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public double getQuoteAmount() {
		return quoteAmount;
	}
	public void setQuoteAmount(double quoteAmount) {
		this.quoteAmount = quoteAmount;
	}
}
