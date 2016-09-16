package com.assurance.dmvacessor.driverinfogeneration.webservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
<<<<<<< HEAD
=======

>>>>>>> base
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;

<<<<<<< HEAD
/**
 * @author Nikshitha Nagelly 
 * This class is exposed as web service which
 *  internally gets vehicle list based on address given
 */
@Path("/getvehicles")
public class VehicleService {

	/*
	 * This method returns vehicle list based on address
	 */
=======
@Path("/getvehicles")
public class VehicleService {

>>>>>>> base
	@Path("/getList")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getVehiclesList(String address) throws JSONException {

		VehicleService rc = new VehicleService();
<<<<<<< HEAD
		String vehicleListJson = rc.getVehicleList(address);
=======
		System.out.println("Inside restclient before public records call"+address);
		String vehicleListJson = rc.getVehicleList(address);
		System.out.println("vehicle LIst " + vehicleListJson);
>>>>>>> base
		return Response.status(200).entity(vehicleListJson).build();
	}

	public String getVehicleList(String address) {

		String output = null;

		try {

			URL url = new URL("http://localhost:8282/DMVPublicRecords/getvehicleslist");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");

			OutputStream os = conn.getOutputStream();
			os.write(address.getBytes());
			os.flush();

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
<<<<<<< HEAD
=======

			System.out.println("Output from Server .... \n");
>>>>>>> base
			while ((output = br.readLine()) != null) {
				return output;
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