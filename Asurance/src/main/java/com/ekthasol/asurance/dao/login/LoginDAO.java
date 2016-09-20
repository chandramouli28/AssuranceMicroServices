package com.ekthasol.asurance.dao.login;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ekthasol.asurance.models.Customer;

public class LoginDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Customer getCustomer(String email,String password){
		Session session = sessionFactory.openSession();
		Customer customer = null;
		
		try {
			Query query = session.createQuery("from Customer where EMAIL= :email and PASSWORD= :password");
			query.setParameter("email", email);
			query.setParameter("password", password);
			customer = (Customer) query.list().get(0);
		} catch (HibernateException e) {
			e.printStackTrace();
		} 
		return customer;
	}
}
