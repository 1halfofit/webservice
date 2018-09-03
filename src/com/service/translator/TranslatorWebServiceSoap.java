
package com.service.translator;

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
@WebService(name = "TranslatorWebServiceSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TranslatorWebServiceSoap {


    /**
     * <br /><h3>获得中文<->英文双向翻译 String()</h3><p>输入参数：中文或英文单词；返回数据：一个一维字符串数组 String(1)，String(0) 中文为[拼音][国标码 部首 笔画 笔顺]，英文为[音标]；String(1) 译文 多个条目中间用 | 隔开，英文还包括单词属性</p><br />
     * 
     * @param word
     * @return
     *     returns com.offcn.change.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getEnCnTwoWayTranslator")
    @WebResult(name = "getEnCnTwoWayTranslatorResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getEnCnTwoWayTranslator", targetNamespace = "http://WebXml.com.cn/", className = "com.offcn.change.GetEnCnTwoWayTranslator")
    @ResponseWrapper(localName = "getEnCnTwoWayTranslatorResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.offcn.change.GetEnCnTwoWayTranslatorResponse")
    public ArrayOfString getEnCnTwoWayTranslator(
            @WebParam(name = "Word", targetNamespace = "http://WebXml.com.cn/")
                    String word);

    /**
     * <br /><h3>Hello! WebXml.com.cm</h3><br /><br />
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWebXml", action = "http://WebXml.com.cn/HelloWebXml")
    @WebResult(name = "HelloWebXmlResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "HelloWebXml", targetNamespace = "http://WebXml.com.cn/", className = "com.offcn.change.HelloWebXml")
    @ResponseWrapper(localName = "HelloWebXmlResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.offcn.change.HelloWebXmlResponse")
    public String helloWebXml();

}
