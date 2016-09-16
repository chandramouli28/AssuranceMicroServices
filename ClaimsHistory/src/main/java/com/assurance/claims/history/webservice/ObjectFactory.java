
package com.assurance.claims.history.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.assurance.claims.history.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetVehicleClaimHistoryResponse_QNAME = new QName("http://service.claims.autocheck.com/", "getVehicleClaimHistoryResponse");
    private final static QName _GetVehicleClaimHistory_QNAME = new QName("http://service.claims.autocheck.com/", "getVehicleClaimHistory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.assurance.claims.history.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVehicleClaimHistory }
     * 
     */
    public GetVehicleClaimHistory createGetVehicleClaimHistory() {
        return new GetVehicleClaimHistory();
    }

    /**
     * Create an instance of {@link GetVehicleClaimHistoryResponse }
     * 
     */
    public GetVehicleClaimHistoryResponse createGetVehicleClaimHistoryResponse() {
        return new GetVehicleClaimHistoryResponse();
    }

    /**
     * Create an instance of {@link VehicleClaimsInfo }
     * 
     */
    public VehicleClaimsInfo createVehicleClaimsInfo() {
        return new VehicleClaimsInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleClaimHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.claims.autocheck.com/", name = "getVehicleClaimHistoryResponse")
    public JAXBElement<GetVehicleClaimHistoryResponse> createGetVehicleClaimHistoryResponse(GetVehicleClaimHistoryResponse value) {
        return new JAXBElement<GetVehicleClaimHistoryResponse>(_GetVehicleClaimHistoryResponse_QNAME, GetVehicleClaimHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleClaimHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.claims.autocheck.com/", name = "getVehicleClaimHistory")
    public JAXBElement<GetVehicleClaimHistory> createGetVehicleClaimHistory(GetVehicleClaimHistory value) {
        return new JAXBElement<GetVehicleClaimHistory>(_GetVehicleClaimHistory_QNAME, GetVehicleClaimHistory.class, null, value);
    }

}
