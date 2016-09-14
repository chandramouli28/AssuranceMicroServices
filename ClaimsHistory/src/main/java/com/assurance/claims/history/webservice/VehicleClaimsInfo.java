
package com.assurance.claims.history.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleClaimsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleClaimsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="claimYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleClaimsInfo", propOrder = {
    "claimAmount",
    "claimId",
    "claimYear",
    "vin"
})
public class VehicleClaimsInfo {

    protected int claimAmount;
    protected int claimId;
    protected int claimYear;
    protected String vin;

    /**
     * Gets the value of the claimAmount property.
     * 
     */
    public int getClaimAmount() {
        return claimAmount;
    }

    /**
     * Sets the value of the claimAmount property.
     * 
     */
    public void setClaimAmount(int value) {
        this.claimAmount = value;
    }

    /**
     * Gets the value of the claimId property.
     * 
     */
    public int getClaimId() {
        return claimId;
    }

    /**
     * Sets the value of the claimId property.
     * 
     */
    public void setClaimId(int value) {
        this.claimId = value;
    }

    /**
     * Gets the value of the claimYear property.
     * 
     */
    public int getClaimYear() {
        return claimYear;
    }

    /**
     * Sets the value of the claimYear property.
     * 
     */
    public void setClaimYear(int value) {
        this.claimYear = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

}
