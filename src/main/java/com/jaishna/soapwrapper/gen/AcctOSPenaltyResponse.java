
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctOSPenaltyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctOSPenaltyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="osPenaltyResDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbOSPenaltyResDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctOSPenaltyResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "osPenaltyResDTO"
})
public class AcctOSPenaltyResponse {

    @XmlElementRef(name = "osPenaltyResDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbOSPenaltyResDTO> osPenaltyResDTO;

    /**
     * Gets the value of the osPenaltyResDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbOSPenaltyResDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbOSPenaltyResDTO> getOsPenaltyResDTO() {
        return osPenaltyResDTO;
    }

    /**
     * Sets the value of the osPenaltyResDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbOSPenaltyResDTO }{@code >}
     *     
     */
    public void setOsPenaltyResDTO(JAXBElement<MrbEsbOSPenaltyResDTO> value) {
        this.osPenaltyResDTO = value;
    }

}
