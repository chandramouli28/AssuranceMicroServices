package com.assurance.services.payment.webservice;

import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assurance.services.payment.service.PaymentHandlerService;

/**
 * @author Chandra Mouli This class is exposed as a Restful Webservice to
 *         produce verify and process payment for the given quote amount and
 *         card details. Quote amount is recieved as a path variable and the
 *         card details are recieved as json string in the requestbody
 */
@RestController
public class PaymentService {

	@Autowired
	PaymentHandlerService paymentHandlerService;

	/**
	 * Webmethod to verify and process the payment
	 * @param inputJson
	 * @param quoteAmount
	 * @return
	 */
	@POST
	@RequestMapping(value = "/processpayment/{quoteAmount}")
	public ResponseEntity<Boolean> processPayment(@RequestBody String inputJson,
			@PathVariable("quoteAmount") double quoteAmount) {

		if (inputJson != null) {
			boolean result = paymentHandlerService.processPayment(inputJson, quoteAmount);
			return new ResponseEntity<Boolean>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
		}
	}
}