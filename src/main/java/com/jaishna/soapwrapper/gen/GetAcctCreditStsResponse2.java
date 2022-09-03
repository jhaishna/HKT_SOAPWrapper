
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAcctCreditStsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAcctCreditStsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctCreditStsResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbAcctCreditStsResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAcctCreditStsResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "acctCreditStsResultDTO"
})
public class GetAcctCreditStsResponse2 {

    @XmlElementRef(name = "acctCreditStsResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbAcctCreditStsResultDTO> acctCreditStsResultDTO;

    /**
     * Gets the value of the acctCreditStsResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctCreditStsResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbAcctCreditStsResultDTO> getAcctCreditStsResultDTO() {
        return acctCreditStsResultDTO;
    }

    /**
     * Sets the value of the acctCreditStsResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctCreditStsResultDTO }{@code >}
     *     
     */
    public void setAcctCreditStsResultDTO(JAXBElement<MrbEsbAcctCreditStsResultDTO> value) {
        this.acctCreditStsResultDTO = value;
    }

}
