
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
 *         &lt;element name="RegistrarPagoProgramadoResult" type="{http://tempuri.org/}RespuestaPagosProgramadosBE" minOccurs="0"/>
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
    "registrarPagoProgramadoResult"
})
@XmlRootElement(name = "RegistrarPagoProgramadoResponse")
public class RegistrarPagoProgramadoResponse {

    @XmlElement(name = "RegistrarPagoProgramadoResult")
    protected RespuestaPagosProgramadosBE registrarPagoProgramadoResult;

    /**
     * Obtiene el valor de la propiedad registrarPagoProgramadoResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaPagosProgramadosBE }
     *     
     */
    public RespuestaPagosProgramadosBE getRegistrarPagoProgramadoResult() {
        return registrarPagoProgramadoResult;
    }

    /**
     * Define el valor de la propiedad registrarPagoProgramadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaPagosProgramadosBE }
     *     
     */
    public void setRegistrarPagoProgramadoResult(RespuestaPagosProgramadosBE value) {
        this.registrarPagoProgramadoResult = value;
    }

}
