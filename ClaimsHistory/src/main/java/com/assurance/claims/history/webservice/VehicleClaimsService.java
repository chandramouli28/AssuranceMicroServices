package com.assurance.claims.history.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2016-09-15T16:10:09.157-05:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://service.claims.autocheck.com/", name = "VehicleClaimsService")
@XmlSeeAlso({ObjectFactory.class})
public interface VehicleClaimsService {

    @WebMethod
    @RequestWrapper(localName = "getVehicleClaimHistory", targetNamespace = "http://service.claims.autocheck.com/", className = "com.assurance.claims.history.webservice.GetVehicleClaimHistory")
    @ResponseWrapper(localName = "getVehicleClaimHistoryResponse", targetNamespace = "http://service.claims.autocheck.com/", className = "com.assurance.claims.history.webservice.GetVehicleClaimHistoryResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.assurance.claims.history.webservice.VehicleClaimsInfo> getVehicleClaimHistory(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
