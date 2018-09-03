
package com.service.myweb;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Server", targetNamespace = "http://bo.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Server {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getValue", targetNamespace = "http://bo.com/", className = "com.service.myweb.GetValue")
    @ResponseWrapper(localName = "getValueResponse", targetNamespace = "http://bo.com/", className = "com.service.myweb.GetValueResponse")
    @Action(input = "http://bo.com/Server/getValueRequest", output = "http://bo.com/Server/getValueResponse")
    public String getValue(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

}
