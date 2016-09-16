package com.assurance.claims.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.assurance.claims.model.ClaimsInfo;

/**
 * @author Chandra Mouli This class is exposed as a Restful Webservice to
 *         produce claims history for the given vehicle VIN number
 */
@Path("/claims")
public class ClaimsHistory {

	/**
	 * Webmethod to produce claims history for the given vehicle VIN number
	 * @param vin
	 * @return
	 */
	@Path("{param}")
	@GET
	@Produces("application/json")
	public ClaimsInfo getClaimsHistory(@PathParam("param") String vin) {

		ClaimsHistoryService claims = new ClaimsHistoryService();
		return claims.getClaimsInfo(vin);

	}

}