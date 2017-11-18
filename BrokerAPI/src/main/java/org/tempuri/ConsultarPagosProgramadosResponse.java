
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
 *         &lt;element name="ConsultarPagosProgramadosResult" type="{http://tempuri.org/}ArrayOfPagosProgramadosBE" minOccurs="0"/>
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
    "consultarPagosProgramadosResult"
})
@XmlRootElement(name = "ConsultarPagosProgramadosResponse")
public class ConsultarPagosProgramadosResponse {

    @XmlElement(name = "ConsultarPagosProgramadosResult")
    protected ArrayOfPagosProgramadosBE consultarPagosProgramadosResult;

    /**
     * Obtiene el valor de la propiedad consultarPagosProgramadosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPagosProgramadosBE }
     *     
     */
    public ArrayOfPagosProgramadosBE getConsultarPagosProgramadosResult() {
        return consultarPagosProgramadosResult;
    }

    /**
     * Define el valor de la propiedad consultarPagosProgramadosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPagosProgramadosBE }
     *     
     */
    public void setConsultarPagosProgramadosResult(ArrayOfPagosProgramadosBE value) {
        this.consultarPagosProgramadosResult = value;
    }

}
