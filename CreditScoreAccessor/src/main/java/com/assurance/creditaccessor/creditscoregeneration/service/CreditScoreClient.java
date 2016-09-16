package com.assurance.creditaccessor.creditscoregeneration.service;

import org.codehaus.jettison.json.JSONException;
import com.assurance.creditaccessor.creditscoregeneration.webservice.CreditScoreService;
import com.assurance.creditaccessor.creditscoregeneration.webservice.CreditScoreService_Service;

/**
 * @author Nikshitha Nagelly 
 * This class acts as client for credit score web
 * service application to get credit score based on inpouted SSN
 */
public class CreditScoreClient {

	public int getCreditScore(String ssn) throws JSONException {
		CreditScoreService_Service csService = new CreditScoreService_Service();
		CreditScoreService service = csService.getCreditScoreServiceImplPort();
		int creditScore = service.getCreditScoreBySSN(ssn);
		return creditScore;

	}
}
