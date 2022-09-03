
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnbillFreeEntitleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbillFreeEntitleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ubFreeEntResDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbUbFreeEntResDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnbillFreeEntitleResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "ubFreeEntResDTO"
})
public class UnbillFreeEntitleResponse {

    @XmlElementRef(name = "ubFreeEntResDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbUbFreeEntResDTO> ubFreeEntResDTO;

    /**
     * Gets the value of the ubFreeEntResDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbUbFreeEntResDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbUbFreeEntResDTO> getUbFreeEntResDTO() {
        return ubFreeEntResDTO;
    }

    /**
     * Sets the value of the ubFreeEntResDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbUbFreeEntResDTO }{@code >}
     *     
     */
    public void setUbFreeEntResDTO(JAXBElement<MrbEsbUbFreeEntResDTO> value) {
        this.ubFreeEntResDTO = value;
    }

}
