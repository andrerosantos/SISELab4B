
package cs.peer.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Peer", targetNamespace = "http://server.calc.cs/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Peer {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "check", targetNamespace = "http://server.calc.cs/", className = "cs.peer.client.Check")
    @ResponseWrapper(localName = "checkResponse", targetNamespace = "http://server.calc.cs/", className = "cs.peer.client.CheckResponse")
    @Action(input = "http://server.calc.cs/Peer/checkRequest", output = "http://server.calc.cs/Peer/checkResponse")
    public String check();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "toPeer", targetNamespace = "http://server.calc.cs/", className = "cs.peer.client.ToPeer")
    @ResponseWrapper(localName = "toPeerResponse", targetNamespace = "http://server.calc.cs/", className = "cs.peer.client.ToPeerResponse")
    @Action(input = "http://server.calc.cs/Peer/toPeerRequest", output = "http://server.calc.cs/Peer/toPeerResponse")
    public void toPeer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
