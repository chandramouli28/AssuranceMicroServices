package com.assurance.claims.history.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2016-09-14T18:03:02.157-05:00
 * Generated source version: 2.7.3
 * 
 */
@WebServiceClient(name = "ServiceProvider", 
                  wsdlLocation = "file:/C:/BCJMay16/Development/Workspace/SOAProject/AssuranceMicroServices/ClaimsHistory/src/main/resources/ClaimHistory.wsdl",
                  targetNamespace = "http://service.claims.autocheck.com/") 
public class ServiceProvider extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.claims.autocheck.com/", "ServiceProvider");
    public final static QName VehicleClaimsServiceImplPort = new QName("http://service.claims.autocheck.com/", "VehicleClaimsServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/BCJMay16/Development/Workspace/SOAProject/AssuranceMicroServices/ClaimsHistory/src/main/resources/ClaimHistory.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceProvider.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/BCJMay16/Development/Workspace/SOAProject/AssuranceMicroServices/ClaimsHistory/src/main/resources/ClaimHistory.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceProvider(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceProvider(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceProvider() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceProvider(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceProvider(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceProvider(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns VehicleClaimsService
     */
    @WebEndpoint(name = "VehicleClaimsServiceImplPort")
    public VehicleClaimsService getVehicleClaimsServiceImplPort() {
        return super.getPort(VehicleClaimsServiceImplPort, VehicleClaimsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleClaimsService
     */
    @WebEndpoint(name = "VehicleClaimsServiceImplPort")
    public VehicleClaimsService getVehicleClaimsServiceImplPort(WebServiceFeature... features) {
        return super.getPort(VehicleClaimsServiceImplPort, VehicleClaimsService.class, features);
    }

}
