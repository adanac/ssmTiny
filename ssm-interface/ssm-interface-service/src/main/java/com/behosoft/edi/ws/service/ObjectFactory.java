
package com.behosoft.edi.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.behosoft.edi.ws.service package. 
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

    private final static QName _EdiServiceResponse_QNAME = new QName("http://service.ws.edi.behosoft.com/", "ediServiceResponse");
    private final static QName _EdiService_QNAME = new QName("http://service.ws.edi.behosoft.com/", "ediService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.behosoft.edi.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EdiService }
     * 
     */
    public EdiService createEdiService() {
        return new EdiService();
    }

    /**
     * Create an instance of {@link EdiServiceResponse }
     * 
     */
    public EdiServiceResponse createEdiServiceResponse() {
        return new EdiServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdiServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.edi.behosoft.com/", name = "ediServiceResponse")
    public JAXBElement<EdiServiceResponse> createEdiServiceResponse(EdiServiceResponse value) {
        return new JAXBElement<EdiServiceResponse>(_EdiServiceResponse_QNAME, EdiServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdiService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.edi.behosoft.com/", name = "ediService")
    public JAXBElement<EdiService> createEdiService(EdiService value) {
        return new JAXBElement<EdiService>(_EdiService_QNAME, EdiService.class, null, value);
    }

}
