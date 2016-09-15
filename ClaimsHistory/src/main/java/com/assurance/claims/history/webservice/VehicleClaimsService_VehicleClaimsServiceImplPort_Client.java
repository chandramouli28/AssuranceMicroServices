
package com.assurance.claims.history.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2016-09-14T12:07:29.676-05:00
 * Generated source version: 2.7.3
 * 
 */
public final class VehicleClaimsService_VehicleClaimsServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.claims.autocheck.com/", "ServiceProvider");

    private VehicleClaimsService_VehicleClaimsServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ServiceProvider.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ServiceProvider ss = new ServiceProvider(wsdlURL, SERVICE_NAME);
        VehicleClaimsService port = ss.getVehicleClaimsServiceImplPort();  
        
        {
        System.out.println("Invoking getVehicleClaimHistory...");
        java.lang.String _getVehicleClaimHistory_arg0 = "";
        java.util.List<com.assurance.claims.history.webservice.VehicleClaimsInfo> _getVehicleClaimHistory__return = port.getVehicleClaimHistory(_getVehicleClaimHistory_arg0);
        System.out.println("getVehicleClaimHistory.result=" + _getVehicleClaimHistory__return);


        }

        System.exit(0);
    }

}