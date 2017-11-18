
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqAutenticacion" type="{http://tempuri.org/}AutenticacionBE" minOccurs="0"/>
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
    "reqAutenticacion"
})
@XmlRootElement(name = "AutenticarUsuario")
public class AutenticarUsuario {

    protected AutenticacionBE reqAutenticacion;

    /**
     * Obtiene el valor de la propiedad reqAutenticacion.
     * 
     * @return
     *     possible object is
     *     {@link AutenticacionBE }
     *     
     */
    public AutenticacionBE getReqAutenticacion() {
        return reqAutenticacion;
    }

    /**
     * Define el valor de la propiedad reqAutenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link AutenticacionBE }
     *     
     */
    public void setReqAutenticacion(AutenticacionBE value) {
        this.reqAutenticacion = value;
    }

}
