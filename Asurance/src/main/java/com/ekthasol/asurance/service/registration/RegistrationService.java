package com.ekthasol.asurance.service.registration;

import org.springframework.beans.factory.annotation.Autowired;

import com.ekthasol.asurance.dao.registration.RegistrationDAO;
import com.ekthasol.asurance.models.Address;
import com.ekthasol.asurance.models.Customer;

public class RegistrationService {

	@Autowired
	RegistrationDAO registrationDAO;
	
	public boolean saveCustomer(Customer customer, Address address) {
		boolean status = false;
		
		status = registrationDAO.saveCustomer(customer, address);
		
		return status;
	}

}
