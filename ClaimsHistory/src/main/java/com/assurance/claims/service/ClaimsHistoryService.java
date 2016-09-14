package com.assurance.claims.service;

import java.util.List;

import com.assurance.claims.history.webservice.ServiceProvider;
import com.assurance.claims.history.webservice.VehicleClaimsInfo;
import com.assurance.claims.history.webservice.VehicleClaimsService;
import com.assurance.claims.model.ClaimsInfo;

public class ClaimsHistoryService {
	
//	private ClaimsInfo claimsInfo;
	
	public ClaimsInfo getClaimsInfo(String vin){
		
		ServiceProvider swsService = new ServiceProvider();

		VehicleClaimsService servicePlanWS = swsService.getVehicleClaimsServiceImplPort();

		List<VehicleClaimsInfo> claims = servicePlanWS.getVehicleClaimHistory(vin);

		if(claims.size() != 0){
			ClaimsInfo claimsInfo = new ClaimsInfo();
			int numOfClaims = 0;
			Double claimsAmount = 0.0;
			for(VehicleClaimsInfo vehicleClaims : claims){
				
				numOfClaims++;
				claimsAmount = claimsAmount + vehicleClaims.getClaimAmount();
			}
			
			claimsInfo.setNumOfClaims(numOfClaims);
			claimsInfo.setClaimAmount(claimsAmount);
			return claimsInfo;
			
		}else{
			return null;			
		}
	
	}
	
}
