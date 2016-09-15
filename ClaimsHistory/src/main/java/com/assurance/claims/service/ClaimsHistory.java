package com.assurance.claims.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.assurance.claims.model.ClaimsInfo;

@Path("/claims")
public class ClaimsHistory {

	@Path("{param}")
	@GET
	@Produces("application/json")
	public ClaimsInfo getClaimsHistory(@PathParam("param") String vin) {
		System.out.println(vin);
		ClaimsHistoryService claims = new ClaimsHistoryService();
		return claims.getClaimsInfo(vin);
		
	}

}