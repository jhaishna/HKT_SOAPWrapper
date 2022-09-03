
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctInfoResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbAcctInfoResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctInfoResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "acctInfoResultDTO"
})
public class AcctInfoResponse {

    @XmlElementRef(name = "acctInfoResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbAcctInfoResultDTO> acctInfoResultDTO;

    /**
     * Gets the value of the acctInfoResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctInfoResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbAcctInfoResultDTO> getAcctInfoResultDTO() {
        return acctInfoResultDTO;
    }

    /**
     * Sets the value of the acctInfoResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctInfoResultDTO }{@code >}
     *     
     */
    public void setAcctInfoResultDTO(JAXBElement<MrbEsbAcctInfoResultDTO> value) {
        this.acctInfoResultDTO = value;
    }

}
