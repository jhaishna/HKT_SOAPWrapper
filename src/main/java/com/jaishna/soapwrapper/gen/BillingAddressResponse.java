
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingAddressResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingAddressResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingAddressDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbBillingAddressDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingAddressResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "billingAddressDTO"
})
public class BillingAddressResponse {

    @XmlElementRef(name = "billingAddressDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbBillingAddressDTO> billingAddressDTO;

    /**
     * Gets the value of the billingAddressDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbBillingAddressDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbBillingAddressDTO> getBillingAddressDTO() {
        return billingAddressDTO;
    }

    /**
     * Sets the value of the billingAddressDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbBillingAddressDTO }{@code >}
     *     
     */
    public void setBillingAddressDTO(JAXBElement<MrbEsbBillingAddressDTO> value) {
        this.billingAddressDTO = value;
    }

}
