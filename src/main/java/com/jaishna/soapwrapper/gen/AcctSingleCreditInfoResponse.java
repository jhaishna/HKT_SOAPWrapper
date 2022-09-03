
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctSingleCreditInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctSingleCreditInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="singleCreditInfoResDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbSingleCreditInfoResDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctSingleCreditInfoResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "singleCreditInfoResDTO"
})
public class AcctSingleCreditInfoResponse {

    @XmlElementRef(name = "singleCreditInfoResDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbSingleCreditInfoResDTO> singleCreditInfoResDTO;

    /**
     * Gets the value of the singleCreditInfoResDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbSingleCreditInfoResDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbSingleCreditInfoResDTO> getSingleCreditInfoResDTO() {
        return singleCreditInfoResDTO;
    }

    /**
     * Sets the value of the singleCreditInfoResDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbSingleCreditInfoResDTO }{@code >}
     *     
     */
    public void setSingleCreditInfoResDTO(JAXBElement<MrbEsbSingleCreditInfoResDTO> value) {
        this.singleCreditInfoResDTO = value;
    }

}
