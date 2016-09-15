package com.assurance.creditaccessor.creditscoregeneration.service;

import org.codehaus.jettison.json.JSONException;

import com.assurance.creditaccessor.creditscoregeneration.webservice.CreditScoreService;
import com.assurance.creditaccessor.creditscoregeneration.webservice.CreditScoreService_Service;

public class CreditScoreClient {

	public int getCreditScore(String ssn) throws JSONException{
		CreditScoreService_Service csService = new CreditScoreService_Service();
		CreditScoreService  service = csService.getCreditScoreServiceImplPort(); 
		int creditScore = service.getCreditScoreBySSN(ssn);
		System.out.println("Inside getCreditScore"+creditScore);
		return creditScore;
		
	}
}
