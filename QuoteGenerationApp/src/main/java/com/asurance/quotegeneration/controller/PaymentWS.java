package com.asurance.quotegeneration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.asurance.quotegeneration.service.PaymentHandler;

@RestController
public class PaymentWS {
	
	@Autowired
	PaymentHandler paymentHandler;
	
	/*@RequestMapping(value="/verifyPayment",method=RequestMethod.POST,produces=MediaType.ALL_VALUE)
	public String verifyPaymentDetails(){
		String str = "Verification Update";
		return str;
	}*/
	
	@RequestMapping(value="/processPayment",method=RequestMethod.POST,produces=MediaType.ALL_VALUE)
	public String processPayment(){
		Boolean status = paymentHandler.verifyPayment();
		String str = null;
		if(status == true)
		str = "Payment Update";
		else 
		str = "Verification Failed";
		
		return str;
	}
}
