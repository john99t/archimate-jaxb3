//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.19 at 02:03:38 PM GMT 
//


package org.opengroup.archimate31;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *                 Graphical node type. It can contain child node types.
 *             
 * 
 * <p>Java class for ViewNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewNodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengroup.org/xsd/archimate/3.0/}ViewConceptType"&gt;
 *       &lt;attGroup ref="{http://www.opengroup.org/xsd/archimate/3.0/}SizeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opengroup.org/xsd/archimate/3.0/}LocationGroup"/&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewNodeType")
@XmlSeeAlso({
    Label.class,
    Container.class
})
public abstract class ViewNodeType
    extends ViewConceptType
{

    @XmlAttribute(name = "w", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger w;
    @XmlAttribute(name = "h", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger h;
    @XmlAttribute(name = "x", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger x;
    @XmlAttribute(name = "y", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger y;

    /**
     * Gets the value of the w property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getW() {
        return w;
    }

    /**
     * Sets the value of the w property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setW(BigInteger value) {
        this.w = value;
    }

    /**
     * Gets the value of the h property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setH(BigInteger value) {
        this.h = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setX(BigInteger value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setY(BigInteger value) {
        this.y = value;
    }

}