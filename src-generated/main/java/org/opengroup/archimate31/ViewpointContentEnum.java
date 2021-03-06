//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.03 at 05:13:06 PM GMT 
//


package org.opengroup.archimate31;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewpointContentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ViewpointContentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Details"/&gt;
 *     &lt;enumeration value="Coherence"/&gt;
 *     &lt;enumeration value="Overview"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ViewpointContentEnum")
@XmlEnum
public enum ViewpointContentEnum {

    @XmlEnumValue("Details")
    DETAILS("Details"),
    @XmlEnumValue("Coherence")
    COHERENCE("Coherence"),
    @XmlEnumValue("Overview")
    OVERVIEW("Overview");
    private final String value;

    ViewpointContentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewpointContentEnum fromValue(String v) {
        for (ViewpointContentEnum c: ViewpointContentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
