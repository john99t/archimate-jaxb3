//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.03 at 05:13:06 PM GMT 
//


package org.opengroup.archimate31;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *                 A Style type for a node and a connection.
 *                 It is a container for style properties such as color, font.
 *             
 * 
 * <p>Java class for StyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StyleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="lineColor" type="{http://www.opengroup.org/xsd/archimate/3.0/}RGBColorType" minOccurs="0"/&gt;
 *         &lt;element name="fillColor" type="{http://www.opengroup.org/xsd/archimate/3.0/}RGBColorType" minOccurs="0"/&gt;
 *         &lt;element name="font" type="{http://www.opengroup.org/xsd/archimate/3.0/}FontType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="lineWidth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleType", propOrder = {

})
public class StyleType {

    protected RGBColorType lineColor;
    protected RGBColorType fillColor;
    protected FontType font;
    @XmlAttribute(name = "lineWidth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lineWidth;

    /**
     * Gets the value of the lineColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColorType }
     *     
     */
    public RGBColorType getLineColor() {
        return lineColor;
    }

    /**
     * Sets the value of the lineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColorType }
     *     
     */
    public void setLineColor(RGBColorType value) {
        this.lineColor = value;
    }

    /**
     * Gets the value of the fillColor property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColorType }
     *     
     */
    public RGBColorType getFillColor() {
        return fillColor;
    }

    /**
     * Sets the value of the fillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColorType }
     *     
     */
    public void setFillColor(RGBColorType value) {
        this.fillColor = value;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link FontType }
     *     
     */
    public FontType getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontType }
     *     
     */
    public void setFont(FontType value) {
        this.font = value;
    }

    /**
     * Gets the value of the lineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineWidth(BigInteger value) {
        this.lineWidth = value;
    }

}
