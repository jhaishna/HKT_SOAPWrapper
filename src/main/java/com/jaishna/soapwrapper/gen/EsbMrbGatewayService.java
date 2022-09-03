
package com.jaishna.soapwrapper.gen;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EsbMrbGatewayService", targetNamespace = "http://services.mrb.mob.bom", wsdlLocation = "file:/C:/Users/Sunil%20Hari/IdeaProjects/SOAPWrapperAPI/src/main/resources/wsdl/wrapper.wsdl")
public class EsbMrbGatewayService
    extends Service
{

    private final static URL ESBMRBGATEWAYSERVICE_WSDL_LOCATION;
    private final static WebServiceException ESBMRBGATEWAYSERVICE_EXCEPTION;
    private final static QName ESBMRBGATEWAYSERVICE_QNAME = new QName("http://services.mrb.mob.bom", "EsbMrbGatewayService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Sunil%20Hari/IdeaProjects/SOAPWrapperAPI/src/main/resources/wsdl/wrapper.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ESBMRBGATEWAYSERVICE_WSDL_LOCATION = url;
        ESBMRBGATEWAYSERVICE_EXCEPTION = e;
    }

    public EsbMrbGatewayService() {
        super(__getWsdlLocation(), ESBMRBGATEWAYSERVICE_QNAME);
    }

    public EsbMrbGatewayService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ESBMRBGATEWAYSERVICE_QNAME, features);
    }

    public EsbMrbGatewayService(URL wsdlLocation) {
        super(wsdlLocation, ESBMRBGATEWAYSERVICE_QNAME);
    }

    public EsbMrbGatewayService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ESBMRBGATEWAYSERVICE_QNAME, features);
    }

    public EsbMrbGatewayService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EsbMrbGatewayService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EsbMrbGatewayServicePortType
     */
    @WebEndpoint(name = "EsbMrbGatewayServiceSOAP11port_http")
    public EsbMrbGatewayServicePortType getEsbMrbGatewayServiceSOAP11PortHttp() {
        return super.getPort(new QName("http://services.mrb.mob.bom", "EsbMrbGatewayServiceSOAP11port_http"), EsbMrbGatewayServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EsbMrbGatewayServicePortType
     */
    @WebEndpoint(name = "EsbMrbGatewayServiceSOAP11port_http")
    public EsbMrbGatewayServicePortType getEsbMrbGatewayServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.mrb.mob.bom", "EsbMrbGatewayServiceSOAP11port_http"), EsbMrbGatewayServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ESBMRBGATEWAYSERVICE_EXCEPTION!= null) {
            throw ESBMRBGATEWAYSERVICE_EXCEPTION;
        }
        return ESBMRBGATEWAYSERVICE_WSDL_LOCATION;
    }

}
