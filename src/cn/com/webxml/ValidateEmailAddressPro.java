
package cn.com.webxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="theEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theEmailPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "theEmail",
    "theEmailPort"
})
@XmlRootElement(name = "ValidateEmailAddressPro")
public class ValidateEmailAddressPro {

    protected String theEmail;
    protected int theEmailPort;

    /**
     * 获取theEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheEmail() {
        return theEmail;
    }

    /**
     * 设置theEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheEmail(String value) {
        this.theEmail = value;
    }

    /**
     * 获取theEmailPort属性的值。
     * 
     */
    public int getTheEmailPort() {
        return theEmailPort;
    }

    /**
     * 设置theEmailPort属性的值。
     * 
     */
    public void setTheEmailPort(int value) {
        this.theEmailPort = value;
    }

}
