
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctCreditStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctCreditStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctCreditStatusDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbAcctCreditStatusDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctCreditStatusResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "acctCreditStatusDTO"
})
public class AcctCreditStatusResponse {

    @XmlElementRef(name = "acctCreditStatusDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbAcctCreditStatusDTO> acctCreditStatusDTO;

    /**
     * Gets the value of the acctCreditStatusDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctCreditStatusDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbAcctCreditStatusDTO> getAcctCreditStatusDTO() {
        return acctCreditStatusDTO;
    }

    /**
     * Sets the value of the acctCreditStatusDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbAcctCreditStatusDTO }{@code >}
     *     
     */
    public void setAcctCreditStatusDTO(JAXBElement<MrbEsbAcctCreditStatusDTO> value) {
        this.acctCreditStatusDTO = value;
    }

}
