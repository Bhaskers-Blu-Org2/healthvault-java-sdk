//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:40:59 AM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.healthcareproxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.Person;
import com.microsoft.hsg.thing.oxm.jaxb.dates.DateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:hcp="urn:com.microsoft.wc.thing.healthcare-proxy" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to a healthcare proxy.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:hcp="urn:com.microsoft.wc.thing.healthcare-proxy" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         This thing type describes the healthcare proxy of a person.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="proxy" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="alternate" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="primary-witness" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="secondary-witness" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "when",
    "proxy",
    "alternate",
    "primaryWitness",
    "secondaryWitness",
    "content"
})
@XmlRootElement(name = "healthcare-proxy")
public class HealthcareProxy {

    @XmlElement(required = true)
    protected DateTime when;
    protected Person proxy;
    protected Person alternate;
    @XmlElement(name = "primary-witness")
    protected Person primaryWitness;
    @XmlElement(name = "secondary-witness")
    protected Person secondaryWitness;
    protected String content;

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the proxy property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getProxy() {
        return proxy;
    }

    /**
     * Sets the value of the proxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setProxy(Person value) {
        this.proxy = value;
    }

    /**
     * Gets the value of the alternate property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getAlternate() {
        return alternate;
    }

    /**
     * Sets the value of the alternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setAlternate(Person value) {
        this.alternate = value;
    }

    /**
     * Gets the value of the primaryWitness property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPrimaryWitness() {
        return primaryWitness;
    }

    /**
     * Sets the value of the primaryWitness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPrimaryWitness(Person value) {
        this.primaryWitness = value;
    }

    /**
     * Gets the value of the secondaryWitness property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getSecondaryWitness() {
        return secondaryWitness;
    }

    /**
     * Sets the value of the secondaryWitness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setSecondaryWitness(Person value) {
        this.secondaryWitness = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

}
