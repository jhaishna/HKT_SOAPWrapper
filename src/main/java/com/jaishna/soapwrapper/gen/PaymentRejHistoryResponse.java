
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRejHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRejHistoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentRejHistoryResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbPaymentRejHistoryResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRejHistoryResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "paymentRejHistoryResultDTO"
})
public class PaymentRejHistoryResponse {

    @XmlElementRef(name = "paymentRejHistoryResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbPaymentRejHistoryResultDTO> paymentRejHistoryResultDTO;

    /**
     * Gets the value of the paymentRejHistoryResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbPaymentRejHistoryResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbPaymentRejHistoryResultDTO> getPaymentRejHistoryResultDTO() {
        return paymentRejHistoryResultDTO;
    }

    /**
     * Sets the value of the paymentRejHistoryResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbPaymentRejHistoryResultDTO }{@code >}
     *     
     */
    public void setPaymentRejHistoryResultDTO(JAXBElement<MrbEsbPaymentRejHistoryResultDTO> value) {
        this.paymentRejHistoryResultDTO = value;
    }

}
