package com.assurance.claims.service;

import java.util.List;

import com.assurance.claims.history.webservice.ServiceProvider;
import com.assurance.claims.history.webservice.VehicleClaimsInfo;
import com.assurance.claims.history.webservice.VehicleClaimsService;
import com.assurance.claims.model.ClaimsInfo;

/**
 * @author Chandra Mouli This class acts as a client for the claims webservice.
 *         The results from this webservice are used to populate the ClaimsInfo
 *         object
 */
public class ClaimsHistoryService {

	/**
	 * This method acts as a client for the claims webservice. This method also
	 * calculates the claimamount and the number of claims and returns them as
	 * claimsinfo object
	 * @param vin
	 * @return
	 */
	public ClaimsInfo getClaimsInfo(String vin) {

		ServiceProvider swsService = new ServiceProvider();

		VehicleClaimsService servicePlanWS = swsService.getVehicleClaimsServiceImplPort();

		List<VehicleClaimsInfo> claims = servicePlanWS.getVehicleClaimHistory(vin);

		if (claims.size() != 0) {
			ClaimsInfo claimsInfo = new ClaimsInfo();
			int numOfClaims = 0;
			Double claimsAmount = 0.0;
			for (VehicleClaimsInfo vehicleClaims : claims) {

				numOfClaims++;
				claimsAmount = claimsAmount + vehicleClaims.getClaimAmount();
			}

			claimsInfo.setNumOfClaims(numOfClaims);
			claimsInfo.setClaimAmount(claimsAmount);
			return claimsInfo;

		} else {
			return null;
		}

	}

}
