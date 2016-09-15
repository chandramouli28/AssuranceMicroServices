package com.asurance.quotegeneration.utils;

import java.util.List;

import com.asurance.quotegeneration.entity.DriverHistory;
import com.asurance.quotegeneration.entity.QuoteDetails;
import com.google.gson.Gson;

public class ObjectMapperUtil {

	public static QuoteDetails mapObjectQuoteDetails(String jsonString) {

		Gson gson = new Gson();
		QuoteDetails quoteDetails = gson.fromJson(jsonString, QuoteDetails.class);
		System.out.println(quoteDetails.getDriverList().get(0) + "Driver License");
		
		return quoteDetails;
	}
	
	public static List<DriverHistory> mapObjectDriverHistory(String jsonString) {

		Gson gson = new Gson();
		
		List<DriverHistory> driverHistory = gson.fromJson(jsonString, DriverHistory.class);
		System.out.println(driverHistory.get(0).getLicenceNumber() + "Driver License from Driver Historys");
		
		return driverHistory;
	}
}
