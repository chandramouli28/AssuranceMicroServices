package com.assurance.quotegeneration.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assurance.quotegeneration.model.ClaimHistory;

/**
 * 
 * ClaimsHistoryClient contains client to consume claim service and get claim history 
 * @author Srinivas Kondapaneni
 *
 */
@Service("claimsHistoryClient")
public class ClaimsHistoryClient {

	/**
	 * getClaimHistory is restclient method to consume service from ClaimsHistory application 
	 * @param vin
	 * @return ClaimHistory object
	 */
	public ClaimHistory getClaimHistory(String vin) {

		final String url = "http://localhost:8080/ClaimsHistory/rest/claims/{vin}";

		Map<String, String> params = new HashMap<String, String>();
		params.put("vin", vin);

		RestTemplate restTemplate = new RestTemplate();
		ClaimHistory result = restTemplate.getForObject(url, ClaimHistory.class, params);

		return result;
	}
}
