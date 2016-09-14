package com.asurance.quotegeneration.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.asurance.quotegeneration.drools.DroolsHandler;
import com.asurance.quotegeneration.entity.ClaimHistory;
import com.asurance.quotegeneration.entity.DriverHistory;
import com.asurance.quotegeneration.entity.PrimaryDataVO;
import com.asurance.quotegeneration.entity.Quote;
import com.asurance.quotegeneration.entity.QuoteDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

@Service("quoteGenerator")
public class QuoteGenerator {

	public Quote generateQuote(QuoteDetails quoteDetails){
		
		int driverPoints = 0;
		int driverTickets =0;
		int claimsByDrivers = 0;
		int primaryDriverAge = 0;
		
		PrimaryDataVO droolData = new PrimaryDataVO();
		List<String> licenseIdList = quoteDetails.getDriverList();
		String vin = quoteDetails.getVin();
		
		List<DriverHistory> driverList =  getDriverHistory(licenseIdList);
		
		for (DriverHistory driverHistory :driverList){
			driverPoints += Integer.valueOf(driverHistory.getPoints());
			driverTickets += Integer.valueOf(driverHistory.getTickets());
			claimsByDrivers += Integer.valueOf(driverHistory.getClaimsByDriver());
		}
		
		primaryDriverAge = getDriverAge(driverList.get(0).getDob());
		
		ClaimHistory claimHistory = getClaimHistory(vin);
		
		droolData.setNumOfClaimsOnVehicle(claimHistory.getNumOfClaims());
		droolData.setNumOfClaimsByDrivers(claimsByDrivers);
		droolData.setAge(primaryDriverAge);
		droolData.setNumOfTickets(driverTickets);
		droolData.setClaimOnVehicle(claimHistory.getClaimAmount());
		droolData.setPoints(driverPoints);
		droolData.setEducationLevel(quoteDetails.getEducation());
	//	droolData.setHasPrevInsurance(hasPrevInsurance);
	//	droolData.setPrimary(isPrimary);
		droolData.setVehicleMakeYear(quoteDetails.getVehicleMakeYear());
	
		
		
		DroolsHandler.runDroolEngine(droolData);
		
		return new Quote();
	};
	
	
	private int getDriverAge(String dob) {
		
		String[] date = dob.split("/");
		
		int month = Integer.valueOf(date[0]);
		int day = Integer.valueOf(date[1]);
		int year = Integer.valueOf(date[2]);
		
		LocalDate birthdate = LocalDate.of(year, month, day);
		LocalDate currentDate = LocalDate.now();
		
		Period age = Period.between(birthdate, currentDate);
		
		int ageInYears = age.getYears();
		
		return ageInYears;
	}


	


	public List<DriverHistory> getDriverHistory(List<String> licenseIdList){
		
		StringBuilder concatLicense = null;
		
		for(String str: licenseIdList){
			str.trim();
			
			concatLicense = concatLicense.append(":" + str);
		}
		
		String licenseNumbers = concatLicense.toString();
		licenseNumbers.trim();
		
		
		final String url="";
		
		Map<String, String> params = new HashMap<String, String>();
	    params.put("licenseNumbers", licenseNumbers);
		
		
		RestTemplate restTemplate = new RestTemplate();
		String result =  restTemplate.getForObject(url,String.class,params);
		
		ObjectMapper mapper = new ObjectMapper();
		List<DriverHistory> list = null;
		 try {
			list = mapper.readValue(result, TypeFactory.defaultInstance().constructCollectionType(List.class, DriverHistory.class));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return list;
				
	}
	
	public ClaimHistory getClaimHistory(String vin){
		
		final String url="";
		
		Map<String,String> params = new HashMap<String,String>();
		params.put("vin", vin);
		
		RestTemplate restTemplate = new RestTemplate();
		ClaimHistory result = restTemplate.getForObject(url,ClaimHistory.class,params);
		
		System.out.println("ClaimHistory" );
		System.out.println(result);
		return result;
	}
	

}
