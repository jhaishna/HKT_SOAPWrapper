
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctCommonInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctCommonInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctCommonInfoResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbAcctCommonInfoResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctCommonInfoResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "acctCommonInfoResultDTO"
})
public class AcctCommonInfoResponse {

    @XmlElementRef(name = "acctCommonInfoResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbAcctCommonInfoResultDTO> acctCommonInfoResultDTO;

    /**
     * Gets the value of the acctCommonInfoResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctCommonInfoResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbAcctCommonInfoResultDTO> getAcctCommonInfoResultDTO() {
        return acctCommonInfoResultDTO;
    }

    /**
     * Sets the value of the acctCommonInfoResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctCommonInfoResultDTO }{@code >}
     *     
     */
    public void setAcctCommonInfoResultDTO(JAXBElement<MrbEsbAcctCommonInfoResultDTO> value) {
        this.acctCommonInfoResultDTO = value;
    }

}
