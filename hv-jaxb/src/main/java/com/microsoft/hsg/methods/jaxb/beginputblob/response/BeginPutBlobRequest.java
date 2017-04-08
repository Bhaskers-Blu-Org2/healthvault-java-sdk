//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:17:58 PM PST 
//


package com.microsoft.hsg.methods.jaxb.beginputblob.response;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.types.BlobHashAlgorithmParameters;


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
 *         &lt;element name="blob-ref-url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="blob-chunk-size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="max-blob-size" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="blob-hash-algorithm" type="{urn:com.microsoft.wc.types}stringz255"/>
 *         &lt;element name="blob-hash-parameters" type="{urn:com.microsoft.wc.types}BlobHashAlgorithmParameters"/>
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
    "blobRefUrl",
    "blobChunkSize",
    "maxBlobSize",
    "blobHashAlgorithm",
    "blobHashParameters"
})
@XmlRootElement(name = "info")
public class BeginPutBlobRequest {

    @XmlElement(name = "blob-ref-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String blobRefUrl;
    @XmlElement(name = "blob-chunk-size")
    protected int blobChunkSize;
    @XmlElement(name = "max-blob-size", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxBlobSize;
    @XmlElement(name = "blob-hash-algorithm", required = true)
    protected String blobHashAlgorithm;
    @XmlElement(name = "blob-hash-parameters", required = true)
    protected BlobHashAlgorithmParameters blobHashParameters;

    /**
     * Gets the value of the blobRefUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlobRefUrl() {
        return blobRefUrl;
    }

    /**
     * Sets the value of the blobRefUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlobRefUrl(String value) {
        this.blobRefUrl = value;
    }

    /**
     * Gets the value of the blobChunkSize property.
     * 
     */
    public int getBlobChunkSize() {
        return blobChunkSize;
    }

    /**
     * Sets the value of the blobChunkSize property.
     * 
     */
    public void setBlobChunkSize(int value) {
        this.blobChunkSize = value;
    }

    /**
     * Gets the value of the maxBlobSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxBlobSize() {
        return maxBlobSize;
    }

    /**
     * Sets the value of the maxBlobSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxBlobSize(BigInteger value) {
        this.maxBlobSize = value;
    }

    /**
     * Gets the value of the blobHashAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlobHashAlgorithm() {
        return blobHashAlgorithm;
    }

    /**
     * Sets the value of the blobHashAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlobHashAlgorithm(String value) {
        this.blobHashAlgorithm = value;
    }

    /**
     * Gets the value of the blobHashParameters property.
     * 
     * @return
     *     possible object is
     *     {@link BlobHashAlgorithmParameters }
     *     
     */
    public BlobHashAlgorithmParameters getBlobHashParameters() {
        return blobHashParameters;
    }

    /**
     * Sets the value of the blobHashParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobHashAlgorithmParameters }
     *     
     */
    public void setBlobHashParameters(BlobHashAlgorithmParameters value) {
        this.blobHashParameters = value;
    }

}
