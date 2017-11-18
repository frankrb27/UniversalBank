
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCuentasBE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCuentasBE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CuentasBE" type="{http://tempuri.org/}CuentasBE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCuentasBE", propOrder = {
    "cuentasBE"
})
public class ArrayOfCuentasBE {

    @XmlElement(name = "CuentasBE", nillable = true)
    protected List<CuentasBE> cuentasBE;

    /**
     * Gets the value of the cuentasBE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuentasBE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuentasBE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CuentasBE }
     * 
     * 
     */
    public List<CuentasBE> getCuentasBE() {
        if (cuentasBE == null) {
            cuentasBE = new ArrayList<CuentasBE>();
        }
        return this.cuentasBE;
    }

}
