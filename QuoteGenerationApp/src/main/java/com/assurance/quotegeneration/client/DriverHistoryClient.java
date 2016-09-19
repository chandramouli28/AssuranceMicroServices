package com.assurance.quotegeneration.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assurance.quotegeneration.model.DriverHistory;
import com.assurance.quotegeneration.utils.ObjectMapperUtil;

/**
 * DriverHistoryClient contains client to consume claim service and get driver history
 * @author Srinivas Kondapaneni
 *
 */
@Service("driverHistoryClient")
public class DriverHistoryClient {
	
	/**
	 * getDriverHistory is restclient method to consume service from DriverHistory application 
	 * @param licenseIdList
	 * @return DriverHistory List
	 */
	public List<DriverHistory> getDriverHistory(List<String> licenseIdList) {

		StringBuilder concatLicense = new StringBuilder();
		int count = 0;
		
		for (String str : licenseIdList) {
			
			if (count == 0){
				
				concatLicense = concatLicense.append(str);
				count = 1;
			}
			else {
				
				concatLicense = concatLicense.append(":" + str);
			}
		}

		String licenseNumbers = concatLicense.toString();
		licenseNumbers.trim();

		final String url = "http://localhost:8080/DMVAccessorApp/rest/getDriverInfo/{licenseNumbers}";

		Map<String, String> params = new HashMap<String, String>();
		params.put("licenseNumbers", licenseNumbers);

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class, params);


		List<DriverHistory> driverHistoryList = ObjectMapperUtil.mapObjectDriverHistory(result);

		return driverHistoryList;

	}

}
