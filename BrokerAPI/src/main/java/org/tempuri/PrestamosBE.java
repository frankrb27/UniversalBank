
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PrestamosBE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PrestamosBE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdPrestamo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroPrestamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeudaPrestamo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorPagado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrestamosBE", propOrder = {
    "idPrestamo",
    "numeroPrestamo",
    "tipoDocumento",
    "documento",
    "deudaPrestamo",
    "valorPagado"
})
public class PrestamosBE {

    @XmlElement(name = "IdPrestamo")
    protected int idPrestamo;
    @XmlElement(name = "NumeroPrestamo")
    protected String numeroPrestamo;
    @XmlElement(name = "TipoDocumento")
    protected int tipoDocumento;
    @XmlElement(name = "Documento")
    protected String documento;
    @XmlElement(name = "DeudaPrestamo", required = true)
    protected BigDecimal deudaPrestamo;
    @XmlElement(name = "ValorPagado", required = true)
    protected BigDecimal valorPagado;

    /**
     * Obtiene el valor de la propiedad idPrestamo.
     * 
     */
    public int getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * Define el valor de la propiedad idPrestamo.
     * 
     */
    public void setIdPrestamo(int value) {
        this.idPrestamo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPrestamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    /**
     * Define el valor de la propiedad numeroPrestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPrestamo(String value) {
        this.numeroPrestamo = value;
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
     * Obtiene el valor de la propiedad deudaPrestamo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeudaPrestamo() {
        return deudaPrestamo;
    }

    /**
     * Define el valor de la propiedad deudaPrestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeudaPrestamo(BigDecimal value) {
        this.deudaPrestamo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPagado() {
        return valorPagado;
    }

    /**
     * Define el valor de la propiedad valorPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPagado(BigDecimal value) {
        this.valorPagado = value;
    }

}
