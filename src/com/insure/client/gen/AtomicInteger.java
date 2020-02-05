
package com.insure.client.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atomicInteger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atomicInteger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://server.insure.com/}number"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="opaque" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="plain" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomicInteger", propOrder = {
    "opaque",
    "plain"
})
public class AtomicInteger
    extends Number
{

    protected int opaque;
    protected int plain;

    /**
     * Gets the value of the opaque property.
     * 
     */
    public int getOpaque() {
        return opaque;
    }

    /**
     * Sets the value of the opaque property.
     * 
     */
    public void setOpaque(int value) {
        this.opaque = value;
    }

    /**
     * Gets the value of the plain property.
     * 
     */
    public int getPlain() {
        return plain;
    }

    /**
     * Sets the value of the plain property.
     * 
     */
    public void setPlain(int value) {
        this.plain = value;
    }

}
