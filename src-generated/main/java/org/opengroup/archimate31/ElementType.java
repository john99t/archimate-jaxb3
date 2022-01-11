//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.03 at 05:13:06 PM GMT 
//


package org.opengroup.archimate31;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *                 A base element type that can be extended by concrete ArchiMate types.
 * 
 *                 Note that ElementType is abstract, so one must have derived types of this type. this is indicated in xml
 *                 by having a tag name of "element" and an attribute of xsi:type="BusinessRole" where BusinessRole is
 *                 a derived type from ElementType.
 *             
 * 
 * <p>Java class for ElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengroup.org/xsd/archimate/3.0/}ConceptType"&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementType")
@XmlSeeAlso({
    RealElementType.class,
    CompositeType.class,
    RelationshipConnectorType.class
})
public abstract class ElementType
    extends ConceptType
{


}
