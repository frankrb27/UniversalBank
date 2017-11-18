
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UsuarioAutenticadoBE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UsuarioAutenticadoBE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DescripcionRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cliente" type="{http://tempuri.org/}ClienteBE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioAutenticadoBE", propOrder = {
    "codigoRespuesta",
    "descripcionRespuesta",
    "cliente"
})
public class UsuarioAutenticadoBE {

    @XmlElement(name = "CodigoRespuesta")
    protected int codigoRespuesta;
    @XmlElement(name = "DescripcionRespuesta")
    protected String descripcionRespuesta;
    @XmlElement(name = "Cliente")
    protected ClienteBE cliente;

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     */
    public int getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     */
    public void setCodigoRespuesta(int value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRespuesta() {
        return descripcionRespuesta;
    }

    /**
     * Define el valor de la propiedad descripcionRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRespuesta(String value) {
        this.descripcionRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link ClienteBE }
     *     
     */
    public ClienteBE getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteBE }
     *     
     */
    public void setCliente(ClienteBE value) {
        this.cliente = value;
    }

}
