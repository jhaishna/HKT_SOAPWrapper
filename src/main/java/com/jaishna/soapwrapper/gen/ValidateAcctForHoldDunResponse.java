
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateAcctForHoldDunResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateAcctForHoldDunResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validationHoldDunDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbValidationHoldDunDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateAcctForHoldDunResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "validationHoldDunDTO"
})
public class ValidateAcctForHoldDunResponse {

    @XmlElementRef(name = "validationHoldDunDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbValidationHoldDunDTO> validationHoldDunDTO;

    /**
     * Gets the value of the validationHoldDunDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbValidationHoldDunDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbValidationHoldDunDTO> getValidationHoldDunDTO() {
        return validationHoldDunDTO;
    }

    /**
     * Sets the value of the validationHoldDunDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbValidationHoldDunDTO }{@code >}
     *     
     */
    public void setValidationHoldDunDTO(JAXBElement<MrbEsbValidationHoldDunDTO> value) {
        this.validationHoldDunDTO = value;
    }

}
