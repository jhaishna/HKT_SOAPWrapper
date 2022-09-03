
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
 *         &lt;element name="acctSingleCreditInfoRequest" type="{http://schema.mrb.mob.bom/xsd}AcctSingleCreditInfoRequest" minOccurs="0"/&gt;
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
    "acctSingleCreditInfoRequest"
})
@XmlRootElement(name = "getAcctSingleCreditInfo")
public class GetAcctSingleCreditInfo {

    @XmlElementRef(name = "acctSingleCreditInfoRequest", namespace = "http://services.mrb.mob.bom", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctSingleCreditInfoRequest> acctSingleCreditInfoRequest;

    /**
     * Gets the value of the acctSingleCreditInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctSingleCreditInfoRequest }{@code >}
     *     
     */
    public JAXBElement<AcctSingleCreditInfoRequest> getAcctSingleCreditInfoRequest() {
        return acctSingleCreditInfoRequest;
    }

    /**
     * Sets the value of the acctSingleCreditInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctSingleCreditInfoRequest }{@code >}
     *     
     */
    public void setAcctSingleCreditInfoRequest(JAXBElement<AcctSingleCreditInfoRequest> value) {
        this.acctSingleCreditInfoRequest = value;
    }

}
