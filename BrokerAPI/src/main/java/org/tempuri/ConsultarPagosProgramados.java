
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
 *         &lt;element name="reqPago" type="{http://tempuri.org/}PagosProgramadosBE" minOccurs="0"/>
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
    "reqPago"
})
@XmlRootElement(name = "ConsultarPagosProgramados")
public class ConsultarPagosProgramados {

    protected PagosProgramadosBE reqPago;

    /**
     * Obtiene el valor de la propiedad reqPago.
     * 
     * @return
     *     possible object is
     *     {@link PagosProgramadosBE }
     *     
     */
    public PagosProgramadosBE getReqPago() {
        return reqPago;
    }

    /**
     * Define el valor de la propiedad reqPago.
     * 
     * @param value
     *     allowed object is
     *     {@link PagosProgramadosBE }
     *     
     */
    public void setReqPago(PagosProgramadosBE value) {
        this.reqPago = value;
    }

}
