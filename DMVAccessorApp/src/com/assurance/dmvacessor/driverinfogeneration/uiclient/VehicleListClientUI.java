package com.assurance.dmvacessor.driverinfogeneration.uiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.assurance.dmvacessor.driverinfogeneration.model.Address;
import com.google.gson.Gson;

public class VehicleListClientUI {

	public static void main(String[] args) {

		System.out.println("Inside Main" + getListtoUI());
	}

	private static String getListtoUI() {

		Gson gson = new Gson();
		Address address = new Address(1, "2938 Royal Ln", "2152", "Irving", "Texas", "75063");
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
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
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

}
