
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DunningHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DunningHistoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dunningHistoryResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbDunningHistoryResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DunningHistoryResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "dunningHistoryResultDTO"
})
public class DunningHistoryResponse {

    @XmlElementRef(name = "dunningHistoryResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbDunningHistoryResultDTO> dunningHistoryResultDTO;

    /**
     * Gets the value of the dunningHistoryResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbDunningHistoryResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbDunningHistoryResultDTO> getDunningHistoryResultDTO() {
        return dunningHistoryResultDTO;
    }

    /**
     * Sets the value of the dunningHistoryResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbDunningHistoryResultDTO }{@code >}
     *     
     */
    public void setDunningHistoryResultDTO(JAXBElement<MrbEsbDunningHistoryResultDTO> value) {
        this.dunningHistoryResultDTO = value;
    }

}
