//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetThings3.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThingOrderBySpecs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThingOrderBySpecs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order-by-property" type="{urn:com.microsoft.wc.methods.GetThings3}ThingOrderBySpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThingOrderBySpecs", namespace = "urn:com.microsoft.wc.methods.GetThings3", propOrder = {
    "orderByProperty"
})
public class ThingOrderBySpecs {

    @XmlElement(name = "order-by-property", required = true)
    protected ThingOrderBySpec orderByProperty;

    /**
     * Gets the value of the orderByProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ThingOrderBySpec }
     *     
     */
    public ThingOrderBySpec getOrderByProperty() {
        return orderByProperty;
    }

    /**
     * Sets the value of the orderByProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThingOrderBySpec }
     *     
     */
    public void setOrderByProperty(ThingOrderBySpec value) {
        this.orderByProperty = value;
    }

}