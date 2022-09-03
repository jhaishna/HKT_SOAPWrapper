
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
 *         &lt;element name="unbilledDailyRoamWifiRequest" type="{http://schema.mrb.mob.bom/xsd}UnbilledDailyRoamWifiRequest" minOccurs="0"/&gt;
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
    "unbilledDailyRoamWifiRequest"
})
@XmlRootElement(name = "getUnbilledDailyRoamWifi")
public class GetUnbilledDailyRoamWifi {

    @XmlElementRef(name = "unbilledDailyRoamWifiRequest", namespace = "http://services.mrb.mob.bom", type = JAXBElement.class, required = false)
    protected JAXBElement<UnbilledDailyRoamWifiRequest> unbilledDailyRoamWifiRequest;

    /**
     * Gets the value of the unbilledDailyRoamWifiRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnbilledDailyRoamWifiRequest }{@code >}
     *     
     */
    public JAXBElement<UnbilledDailyRoamWifiRequest> getUnbilledDailyRoamWifiRequest() {
        return unbilledDailyRoamWifiRequest;
    }

    /**
     * Sets the value of the unbilledDailyRoamWifiRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnbilledDailyRoamWifiRequest }{@code >}
     *     
     */
    public void setUnbilledDailyRoamWifiRequest(JAXBElement<UnbilledDailyRoamWifiRequest> value) {
        this.unbilledDailyRoamWifiRequest = value;
    }

}
