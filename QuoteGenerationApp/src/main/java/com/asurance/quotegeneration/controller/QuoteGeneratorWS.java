package com.asurance.quotegeneration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asurance.quotegeneration.entity.Quote;
import com.asurance.quotegeneration.entity.QuoteDetails;
import com.asurance.quotegeneration.service.QuoteGenerator;
import com.asurance.quotegeneration.utils.ObjectMapperUtil;

@RestController
@RequestMapping(value = "/getQuote")
public class QuoteGeneratorWS {

	@Autowired
	QuoteGenerator quoteGenerator;

	@RequestMapping( method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> getQuote( @RequestBody String jsonString) {
		
		System.out.println(jsonString);
		/*System.out.println(quoteDetails.getVin());
		System.out.println(quoteDetails.getDriverList().get(0));*/
		QuoteDetails quoteDetails = ObjectMapperUtil.mapObjectQuoteDetails(jsonString);
		Quote quote = quoteGenerator.generateQuote(quoteDetails);
		//System.out.println(quote.);
		String stat = quoteDetails.getDriverList().get(0);
		return new ResponseEntity<String>(stat, HttpStatus.OK);

	}
	
	
	

}
