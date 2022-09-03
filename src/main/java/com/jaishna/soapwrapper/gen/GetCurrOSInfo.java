
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currOSInfoRequest" type="{http://schema.mrb.mob.bom/xsd}CurrOSInfoRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currOSInfoRequest"
})
@XmlRootElement(name = "getCurrOSInfo")
public class GetCurrOSInfo {

    @XmlElementRef(name = "currOSInfoRequest", namespace = "http://services.mrb.mob.bom", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrOSInfoRequest> currOSInfoRequest;

    /**
     * Gets the value of the currOSInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrOSInfoRequest }{@code >}
     *     
     */
    public JAXBElement<CurrOSInfoRequest> getCurrOSInfoRequest() {
        return currOSInfoRequest;
    }

    /**
     * Sets the value of the currOSInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrOSInfoRequest }{@code >}
     *     
     */
    public void setCurrOSInfoRequest(JAXBElement<CurrOSInfoRequest> value) {
        this.currOSInfoRequest = value;
    }

}
