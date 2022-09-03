
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
 *         &lt;element name="paymentRejHistoryRequest" type="{http://schema.mrb.mob.bom/xsd}PaymentRejHistoryRequest" minOccurs="0"/&gt;
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
    "paymentRejHistoryRequest"
})
@XmlRootElement(name = "getPaymentRejHistory")
public class GetPaymentRejHistory {

    @XmlElementRef(name = "paymentRejHistoryRequest", namespace = "http://services.mrb.mob.bom", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentRejHistoryRequest> paymentRejHistoryRequest;

    /**
     * Gets the value of the paymentRejHistoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentRejHistoryRequest }{@code >}
     *     
     */
    public JAXBElement<PaymentRejHistoryRequest> getPaymentRejHistoryRequest() {
        return paymentRejHistoryRequest;
    }

    /**
     * Sets the value of the paymentRejHistoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentRejHistoryRequest }{@code >}
     *     
     */
    public void setPaymentRejHistoryRequest(JAXBElement<PaymentRejHistoryRequest> value) {
        this.paymentRejHistoryRequest = value;
    }

}
