package com.assurance.quotegeneration.utils;

import java.util.List;

import com.assurance.quotegeneration.model.DriverHistory;
import com.assurance.quotegeneration.model.CustomerDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.google.gson.Gson;


/**
 * ObjectMapperUtil provides methods to convert jsonString to jsonobjects
 * @author Srinivas Kondapaneni
 *
 */
public class ObjectMapperUtil {

	
	/**
	 * @param jsonString
	 * @return CustomerDetails
	 */
	public static CustomerDetails mapObjectQuoteDetails(String jsonString) {

		Gson gson = new Gson();
		CustomerDetails customerDetails = gson.fromJson(jsonString, CustomerDetails.class);

		return customerDetails;
	}

	
	/**
	 * 
	 * @param jsonString
	 * @return DriverHistoryList
	 */
	public static List<DriverHistory> mapObjectDriverHistory(String jsonString) {
		
		List<DriverHistory> driverHistory = null;
			
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			driverHistory = mapper.readValue(jsonString,TypeFactory.defaultInstance().constructCollectionType(List.class, DriverHistory.class));
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return driverHistory;
	
	}
}
