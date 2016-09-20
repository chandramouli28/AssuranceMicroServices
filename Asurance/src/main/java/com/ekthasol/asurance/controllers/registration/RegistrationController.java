package com.ekthasol.asurance.controllers.registration;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.ekthasol.asurance.models.Address;
import com.ekthasol.asurance.models.Customer;
import com.ekthasol.asurance.service.registration.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@RequestMapping(value="/saveCustomer", method=RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer, @ModelAttribute Address address,HttpSession session, HttpServletResponse  response) {
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		System.out.println(customer);

		boolean status = registrationService.saveCustomer(customer, address);

		if (status){
			session.setAttribute("customer", customer);
			return new ModelAndView("success");
		}
		else{
			return new ModelAndView("failure");
		}
	
	}
}
