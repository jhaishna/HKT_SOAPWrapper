
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRejectStsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRejectStsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentRejectStsResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbPaymentRejectStsResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRejectStsResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "paymentRejectStsResultDTO"
})
public class PaymentRejectStsResponse {

    @XmlElementRef(name = "paymentRejectStsResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbPaymentRejectStsResultDTO> paymentRejectStsResultDTO;

    /**
     * Gets the value of the paymentRejectStsResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbPaymentRejectStsResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbPaymentRejectStsResultDTO> getPaymentRejectStsResultDTO() {
        return paymentRejectStsResultDTO;
    }

    /**
     * Sets the value of the paymentRejectStsResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbPaymentRejectStsResultDTO }{@code >}
     *     
     */
    public void setPaymentRejectStsResultDTO(JAXBElement<MrbEsbPaymentRejectStsResultDTO> value) {
        this.paymentRejectStsResultDTO = value;
    }

}
