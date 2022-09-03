
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentHistoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentHistoryResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbPaymentHistoryResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentHistoryResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "paymentHistoryResultDTO"
})
public class PaymentHistoryResponse {

    @XmlElementRef(name = "paymentHistoryResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbPaymentHistoryResultDTO> paymentHistoryResultDTO;

    /**
     * Gets the value of the paymentHistoryResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbPaymentHistoryResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbPaymentHistoryResultDTO> getPaymentHistoryResultDTO() {
        return paymentHistoryResultDTO;
    }

    /**
     * Sets the value of the paymentHistoryResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbPaymentHistoryResultDTO }{@code >}
     *     
     */
    public void setPaymentHistoryResultDTO(JAXBElement<MrbEsbPaymentHistoryResultDTO> value) {
        this.paymentHistoryResultDTO = value;
    }

}
