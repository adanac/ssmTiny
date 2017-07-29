
package com.behosoft.edi.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ediService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ediService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ediService", propOrder = {
    "reqData"
})
public class EdiService {

    protected String reqData;

    /**
     * Gets the value of the reqData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqData() {
        return reqData;
    }

    /**
     * Sets the value of the reqData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqData(String value) {
        this.reqData = value;
    }

}
