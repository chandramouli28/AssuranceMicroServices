package com.ekthasol.asurance.service.quotegeneration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.ekthasol.asurance.models.Address;
import com.ekthasol.asurance.models.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class QuoteGenerationService {
	
	public String getVehiclesList(Address address) {

		Gson gson = new Gson();
		String jsonInString = gson.toJson(address);
		String output = jsonInString;
		System.out.println("Inside UI Client" + output);

		// String output = null;

		try {

			URL url = new URL("http://localhost:8080/DMVAccessorApp/rest/getvehicles/getList");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			OutputStream os = conn.getOutputStream();
			os.write(output.getBytes());
			os.flush();

			if (conn.getResponseCode() != 200) {
				return null;
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			System.out.println("Output from Server .... \n");
			String outputtoUI;
			while ((outputtoUI = br.readLine()) != null) {
				return outputtoUI;
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return null;

	}
	
	public Quote getQuoteAmount(Quote quote){
		
//		 final String uri = "http://localhost:8080/QuoteGenerationApp/getQuote";
		 	Gson gson = new Gson();
			String jsonInString = gson.toJson(quote);
/*		    RestTemplate restTemplate = new RestTemplate();
		    System.out.println("Input JSOn" + jsonInString);
		  
		    HttpHeaders headers = new HttpHeaders();
		    headers.setContentType(MediaType.APPLICATION_JSON);

		    HttpEntity<String> entity = new HttpEntity<String>(jsonInString,headers);
		    Quote resultQuote = restTemplate.postForObject( uri, entity, Quote.class);
		    System.out.println(resultQuote);*/
			
			String output = jsonInString;
			try {

				URL url = new URL("http://localhost:8080/QuoteGenerationApp/getQuote");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");

				OutputStream os = conn.getOutputStream();
				os.write(output.getBytes());
				os.flush();

				if (conn.getResponseCode() != 200) {
					return null;
				}

				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

				System.out.println("Output from Server .... \n");
				String outputtoUI;
				Quote result = null;
				while ((outputtoUI = br.readLine()) != null) {
					System.out.println(outputtoUI);
					
					ObjectMapper mapper = new ObjectMapper();
					try {
						result = mapper.readValue(outputtoUI,
								Quote.class);
						result.setLiability((0.6*result.getQuoteAmount()));
					} catch (Exception e) {
						e.printStackTrace();
					}
					return result;
				}

				conn.disconnect();

			} catch (MalformedURLException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();

			}
			
//		return resultQuote;
		return null;
	}

}
