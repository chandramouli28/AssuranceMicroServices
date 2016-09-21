package com.assurance.dmvacessor.driverinfogeneration.webservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * @author Nikshitha Nagelly This class is exposed as web service which
 *         internally gets drivers history based on given license Number
 */
@Path("/getDriverInfo")
public class DriverInfoService {

	/*
	 * This method returns drivers history based on license Number
	 */
	@GET
	@Path("{param}")
	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.TEXT_PLAIN)
	public Response getDriversHistory(@PathParam("param") String licenseNum) {
		
		try {
			URL url = new URL("http://localhost:8282/DMVPublicRecords/getdriverhistory");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			OutputStream os = conn.getOutputStream();
			os.write(licenseNum.getBytes());
			os.flush();

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String driversHistory;
			while ((driversHistory = br.readLine()) != null) {
				return Response.status(200).entity(driversHistory).build();
			}

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();

		}

		return null;
	}

}
