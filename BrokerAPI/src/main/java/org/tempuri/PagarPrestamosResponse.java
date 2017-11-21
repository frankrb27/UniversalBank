
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
 *         &lt;element name="PagarPrestamosResult" type="{http://tempuri.org/}ConfirmacionTransaccionBE" minOccurs="0"/>
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
    "pagarPrestamosResult"
})
@XmlRootElement(name = "PagarPrestamosResponse")
public class PagarPrestamosResponse {

    @XmlElement(name = "PagarPrestamosResult")
    protected ConfirmacionTransaccionBE pagarPrestamosResult;

    /**
     * Obtiene el valor de la propiedad pagarPrestamosResult.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmacionTransaccionBE }
     *     
     */
    public ConfirmacionTransaccionBE getPagarPrestamosResult() {
        return pagarPrestamosResult;
    }

    /**
     * Define el valor de la propiedad pagarPrestamosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmacionTransaccionBE }
     *     
     */
    public void setPagarPrestamosResult(ConfirmacionTransaccionBE value) {
        this.pagarPrestamosResult = value;
    }

}
