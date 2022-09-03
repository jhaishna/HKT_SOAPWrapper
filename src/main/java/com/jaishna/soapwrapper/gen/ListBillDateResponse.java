
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListBillDateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListBillDateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billDateResultDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbBillDateResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListBillDateResponse", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "billDateResultDTO"
})
public class ListBillDateResponse {

    @XmlElementRef(name = "billDateResultDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbBillDateResultDTO> billDateResultDTO;

    /**
     * Gets the value of the billDateResultDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbBillDateResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbBillDateResultDTO> getBillDateResultDTO() {
        return billDateResultDTO;
    }

    /**
     * Sets the value of the billDateResultDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbBillDateResultDTO }{@code >}
     *     
     */
    public void setBillDateResultDTO(JAXBElement<MrbEsbBillDateResultDTO> value) {
        this.billDateResultDTO = value;
    }

}
