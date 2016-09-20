package com.ekthasol.asurance.controllers.quotegeneration;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ekthasol.asurance.models.Address;
import com.ekthasol.asurance.models.Customer;
import com.ekthasol.asurance.models.CustomerInfo;
import com.ekthasol.asurance.models.Quote;
import com.ekthasol.asurance.models.Vehicle;
import com.ekthasol.asurance.service.quotegeneration.QuoteGenerationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

@Controller
public class QuoteGenerationController {

	@Autowired
	QuoteGenerationService quoteGenerationService;
	
	public static List<String> licenseList = new ArrayList<String>();
	
	@RequestMapping(value = "/getVehicles", method = RequestMethod.POST)
	public String getVehicles(@ModelAttribute Customer customer, @ModelAttribute Address address, HttpSession session) {
		String output = quoteGenerationService.getVehiclesList(address);
		session.setAttribute("customer", customer);
		session.setAttribute("address", address);
		if (output != null) {
			List<Vehicle> vehicleList = null;
			ObjectMapper mapper = new ObjectMapper();
			try {
				vehicleList = mapper.readValue(output,
						TypeFactory.defaultInstance().constructCollectionType(List.class, Vehicle.class));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (vehicleList != null && !vehicleList.isEmpty()){
				session.setAttribute("vehicleList", vehicleList);
				return "vehicleList";
			}else{
				session.setAttribute("message", "No Vehicles found");
				return "redirect:/#/quote";
			}
		}
		else{
			
			session.setAttribute("message", "Address did not match");
			return "redirect:/#/quote";
		}
	}
	
	@RequestMapping(value = "/questionnaire", method = RequestMethod.POST)
	public ModelAndView getQuestions(@ModelAttribute Vehicle selectedVehicle,HttpSession session){
		
		session.setAttribute("selectedVehicle", selectedVehicle);
		System.out.println(selectedVehicle.toString());
		return new ModelAndView("questionaire");
	}
	
	@RequestMapping(value = "/addDriver", method = RequestMethod.POST)
	public ModelAndView addDriver(@ModelAttribute CustomerInfo customerInfo,HttpSession session){
		
		if(licenseList.size() == 2)
			licenseList.clear();
		licenseList.add(customerInfo.getLicenseNumber());
		session.setAttribute("licenseList", licenseList);
		for(String license:licenseList)
			System.out.println(license);
		session.setAttribute("customerInfo", customerInfo);
		System.out.println(customerInfo.toString());
		return new ModelAndView("driverInfo");
	}
	
	@RequestMapping(value = "/premium", method = RequestMethod.GET)
	public String goToPremium(HttpSession session,HttpServletRequest request) {

		CustomerInfo custInfo = (CustomerInfo) session.getAttribute("customerInfo");
		System.out.println(custInfo.toString());
		Vehicle vehicleInfo = (Vehicle) session.getAttribute("selectedVehicle");
		
		Quote inputQuote = new Quote();
		inputQuote.setEducation(custInfo.getEducation());
		inputQuote.setDriverList(licenseList);
		inputQuote.setSsn(custInfo.getSsn());
		inputQuote.setVin(vehicleInfo.getVin());
		inputQuote.setVehicleMakeYear(vehicleInfo.getYear());
		
		Quote resultQuote = quoteGenerationService.getQuoteAmount(inputQuote); 
		
		session.setAttribute("quote", resultQuote);
		return ("premium");
	}
}
