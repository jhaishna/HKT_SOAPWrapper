
package com.jaishna.soapwrapper.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MrbEsbUbNEDayPassUsageDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MrbEsbUbNEDayPassUsageDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listUbNEDayPass" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbUbNEDayPassDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="neDayPassChiDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neDayPassEngDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MrbEsbUbNEDayPassUsageDTO", namespace = "http://esbSi.object.mrb.mob.bom/xsd", propOrder = {
    "listUbNEDayPass",
    "neDayPassChiDescr",
    "neDayPassEngDescr"
})
public class MrbEsbUbNEDayPassUsageDTO {

    @XmlElement(nillable = true)
    protected List<MrbEsbUbNEDayPassDTO> listUbNEDayPass;
    @XmlElementRef(name = "neDayPassChiDescr", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neDayPassChiDescr;
    @XmlElementRef(name = "neDayPassEngDescr", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neDayPassEngDescr;

    /**
     * Gets the value of the listUbNEDayPass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listUbNEDayPass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListUbNEDayPass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MrbEsbUbNEDayPassDTO }
     * 
     * 
     */
    public List<MrbEsbUbNEDayPassDTO> getListUbNEDayPass() {
        if (listUbNEDayPass == null) {
            listUbNEDayPass = new ArrayList<MrbEsbUbNEDayPassDTO>();
        }
        return this.listUbNEDayPass;
    }

    /**
     * Gets the value of the neDayPassChiDescr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeDayPassChiDescr() {
        return neDayPassChiDescr;
    }

    /**
     * Sets the value of the neDayPassChiDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeDayPassChiDescr(JAXBElement<String> value) {
        this.neDayPassChiDescr = value;
    }

    /**
     * Gets the value of the neDayPassEngDescr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeDayPassEngDescr() {
        return neDayPassEngDescr;
    }

    /**
     * Sets the value of the neDayPassEngDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeDayPassEngDescr(JAXBElement<String> value) {
        this.neDayPassEngDescr = value;
    }

}
