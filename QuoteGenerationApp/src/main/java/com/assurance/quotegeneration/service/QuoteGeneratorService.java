package com.assurance.quotegeneration.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assurance.quotegeneration.client.ClaimsHistoryClient;
import com.assurance.quotegeneration.client.CreditHistoryClient;
import com.assurance.quotegeneration.client.DriverHistoryClient;
import com.assurance.quotegeneration.drools.DroolsEngineHandler;
import com.assurance.quotegeneration.model.ClaimHistory;
import com.assurance.quotegeneration.model.CustomerDetails;
import com.assurance.quotegeneration.model.CustomerVO;
import com.assurance.quotegeneration.model.DriverHistory;
import com.assurance.quotegeneration.model.Quote;


/**
 * QuoteGeneratorService class internally handles implementation to run clients to consume
 * webservices claim history, driver history and credit history and generate the quote object.
 * @author Srinivas Kondapeneni
 *
 */
@Service("quoteGeneratorService")
public class QuoteGeneratorService {

	@Autowired
	DroolsEngineHandler droolsEngineHandler;
	
	@Autowired
	DriverHistoryClient driverHistoryClient;
	
	@Autowired
	ClaimsHistoryClient claimsHistoryClient;
	
	@Autowired
	CreditHistoryClient creditHistoryClient;

	/**
	 * generateQuote method takes customer details consumed by webservice as input and returns 
	 * quote object.
	 * @param customerDetails
	 * @return quote
	 */
	public Quote generateQuote(CustomerDetails customerDetails) {

		Quote quote = new Quote();
		
		CustomerVO customerDroolData = getCustomerInfo(customerDetails);

		quote = droolsEngineHandler.runDroolEngine(customerDroolData);

		return quote;
	}

	
	/**
	 * getCustomerInfo method populates the object given to drools engine and returns it. 
	 * @param customerDetails
	 * @return CustomerVO
	 */
	public CustomerVO getCustomerInfo(CustomerDetails customerDetails) {
		
		int driverPoints = 0;
		int driverTickets = 0;
		//int claimsByDrivers = 0;
		int primaryDriverAge = 0;

		CustomerVO customerDroolData = new CustomerVO();
		List<String> licenseIdList = customerDetails.getDriverList();
		String vin = customerDetails.getVin();
		List<DriverHistory> driverList = driverHistoryClient.getDriverHistory(licenseIdList);

		for (DriverHistory driverHistory : driverList) {
			
			driverPoints += Integer.valueOf(driverHistory.getPoints());
			driverTickets += Integer.valueOf(driverHistory.getTickets());
			//claimsByDrivers += Integer.valueOf(driverHistory.getClaimsByDriver());
		}
		
		primaryDriverAge = getDriverAge(driverList.get(0).getDob());

		ClaimHistory claimHistory = claimsHistoryClient.getClaimHistory(vin);

		customerDroolData.setNumOfClaimsOnVehicle(claimHistory.getNumOfClaims());
		//droolData.setNumOfClaimsByDrivers(claimsByDrivers);
		customerDroolData.setAge(primaryDriverAge);
		customerDroolData.setNumOfTickets(driverTickets);
		customerDroolData.setClaimOnVehicle(claimHistory.getClaimAmount());
		customerDroolData.setPoints(driverPoints);
		customerDroolData.setEducationLevel(customerDetails.getEducation());
		customerDroolData.setVehicleMakeYear(customerDetails.getVehicleMakeYear());
		
//Start-Added by CM
		String ssn = customerDetails.getSsn();
		int creditScore = creditHistoryClient.getCreditScore(ssn);
		customerDroolData.setCreditScore(creditScore);
//End		
		return customerDroolData;
	};

	
	/**
	 * Method to calculate the age of the driver
	 * @param dob
	 * @return integer
	 */
	public int getDriverAge(String dob) {

		String[] date = dob.split("-");
		
		int month = Integer.valueOf(date[1]);
		int day = Integer.valueOf(date[2]);
		int year = Integer.valueOf(date[0]);

		LocalDate birthDate = LocalDate.of(year, month, day);
		LocalDate currentDate = LocalDate.now();

		Period age = Period.between(birthDate, currentDate);

		int ageInYears = age.getYears();

		return ageInYears;
	}

}
