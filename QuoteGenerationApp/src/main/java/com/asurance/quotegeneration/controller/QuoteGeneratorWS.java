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

@RestController
public class QuoteGeneratorWS {

	@Autowired
	QuoteGenerator quoteGenerator;

	@RequestMapping(value = "/getQuote", method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Quote> getQuote( @RequestBody QuoteDetails quoteDetails) {

		Quote quote = quoteGenerator.generateQuote(quoteDetails);
		return new ResponseEntity<Quote>(quote, HttpStatus.OK);

	}
	
	
	

}
