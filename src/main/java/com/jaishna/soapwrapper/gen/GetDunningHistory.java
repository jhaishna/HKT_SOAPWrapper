
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dunningHistoryRequest" type="{http://schema.mrb.mob.bom/xsd}DunningHistoryRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dunningHistoryRequest"
})
@XmlRootElement(name = "getDunningHistory")
public class GetDunningHistory {

    @XmlElementRef(name = "dunningHistoryRequest", namespace = "http://services.mrb.mob.bom", type = JAXBElement.class, required = false)
    protected JAXBElement<DunningHistoryRequest> dunningHistoryRequest;

    /**
     * Gets the value of the dunningHistoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DunningHistoryRequest }{@code >}
     *     
     */
    public JAXBElement<DunningHistoryRequest> getDunningHistoryRequest() {
        return dunningHistoryRequest;
    }

    /**
     * Sets the value of the dunningHistoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DunningHistoryRequest }{@code >}
     *     
     */
    public void setDunningHistoryRequest(JAXBElement<DunningHistoryRequest> value) {
        this.dunningHistoryRequest = value;
    }

}
