//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 12:00:41 PM PDT 
//


package com.microsoft.healthvault.generated.thing;

import java.util.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.medical-images"&gt;
 *                     Information about a single image in a series.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for medical-image-study-series-image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medical-image-study-series-image">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="image-blob-name" type="{urn:com.microsoft.wc.thing.types}stringnznw"/>
 *         &lt;element name="image-preview-blob-name" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Root(name="")
@Order(elements = {
    "imageBlobName",
    "imagePreviewBlobName"
})
public class MedicalImageStudySeriesImage {

    @Element(name = "image-blob-name", required = true)
    protected String imageBlobName;
    @Element(name = "image-preview-blob-name")
    protected String imagePreviewBlobName;

    /**
     * Gets the value of the imageBlobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageBlobName() {
        return imageBlobName;
    }

    /**
     * Sets the value of the imageBlobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageBlobName(String value) {
        this.imageBlobName = value;
    }

    /**
     * Gets the value of the imagePreviewBlobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePreviewBlobName() {
        return imagePreviewBlobName;
    }

    /**
     * Sets the value of the imagePreviewBlobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePreviewBlobName(String value) {
        this.imagePreviewBlobName = value;
    }

}