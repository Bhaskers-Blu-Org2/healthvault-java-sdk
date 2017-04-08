//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//


package com.microsoft.hsg.methods.jaxb.personconfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.types.PersonInfo;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.person" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.person" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for QueryPersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person-info" type="{urn:com.microsoft.wc.types}PersonInfo"/>
 *         &lt;element name="person-info-internal" type="{urn:com.microsoft.wc.person}PersonInfoInternal" minOccurs="0"/>
 *         &lt;element name="person-info-credentials" type="{urn:com.microsoft.wc.person}PersonInfoCredentials" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPersonInfo", propOrder = {
    "personInfo",
    "personInfoInternal",
    "personInfoCredentials"
})
public class QueryPersonInfo {

    @XmlElement(name = "person-info", required = true)
    protected PersonInfo personInfo;
    @XmlElement(name = "person-info-internal")
    protected PersonInfoInternal personInfoInternal;
    @XmlElement(name = "person-info-credentials")
    protected PersonInfoCredentials personInfoCredentials;

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the personInfoInternal property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoInternal }
     *     
     */
    public PersonInfoInternal getPersonInfoInternal() {
        return personInfoInternal;
    }

    /**
     * Sets the value of the personInfoInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoInternal }
     *     
     */
    public void setPersonInfoInternal(PersonInfoInternal value) {
        this.personInfoInternal = value;
    }

    /**
     * Gets the value of the personInfoCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoCredentials }
     *     
     */
    public PersonInfoCredentials getPersonInfoCredentials() {
        return personInfoCredentials;
    }

    /**
     * Sets the value of the personInfoCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoCredentials }
     *     
     */
    public void setPersonInfoCredentials(PersonInfoCredentials value) {
        this.personInfoCredentials = value;
    }

}
