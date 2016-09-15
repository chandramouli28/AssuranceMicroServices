package com.assurance.dmvacessor.driverinfogeneration.webservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.assurance.dmvacessor.driverinfogeneration.model.Address;
import com.google.gson.Gson;

public class HttpClient {
	public static void main(String[] args) {

		  try {
			  
			  Gson gson = new Gson();
				Address address = new Address(1,"3050regent","bolvard suite 150","irving","texas","75063");
				String jsonInString = gson.toJson(address);
				String input = '"'+jsonInString+'"';
				System.out.println(input);
				

			URL url = new URL("http://localhost:8080/DMVPublicRecords/getdriverhistory/4862");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }

		}

}
