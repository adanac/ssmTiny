package com.behosoft.edi.ws.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2016-11-24T18:25:06.760+08:00
 * Generated source version: 2.7.7
 * 
 */
@WebServiceClient(name = "IEdiServiceService", 
                  wsdlLocation = "http://192.168.1.125:8082/BH_EDI/webservice/service?wsdl",
                  targetNamespace = "http://service.ws.edi.behosoft.com/") 
public class IEdiServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.ws.edi.behosoft.com/", "IEdiServiceService");
    public final static QName IEdiServicePort = new QName("http://service.ws.edi.behosoft.com/", "IEdiServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.1.125:8082/BH_EDI/webservice/service?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IEdiServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.1.125:8082/BH_EDI/webservice/service?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IEdiServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IEdiServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IEdiServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IEdiServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IEdiServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IEdiServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IEdiService
     */
    @WebEndpoint(name = "IEdiServicePort")
    public IEdiService getIEdiServicePort() {
        return super.getPort(IEdiServicePort, IEdiService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IEdiService
     */
    @WebEndpoint(name = "IEdiServicePort")
    public IEdiService getIEdiServicePort(WebServiceFeature... features) {
        return super.getPort(IEdiServicePort, IEdiService.class, features);
    }

}