
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
@WebService(name = "WsAutenticacionSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsAutenticacionSoap {


    /**
     * 
     * @param reqAutenticacion
     * @return
     *     returns org.tempuri.UsuarioAutenticadoBE
     */
    @WebMethod(operationName = "AutenticarUsuario", action = "http://tempuri.org/AutenticarUsuario")
    @WebResult(name = "AutenticarUsuarioResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AutenticarUsuario", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AutenticarUsuario")
    @ResponseWrapper(localName = "AutenticarUsuarioResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AutenticarUsuarioResponse")
    public UsuarioAutenticadoBE autenticarUsuario(
        @WebParam(name = "reqAutenticacion", targetNamespace = "http://tempuri.org/")
        AutenticacionBE reqAutenticacion);

}
