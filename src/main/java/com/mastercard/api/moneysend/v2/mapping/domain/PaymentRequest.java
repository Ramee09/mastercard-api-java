//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.28 at 08:54:39 PM CDT 
//


package com.mastercard.api.moneysend.v2.mapping.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionReference" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SenderAddress">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CountrySubdivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReceivingCard">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReceivingMapped">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubscriberId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *                   &lt;element name="SubscriberType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SubscriberAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReceivingAmount">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICA" type="{http://www.w3.org/2001/XMLSchema}String"/>
 *         &lt;element name="ProcessorId" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="RoutingAndTransitNumber" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="CardAcceptor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransactionDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "localDate",
    "localTime",
    "transactionReference",
    "senderName",
    "senderAddress",
    "receivingCard",
    "receivingMapped",
    "receivingAmount",
    "ica",
    "processorId",
    "routingAndTransitNumber",
    "cardAcceptor",
    "transactionDesc",
    "merchantId"
})
@XmlRootElement(name = "PaymentRequest")
public class PaymentRequest {

    @XmlElement(name = "LocalDate")
    protected String localDate;
    @XmlElement(name = "LocalTime")
    protected String localTime;
    @XmlElement(name = "TransactionReference")
    protected Long transactionReference;
    @XmlElement(name = "SenderName", required = true)
    protected String senderName;
    @XmlElement(name = "SenderAddress", required = true)
    protected SenderAddress senderAddress;
    @XmlElement(name = "ReceivingCard", required = true)
    protected ReceivingCard receivingCard;
    @XmlElement(name = "ReceivingMapped", required = true)
    protected ReceivingMapped receivingMapped;
    @XmlElement(name = "ReceivingAmount", required = true)
    protected ReceivingAmount receivingAmount;
    @XmlElement(name = "ICA")
    protected String ica;
    @XmlElement(name = "ProcessorId")
    protected Long processorId;
    @XmlElement(name = "RoutingAndTransitNumber")
    protected Integer routingAndTransitNumber;
    @XmlElement(name = "CardAcceptor", required = true)
    protected CardAcceptor cardAcceptor;
    @XmlElement(name = "TransactionDesc", required = true)
    protected String transactionDesc;
    @XmlElement(name = "MerchantId")
    protected Integer merchantId;

    /**
     * Gets the value of the localDate property.
     * 
     */
    public String getLocalDate() {
        return localDate;
    }

    /**
     * Sets the value of the localDate property.
     * 
     */
    public void setLocalDate(String value) {
        this.localDate = value;
    }

    /**
     * Gets the value of the localTime property.
     * 
     */
    public String getLocalTime() {
        return localTime;
    }

    /**
     * Sets the value of the localTime property.
     * 
     */
    public void setLocalTime(String value) {
        this.localTime = value;
    }

    /**
     * Gets the value of the transactionReference property.
     * 
     */
    public Long getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     */
    public void setTransactionReference(Long value) {
        this.transactionReference = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.SenderAddress }
     *     
     */
    public SenderAddress getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.SenderAddress }
     *     
     */
    public void setSenderAddress(SenderAddress value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the receivingCard property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.ReceivingCard }
     *     
     */
    public ReceivingCard getReceivingCard() {
        return receivingCard;
    }

    /**
     * Sets the value of the receivingCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.ReceivingCard }
     *     
     */
    public void setReceivingCard(ReceivingCard value) {
        this.receivingCard = value;
    }

    /**
     * Gets the value of the receivingMapped property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.ReceivingMapped }
     *     
     */
    public ReceivingMapped getReceivingMapped() {
        return receivingMapped;
    }

    /**
     * Sets the value of the receivingMapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.ReceivingMapped }
     *     
     */
    public void setReceivingMapped(ReceivingMapped value) {
        this.receivingMapped = value;
    }

    /**
     * Gets the value of the receivingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.ReceivingAmount }
     *     
     */
    public ReceivingAmount getReceivingAmount() {
        return receivingAmount;
    }

    /**
     * Sets the value of the receivingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.ReceivingAmount }
     *     
     */
    public void setReceivingAmount(ReceivingAmount value) {
        this.receivingAmount = value;
    }

    /**
     * Gets the value of the ica property.
     * 
     */
    public String getICA() {
        return ica;
    }

    /**
     * Sets the value of the ica property.
     * 
     */
    public void setICA(String value) {
        this.ica = value;
    }

    /**
     * Gets the value of the processorId property.
     * 
     */
    public Long getProcessorId() {
        return processorId;
    }

    /**
     * Sets the value of the processorId property.
     * 
     */
    public void setProcessorId(Long value) {
        this.processorId = value;
    }

    /**
     * Gets the value of the routingAndTransitNumber property.
     * 
     */
    public Integer getRoutingAndTransitNumber() {
        return routingAndTransitNumber;
    }

    /**
     * Sets the value of the routingAndTransitNumber property.
     * 
     */
    public void setRoutingAndTransitNumber(Integer value) {
        this.routingAndTransitNumber = value;
    }

    /**
     * Gets the value of the cardAcceptor property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.CardAcceptor }
     *     
     */
    public CardAcceptor getCardAcceptor() {
        return cardAcceptor;
    }

    /**
     * Sets the value of the cardAcceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.PaymentRequest.CardAcceptor }
     *     
     */
    public void setCardAcceptor(CardAcceptor value) {
        this.cardAcceptor = value;
    }

    /**
     * Gets the value of the transactionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDesc() {
        return transactionDesc;
    }

    /**
     * Sets the value of the transactionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDesc(String value) {
        this.transactionDesc = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     */
    public void setMerchantId(Integer value) {
        this.merchantId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "city",
        "state",
        "postalCode",
        "country"
    })
    public static class CardAcceptor {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "City", required = true)
        protected String city;
        @XmlElement(name = "State", required = true)
        protected String state;
        @XmlElement(name = "PostalCode")
        protected Integer postalCode;
        @XmlElement(name = "Country", required = true)
        protected String country;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         */
        public Integer getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         */
        public void setPostalCode(Integer value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value",
        "currency"
    })
    public static class ReceivingAmount {

        @XmlElement(name = "Value")
        protected Integer value;
        @XmlElement(name = "Currency")
        protected Integer currency;

        /**
         * Gets the value of the value property.
         * 
         */
        public Integer getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(Integer value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         */
        public Integer getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         */
        public void setCurrency(Integer value) {
            this.currency = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}Long"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountNumber"
    })
    public static class ReceivingCard {

        @XmlElement(name = "AccountNumber")
        protected Long accountNumber;

        /**
         * Gets the value of the accountNumber property.
         * 
         */
        public Long getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         */
        public void setAccountNumber(Long value) {
            this.accountNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SubscriberId" type="{http://www.w3.org/2001/XMLSchema}string
     *         "/>
     *         &lt;element name="SubscriberType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SubscriberAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subscriberId",
        "subscriberType",
        "subscriberAlias"
    })
    public static class ReceivingMapped {

        @XmlElement(name = "SubscriberId")
        protected String subscriberId;
        @XmlElement(name = "SubscriberType", required = true)
        protected String subscriberType;
        @XmlElement(name = "SubscriberAlias", required = true)
        protected String subscriberAlias;

        /**
         * Gets the value of the subscriberId property.
         * 
         */
        public String getSubscriberId() {
            return subscriberId;
        }

        /**
         * Sets the value of the subscriberId property.
         * 
         */
        public void setSubscriberId(String value) {
            this.subscriberId = value;
        }

        /**
         * Gets the value of the subscriberType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberType() {
            return subscriberType;
        }

        /**
         * Sets the value of the subscriberType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberType(String value) {
            this.subscriberType = value;
        }

        /**
         * Gets the value of the subscriberAlias property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberAlias() {
            return subscriberAlias;
        }

        /**
         * Sets the value of the subscriberAlias property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberAlias(String value) {
            this.subscriberAlias = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CountrySubdivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "line1",
        "line2",
        "city",
        "countrySubdivision",
        "postalCode",
        "country"
    })
    public static class SenderAddress {

        @XmlElement(name = "Line1", required = true)
        protected String line1;
        @XmlElement(name = "Line2", required = true)
        protected String line2;
        @XmlElement(name = "City", required = true)
        protected String city;
        @XmlElement(name = "CountrySubdivision", required = true)
        protected String countrySubdivision;
        @XmlElement(name = "PostalCode")
        protected Integer postalCode;
        @XmlElement(name = "Country", required = true)
        protected String country;

        /**
         * Gets the value of the line1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine1() {
            return line1;
        }

        /**
         * Sets the value of the line1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine1(String value) {
            this.line1 = value;
        }

        /**
         * Gets the value of the line2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine2() {
            return line2;
        }

        /**
         * Sets the value of the line2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine2(String value) {
            this.line2 = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the countrySubdivision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountrySubdivision() {
            return countrySubdivision;
        }

        /**
         * Sets the value of the countrySubdivision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountrySubdivision(String value) {
            this.countrySubdivision = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         */
        public Integer getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         */
        public void setPostalCode(Integer value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

    }

}
