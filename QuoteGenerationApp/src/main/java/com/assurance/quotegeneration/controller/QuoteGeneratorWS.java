package com.assurance.quotegeneration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assurance.quotegeneration.model.Quote;
import com.assurance.quotegeneration.model.CustomerDetails;
import com.assurance.quotegeneration.service.QuoteGeneratorService;
import com.assurance.quotegeneration.utils.ObjectMapperUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * QuoteGeneratorWS is a restful micro webservice class to generate quote object. 
 * WebService consumes Json input for customer and produce Json object for quote. 
 * @author Srinivas Kondapaneni
 *
 */
@RestController
public class QuoteGeneratorWS {

	@Autowired
	QuoteGeneratorService quoteGeneratorService;
	
	/**
	 *  
	 * @param jsonString
	 * @return response
	 */
	@RequestMapping( value = "/getQuote", method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getQuote( @RequestBody String jsonString) {
		
		CustomerDetails customerDetails = ObjectMapperUtil.mapObjectQuoteDetails(jsonString);
		Quote quote = quoteGeneratorService.generateQuote(customerDetails);
		
		ObjectMapper mapper = new ObjectMapper();
		String quoteInJson = null;
		//Object to JSON in String
		try {
			quoteInJson = mapper.writeValueAsString(quote);
			System.out.println(quoteInJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<String>(quoteInJson, HttpStatus.OK);

	}
	
	
	

}
