
package com.assurance.creditaccessor.creditscoregeneration.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.assurance.creditaccessor.creditscoregeneration.webservice package. 
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

    private final static QName _GetCreditScoreBySSN_QNAME = new QName("http://service.creditscore.creditbureau.com/", "getCreditScoreBySSN");
    private final static QName _GetCreditScoreBySSNResponse_QNAME = new QName("http://service.creditscore.creditbureau.com/", "getCreditScoreBySSNResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.assurance.creditaccessor.creditscoregeneration.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCreditScoreBySSN }
     * 
     */
    public GetCreditScoreBySSN createGetCreditScoreBySSN() {
        return new GetCreditScoreBySSN();
    }

    /**
     * Create an instance of {@link GetCreditScoreBySSNResponse }
     * 
     */
    public GetCreditScoreBySSNResponse createGetCreditScoreBySSNResponse() {
        return new GetCreditScoreBySSNResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditScoreBySSN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.creditscore.creditbureau.com/", name = "getCreditScoreBySSN")
    public JAXBElement<GetCreditScoreBySSN> createGetCreditScoreBySSN(GetCreditScoreBySSN value) {
        return new JAXBElement<GetCreditScoreBySSN>(_GetCreditScoreBySSN_QNAME, GetCreditScoreBySSN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditScoreBySSNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.creditscore.creditbureau.com/", name = "getCreditScoreBySSNResponse")
    public JAXBElement<GetCreditScoreBySSNResponse> createGetCreditScoreBySSNResponse(GetCreditScoreBySSNResponse value) {
        return new JAXBElement<GetCreditScoreBySSNResponse>(_GetCreditScoreBySSNResponse_QNAME, GetCreditScoreBySSNResponse.class, null, value);
    }

}
