
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsCuentas", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/C:/Users/frank/Desktop/Cliente/WsCuentas.wsdl")
public class WsCuentas
    extends Service
{

    private final static URL WSCUENTAS_WSDL_LOCATION;
    private final static WebServiceException WSCUENTAS_EXCEPTION;
    private final static QName WSCUENTAS_QNAME = new QName("http://tempuri.org/", "WsCuentas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/frank/Desktop/Cliente/WsCuentas.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCUENTAS_WSDL_LOCATION = url;
        WSCUENTAS_EXCEPTION = e;
    }

    public WsCuentas() {
        super(__getWsdlLocation(), WSCUENTAS_QNAME);
    }

    public WsCuentas(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCUENTAS_QNAME, features);
    }

    public WsCuentas(URL wsdlLocation) {
        super(wsdlLocation, WSCUENTAS_QNAME);
    }

    public WsCuentas(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCUENTAS_QNAME, features);
    }

    public WsCuentas(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsCuentas(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsCuentasSoap
     */
    @WebEndpoint(name = "WsCuentasSoap")
    public WsCuentasSoap getWsCuentasSoap() {
        return super.getPort(new QName("http://tempuri.org/", "WsCuentasSoap"), WsCuentasSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsCuentasSoap
     */
    @WebEndpoint(name = "WsCuentasSoap")
    public WsCuentasSoap getWsCuentasSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WsCuentasSoap"), WsCuentasSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCUENTAS_EXCEPTION!= null) {
            throw WSCUENTAS_EXCEPTION;
        }
        return WSCUENTAS_WSDL_LOCATION;
    }

}
