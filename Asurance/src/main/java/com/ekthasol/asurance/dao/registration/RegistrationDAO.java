package com.ekthasol.asurance.dao.registration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ekthasol.asurance.models.Address;
import com.ekthasol.asurance.models.Customer;

public class RegistrationDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean saveCustomer(Customer customer,Address address){
		
		boolean status = false;
		int address_id = 0,customer_id = 0;
		Session session = sessionFactory.openSession();
		try {
			address_id = (Integer) session.save(address);
			customer.setAddressID(address_id);
			customer_id = (Integer) session.save(customer);
			if(customer_id > 0)
				status = true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return status;
	}
}
