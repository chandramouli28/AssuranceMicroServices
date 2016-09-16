package com.assurance.dmvacessor.driverinfogeneration.webservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
<<<<<<< HEAD
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
=======

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
>>>>>>> base
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

<<<<<<< HEAD
/**
 * @author Nikshitha Nagelly 
 * This class is exposed as web service which
 * internally gets drivers history based on given license Number
 */
@Path("/getDriverInfo")
public class DriverInfoService {

	/*
	 * This method returns drivers history based on license Number
	 */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getDriversHistory(String licenseNum) {

=======
@Path("/getDriverInfo")
public class DriverInfoService {

	@GET
	@Path("{param}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public Response getDriversHistory( @PathParam("param") String licenseNum) {
		
		System.out.println("License in DriverInfoService" + licenseNum);
>>>>>>> base
		try {
			URL url = new URL("http://localhost:8282/DMVPublicRecords/getdriverhistory");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");

			OutputStream os = conn.getOutputStream();
			os.write(licenseNum.getBytes());
			os.flush();

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String driversHistory;
<<<<<<< HEAD
=======
			System.out.println("Output from Server .... \n");
>>>>>>> base
			while ((driversHistory = br.readLine()) != null) {
				return Response.status(200).entity(driversHistory).build();
			}

			conn.disconnect();
		} catch (MalformedURLException e) {
<<<<<<< HEAD
=======
			// TODO Auto-generated catch block
>>>>>>> base
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();

		}

		return null;

	}

}
