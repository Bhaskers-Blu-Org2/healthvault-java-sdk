//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.core.application;

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
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}stringnz"/>
 *         &lt;element name="render-filename" type="{urn:com.microsoft.wc.thing.types}stringnz" minOccurs="0"/>
 *         &lt;element name="public-url" type="{urn:com.microsoft.wc.thing.types}stringnz" minOccurs="0"/>
 *         &lt;element name="configuration-url" type="{urn:com.microsoft.wc.thing.types}stringnz" minOccurs="0"/>
 *         &lt;element name="open-query-id" type="{urn:com.microsoft.wc.thing.types}guid" minOccurs="0"/>
 *         &lt;element name="application-data-url" type="{urn:com.microsoft.wc.thing.types}stringnz" minOccurs="0"/>
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
    "renderFilename",
    "publicUrl",
    "configurationUrl",
    "openQueryId",
    "applicationDataUrl"
})
@XmlRootElement(name = "application-data-reference", namespace = "urn:com.microsoft.wc.thing.application-data-reference")
public class ApplicationDataReference {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "render-filename")
    protected String renderFilename;
    @XmlElement(name = "public-url")
    protected String publicUrl;
    @XmlElement(name = "configuration-url")
    protected String configurationUrl;
    @XmlElement(name = "open-query-id")
    protected String openQueryId;
    @XmlElement(name = "application-data-url")
    protected String applicationDataUrl;

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
     * Gets the value of the renderFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderFilename() {
        return renderFilename;
    }

    /**
     * Sets the value of the renderFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderFilename(String value) {
        this.renderFilename = value;
    }

    /**
     * Gets the value of the publicUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicUrl() {
        return publicUrl;
    }

    /**
     * Sets the value of the publicUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicUrl(String value) {
        this.publicUrl = value;
    }

    /**
     * Gets the value of the configurationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationUrl() {
        return configurationUrl;
    }

    /**
     * Sets the value of the configurationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationUrl(String value) {
        this.configurationUrl = value;
    }

    /**
     * Gets the value of the openQueryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenQueryId() {
        return openQueryId;
    }

    /**
     * Sets the value of the openQueryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenQueryId(String value) {
        this.openQueryId = value;
    }

    /**
     * Gets the value of the applicationDataUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDataUrl() {
        return applicationDataUrl;
    }

    /**
     * Sets the value of the applicationDataUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDataUrl(String value) {
        this.applicationDataUrl = value;
    }

}