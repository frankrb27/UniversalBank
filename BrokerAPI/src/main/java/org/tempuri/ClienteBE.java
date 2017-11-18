
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClienteBE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClienteBE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClienteBE", propOrder = {
    "idCliente",
    "tipoDocumento",
    "codigoTipoDocumento",
    "descripcionTipoDocumento",
    "documento",
    "primerNombre",
    "segundoNombre",
    "primerApellido",
    "segundoApellido",
    "telefono",
    "direccion",
    "correo",
    "idArea",
    "descripcionArea",
    "segmento"
})
public class ClienteBE {

    @XmlElement(name = "IdCliente")
    protected int idCliente;
    @XmlElement(name = "TipoDocumento")
    protected int tipoDocumento;
    @XmlElement(name = "CodigoTipoDocumento")
    protected String codigoTipoDocumento;
    @XmlElement(name = "DescripcionTipoDocumento")
    protected String descripcionTipoDocumento;
    @XmlElement(name = "Documento")
    protected String documento;
    @XmlElement(name = "PrimerNombre")
    protected String primerNombre;
    @XmlElement(name = "SegundoNombre")
    protected String segundoNombre;
    @XmlElement(name = "PrimerApellido")
    protected String primerApellido;
    @XmlElement(name = "SegundoApellido")
    protected String segundoApellido;
    protected String telefono;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "Correo")
    protected String correo;
    @XmlElement(name = "IdArea")
    protected String idArea;
    @XmlElement(name = "DescripcionArea")
    protected String descripcionArea;
    @XmlElement(name = "Segmento")
    protected int segmento;

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     */
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     */
    public void setTipoDocumento(int value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoDocumento(String value) {
        this.codigoTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTipoDocumento() {
        return descripcionTipoDocumento;
    }

    /**
     * Define el valor de la propiedad descripcionTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTipoDocumento(String value) {
        this.descripcionTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad idArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdArea() {
        return idArea;
    }

    /**
     * Define el valor de la propiedad idArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdArea(String value) {
        this.idArea = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionArea() {
        return descripcionArea;
    }

    /**
     * Define el valor de la propiedad descripcionArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionArea(String value) {
        this.descripcionArea = value;
    }

    /**
     * Obtiene el valor de la propiedad segmento.
     * 
     */
    public int getSegmento() {
        return segmento;
    }

    /**
     * Define el valor de la propiedad segmento.
     * 
     */
    public void setSegmento(int value) {
        this.segmento = value;
    }

}
