package com.assurance.creditaccessor.creditscoregeneration.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.codehaus.jettison.json.JSONException;

/**
 * @author Nikshitha Nagelly 
 * This class is exposed as web service which gives
 * credit score
 */
@Path("/creditscore")
public class CreditScoreService {

	/*
	 * This method is exposed as web method which internally gets credit score
	 * based on given SSN
	 */
	@Path("{param}")
	@GET
	@Produces("application/json")
	public int getCreditScore(@PathParam("param") String ssn) throws JSONException {
		CreditScoreClient score = new CreditScoreClient();
		return score.getCreditScore(ssn);

	}
}
