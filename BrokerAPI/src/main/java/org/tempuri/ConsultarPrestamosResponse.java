
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ConsultarPrestamosResult" type="{http://tempuri.org/}ArrayOfPrestamosBE" minOccurs="0"/>
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
    "consultarPrestamosResult"
})
@XmlRootElement(name = "ConsultarPrestamosResponse")
public class ConsultarPrestamosResponse {

    @XmlElement(name = "ConsultarPrestamosResult")
    protected ArrayOfPrestamosBE consultarPrestamosResult;

    /**
     * Obtiene el valor de la propiedad consultarPrestamosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrestamosBE }
     *     
     */
    public ArrayOfPrestamosBE getConsultarPrestamosResult() {
        return consultarPrestamosResult;
    }

    /**
     * Define el valor de la propiedad consultarPrestamosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrestamosBE }
     *     
     */
    public void setConsultarPrestamosResult(ArrayOfPrestamosBE value) {
        this.consultarPrestamosResult = value;
    }

}
