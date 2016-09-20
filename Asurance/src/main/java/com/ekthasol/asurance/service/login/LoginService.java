package com.ekthasol.asurance.service.login;

import org.springframework.beans.factory.annotation.Autowired;

import com.ekthasol.asurance.dao.login.LoginDAO;
import com.ekthasol.asurance.models.Customer;

public class LoginService {
	
	@Autowired
	LoginDAO loginDAO;
	
	public Customer getCustomer(String email,String password){
		
		Customer customer = loginDAO.getCustomer(email, password);
		
		return customer;
	}

}
