
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTotalOSBalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTotalOSBalResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctTotalOSBalDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbAcctTotalOSBalDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTotalOSBalResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "acctTotalOSBalDTO"
})
public class AcctTotalOSBalResponse {

    @XmlElementRef(name = "acctTotalOSBalDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbAcctTotalOSBalDTO> acctTotalOSBalDTO;

    /**
     * Gets the value of the acctTotalOSBalDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctTotalOSBalDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbAcctTotalOSBalDTO> getAcctTotalOSBalDTO() {
        return acctTotalOSBalDTO;
    }

    /**
     * Sets the value of the acctTotalOSBalDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctTotalOSBalDTO }{@code >}
     *     
     */
    public void setAcctTotalOSBalDTO(JAXBElement<MrbEsbAcctTotalOSBalDTO> value) {
        this.acctTotalOSBalDTO = value;
    }

}
