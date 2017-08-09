//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 12:00:41 PM PDT 
//


package com.microsoft.healthvault.generated.methods.BeginPutBlob.response;

import java.util.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import java.math.BigInteger;
import com.microsoft.healthvault.generated.types.BlobHashAlgorithmParameters;


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
@Root(name="")
@Order(elements = {
    "blobRefUrl",
    "blobChunkSize",
    "maxBlobSize",
    "blobHashAlgorithm",
    "blobHashParameters"
})
public class BeginPutBlobResponse {

    @Element(name = "blob-ref-url", required = true)
    protected String blobRefUrl;
    @Element(name = "blob-chunk-size")
    protected int blobChunkSize;
    @Element(name = "max-blob-size", required = true)
    protected BigInteger maxBlobSize;
    @Element(name = "blob-hash-algorithm", required = true)
    protected String blobHashAlgorithm;
    @Element(name = "blob-hash-parameters", required = true)
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