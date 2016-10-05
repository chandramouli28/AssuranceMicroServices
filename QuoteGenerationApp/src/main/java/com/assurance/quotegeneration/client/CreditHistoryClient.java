package com.assurance.quotegeneration.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

/**
 * CreditHistoryClient consumes creditScervice webservice and get Creditscore
 * 
 * @author Chandra Mouli
 *
 */
public class CreditHistoryClient {

	/**
	 * This method has the client for CreditScoreAccessor application which
	 * takes ssn as input and returns creditscore
	 * @param ssn
	 * @return
	 */
	public int getCreditScore(String ssn) {

		final String url = "http://localhost:8080/CreditScoreAccessor/rest/creditscore/{param}";

		Map<String, String> params = new HashMap<String, String>();
		params.put("param", ssn);
		RestTemplate restTemplate = new RestTemplate();
		int creditScore = restTemplate.getForObject(url, Integer.class, params);

		return creditScore;

	}

}
