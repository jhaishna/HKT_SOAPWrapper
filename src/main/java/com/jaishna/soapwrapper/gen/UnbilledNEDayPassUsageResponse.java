
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnbilledNEDayPassUsageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbilledNEDayPassUsageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ubNEDayPassUsageResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbUbNEDayPassUsageResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnbilledNEDayPassUsageResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "ubNEDayPassUsageResultDTO"
})
public class UnbilledNEDayPassUsageResponse {

    @XmlElementRef(name = "ubNEDayPassUsageResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbUbNEDayPassUsageResultDTO> ubNEDayPassUsageResultDTO;

    /**
     * Gets the value of the ubNEDayPassUsageResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbUbNEDayPassUsageResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbUbNEDayPassUsageResultDTO> getUbNEDayPassUsageResultDTO() {
        return ubNEDayPassUsageResultDTO;
    }

    /**
     * Sets the value of the ubNEDayPassUsageResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbUbNEDayPassUsageResultDTO }{@code >}
     *     
     */
    public void setUbNEDayPassUsageResultDTO(JAXBElement<MrbEsbUbNEDayPassUsageResultDTO> value) {
        this.ubNEDayPassUsageResultDTO = value;
    }

}
