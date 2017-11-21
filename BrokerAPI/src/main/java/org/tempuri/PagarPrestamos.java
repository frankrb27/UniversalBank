
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
 *         &lt;element name="pagoPrestamo" type="{http://tempuri.org/}PrestamosBE" minOccurs="0"/>
 *         &lt;element name="reqCuenta" type="{http://tempuri.org/}CuentasBE" minOccurs="0"/>
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
    "pagoPrestamo",
    "reqCuenta"
})
@XmlRootElement(name = "PagarPrestamos")
public class PagarPrestamos {

    protected PrestamosBE pagoPrestamo;
    protected CuentasBE reqCuenta;

    /**
     * Obtiene el valor de la propiedad pagoPrestamo.
     * 
     * @return
     *     possible object is
     *     {@link PrestamosBE }
     *     
     */
    public PrestamosBE getPagoPrestamo() {
        return pagoPrestamo;
    }

    /**
     * Define el valor de la propiedad pagoPrestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestamosBE }
     *     
     */
    public void setPagoPrestamo(PrestamosBE value) {
        this.pagoPrestamo = value;
    }

    /**
     * Obtiene el valor de la propiedad reqCuenta.
     * 
     * @return
     *     possible object is
     *     {@link CuentasBE }
     *     
     */
    public CuentasBE getReqCuenta() {
        return reqCuenta;
    }

    /**
     * Define el valor de la propiedad reqCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentasBE }
     *     
     */
    public void setReqCuenta(CuentasBE value) {
        this.reqCuenta = value;
    }

}
