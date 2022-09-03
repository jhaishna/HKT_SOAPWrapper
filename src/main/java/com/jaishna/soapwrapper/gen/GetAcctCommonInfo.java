
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
 *         &lt;element name="acctCommonInfoRequest" type="{http://schema.mrb.mob.bom/xsd}AcctCommonInfoRequest" minOccurs="0"/&gt;
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
    "acctCommonInfoRequest"
})
@XmlRootElement(name = "getAcctCommonInfo")
public class GetAcctCommonInfo {

    @XmlElementRef(name = "acctCommonInfoRequest", namespace = "http://services.mrb.mob.bom", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctCommonInfoRequest> acctCommonInfoRequest;

    /**
     * Gets the value of the acctCommonInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctCommonInfoRequest }{@code >}
     *     
     */
    public JAXBElement<AcctCommonInfoRequest> getAcctCommonInfoRequest() {
        return acctCommonInfoRequest;
    }

    /**
     * Sets the value of the acctCommonInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctCommonInfoRequest }{@code >}
     *     
     */
    public void setAcctCommonInfoRequest(JAXBElement<AcctCommonInfoRequest> value) {
        this.acctCommonInfoRequest = value;
    }

}
