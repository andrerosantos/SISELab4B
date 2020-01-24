
package cs.peer.client;

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
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PeerService", targetNamespace = "http://server.calc.cs/", wsdlLocation = "http://146.193.7.121:8090/calcservice?wsdl")
public class PeerService
    extends Service
{

    private final static URL PEERSERVICE_WSDL_LOCATION;
    private final static WebServiceException PEERSERVICE_EXCEPTION;
    private final static QName PEERSERVICE_QNAME = new QName("http://server.calc.cs/", "PeerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://146.193.7.121:8090/calcservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PEERSERVICE_WSDL_LOCATION = url;
        PEERSERVICE_EXCEPTION = e;
    }

    public PeerService() {
        super(__getWsdlLocation(), PEERSERVICE_QNAME);
    }

    public PeerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PEERSERVICE_QNAME, features);
    }

    public PeerService(URL wsdlLocation) {
        super(wsdlLocation, PEERSERVICE_QNAME);
    }

    public PeerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PEERSERVICE_QNAME, features);
    }

    public PeerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PeerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Peer
     */
    @WebEndpoint(name = "PeerPort")
    public Peer getPeerPort() {
        return super.getPort(new QName("http://server.calc.cs/", "PeerPort"), Peer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Peer
     */
    @WebEndpoint(name = "PeerPort")
    public Peer getPeerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.calc.cs/", "PeerPort"), Peer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PEERSERVICE_EXCEPTION!= null) {
            throw PEERSERVICE_EXCEPTION;
        }
        return PEERSERVICE_WSDL_LOCATION;
    }

}