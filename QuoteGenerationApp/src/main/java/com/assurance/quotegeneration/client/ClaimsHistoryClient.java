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
	
	
/*	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
	    int year = now.get(Calendar.YEAR);
	    int month = now.get(Calendar.MONTH) + 1;
	    int date =  now.get(Calendar.DATE);
	    Random rand = new Random();
	    
	    String s1 = Integer.toString(year);
	    String s2 = Integer.toString(month);
	    String s3 = Integer.toString(date);

	    System.out.println(year);
	    System.out.println(month);
	    System.out.println(date);
	    System.out.println(String.format("%04d", rand.nextInt(10000)));
	    System.out.println(rand.nextInt(10000));
	    
	    System.out.println(s1 + s2 + s3 + String.format("%04d", rand.nextInt(10000)));
	    
	}*/
}
