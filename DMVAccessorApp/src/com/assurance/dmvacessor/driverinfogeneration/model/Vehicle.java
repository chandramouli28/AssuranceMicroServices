package com.assurance.dmvacessor.driverinfogeneration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

<<<<<<< HEAD
/**
 * @author Nikshitha Nagelly 
 * This entity class provides all vehicle information
 */
=======
>>>>>>> base
@Entity
@Table(name = "vehicle")
public class Vehicle {

	@Id
	@Column(name = "vin")
	private String vin;
	@Column(name = "year")
	private String year;
	@Column(name = "make")
	private String make;
	@Column(name = "model")
	private String model;

<<<<<<< HEAD
<<<<<<< HEAD
=======
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "a_id")
	private Address vechicleAddress;

	public Address getVechicleAddress() {
		return vechicleAddress;
	}

	public void setVechicleAddress(Address vechicleAddress) {
		this.vechicleAddress = vechicleAddress;
	}
*/
>>>>>>> base
=======
>>>>>>> CM
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
