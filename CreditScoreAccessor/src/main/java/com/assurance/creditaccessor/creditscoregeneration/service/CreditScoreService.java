package com.assurance.creditaccessor.creditscoregeneration.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.codehaus.jettison.json.JSONException;

@Path("/creditscore")
public class CreditScoreService {

	@Path("{param}")
	@GET
	@Produces("application/json")
	public int getCreditScore(@PathParam("param") String ssn) throws JSONException {
		CreditScoreClient score = new CreditScoreClient();
		return score.getCreditScore(ssn);

	}
}
