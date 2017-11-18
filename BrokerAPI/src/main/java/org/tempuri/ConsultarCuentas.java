
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
 *         &lt;element name="reqCuentas" type="{http://tempuri.org/}CuentasBE" minOccurs="0"/>
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
    "reqCuentas"
})
@XmlRootElement(name = "ConsultarCuentas")
public class ConsultarCuentas {

    protected CuentasBE reqCuentas;

    /**
     * Obtiene el valor de la propiedad reqCuentas.
     * 
     * @return
     *     possible object is
     *     {@link CuentasBE }
     *     
     */
    public CuentasBE getReqCuentas() {
        return reqCuentas;
    }

    /**
     * Define el valor de la propiedad reqCuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentasBE }
     *     
     */
    public void setReqCuentas(CuentasBE value) {
        this.reqCuentas = value;
    }

}
