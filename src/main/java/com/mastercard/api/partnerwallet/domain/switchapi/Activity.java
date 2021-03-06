
package com.mastercard.api.partnerwallet.domain.switchapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Activity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExpressCheckout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pairing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PairingDataType" type="{}PairingDataType"/>
 *         &lt;element name="PrecheckoutDataType" type="{}PairingDataType"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity", propOrder = {
    "date",
    "expressCheckout",
    "pairing",
    "pairingDataType",
    "precheckoutDataType",
    "extensionPoint"
})
public class Activity {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "ExpressCheckout", required = true)
    protected String expressCheckout;
    @XmlElement(name = "Pairing", required = true)
    protected String pairing;
    @XmlElement(name = "PairingDataType", required = true)
    protected PairingDataType pairingDataType;
    @XmlElement(name = "PrecheckoutDataType", required = true)
    protected PairingDataType precheckoutDataType;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the expressCheckout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressCheckout() {
        return expressCheckout;
    }

    /**
     * Sets the value of the expressCheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressCheckout(String value) {
        this.expressCheckout = value;
    }

    /**
     * Gets the value of the pairing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairing() {
        return pairing;
    }

    /**
     * Sets the value of the pairing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairing(String value) {
        this.pairing = value;
    }

    /**
     * Gets the value of the pairingDataType property.
     * 
     * @return
     *     possible object is
     *     {@link PairingDataType }
     *     
     */
    public PairingDataType getPairingDataType() {
        return pairingDataType;
    }

    /**
     * Sets the value of the pairingDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingDataType }
     *     
     */
    public void setPairingDataType(PairingDataType value) {
        this.pairingDataType = value;
    }

    /**
     * Gets the value of the precheckoutDataType property.
     * 
     * @return
     *     possible object is
     *     {@link PairingDataType }
     *     
     */
    public PairingDataType getPrecheckoutDataType() {
        return precheckoutDataType;
    }

    /**
     * Sets the value of the precheckoutDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingDataType }
     *     
     */
    public void setPrecheckoutDataType(PairingDataType value) {
        this.precheckoutDataType = value;
    }

    /**
     * Gets the value of the extensionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionPoint }
     *     
     */
    public ExtensionPoint getExtensionPoint() {
        return extensionPoint;
    }

    /**
     * Sets the value of the extensionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionPoint }
     *     
     */
    public void setExtensionPoint(ExtensionPoint value) {
        this.extensionPoint = value;
    }

}
