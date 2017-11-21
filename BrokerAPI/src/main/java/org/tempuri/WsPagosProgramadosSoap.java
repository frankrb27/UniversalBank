
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WsPagosProgramadosSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsPagosProgramadosSoap {


    /**
     * 
     * @param reqPago
     * @return
     *     returns org.tempuri.ArrayOfPagosProgramadosBE
     */
    @WebMethod(operationName = "ConsultarPagosProgramados", action = "http://tempuri.org/ConsultarPagosProgramados")
    @WebResult(name = "ConsultarPagosProgramadosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarPagosProgramados", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultarPagosProgramados")
    @ResponseWrapper(localName = "ConsultarPagosProgramadosResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultarPagosProgramadosResponse")
    public ArrayOfPagosProgramadosBE consultarPagosProgramados(
        @WebParam(name = "reqPago", targetNamespace = "http://tempuri.org/")
        PagosProgramadosBE reqPago);

    /**
     * 
     * @param reqPago
     * @return
     *     returns org.tempuri.RespuestaPagosProgramadosBE
     */
    @WebMethod(operationName = "RegistrarPagoProgramado", action = "http://tempuri.org/RegistrarPagoProgramado")
    @WebResult(name = "RegistrarPagoProgramadoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RegistrarPagoProgramado", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegistrarPagoProgramado")
    @ResponseWrapper(localName = "RegistrarPagoProgramadoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegistrarPagoProgramadoResponse")
    public RespuestaPagosProgramadosBE registrarPagoProgramado(
        @WebParam(name = "reqPago", targetNamespace = "http://tempuri.org/")
        PagosProgramadosBE reqPago);

    /**
     * 
     * @param reqCuenta
     * @param pagoPrestamo
     * @return
     *     returns org.tempuri.ConfirmacionTransaccionBE
     */
    @WebMethod(operationName = "PagarPrestamos", action = "http://tempuri.org/PagarPrestamos")
    @WebResult(name = "PagarPrestamosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "PagarPrestamos", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PagarPrestamos")
    @ResponseWrapper(localName = "PagarPrestamosResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PagarPrestamosResponse")
    public ConfirmacionTransaccionBE pagarPrestamos(
        @WebParam(name = "pagoPrestamo", targetNamespace = "http://tempuri.org/")
        PrestamosBE pagoPrestamo,
        @WebParam(name = "reqCuenta", targetNamespace = "http://tempuri.org/")
        CuentasBE reqCuenta);

}
