package com.assurance.quotegeneration.controller;

import com.assurance.quotegeneration.service.PaymentHandler;

//@RestController
public class PaymentWS {
	
	//@Autowired
	PaymentHandler paymentHandler;
	
	/*@RequestMapping(value="/verifyPayment",method=RequestMethod.POST,produces=MediaType.ALL_VALUE)
	public String verifyPaymentDetails(){
		String str = "Verification Update";
		return str;
	}*/
	
	//@RequestMapping(value="/processPayment",method=RequestMethod.POST,produces=MediaType.ALL_VALUE)
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
