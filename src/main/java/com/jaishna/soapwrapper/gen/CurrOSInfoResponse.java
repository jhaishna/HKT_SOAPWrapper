
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrOSInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrOSInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currOSInfoResDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbCurrOSInfoResDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrOSInfoResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "currOSInfoResDTO"
})
public class CurrOSInfoResponse {

    @XmlElementRef(name = "currOSInfoResDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbCurrOSInfoResDTO> currOSInfoResDTO;

    /**
     * Gets the value of the currOSInfoResDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbCurrOSInfoResDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbCurrOSInfoResDTO> getCurrOSInfoResDTO() {
        return currOSInfoResDTO;
    }

    /**
     * Sets the value of the currOSInfoResDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbCurrOSInfoResDTO }{@code >}
     *     
     */
    public void setCurrOSInfoResDTO(JAXBElement<MrbEsbCurrOSInfoResDTO> value) {
        this.currOSInfoResDTO = value;
    }

}
