
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de SQLException complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SQLException"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sQLState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SQLException", propOrder = {
    "errorCode",
    "sqlState",
    "message"
})
public class SQLException {

    protected Integer errorCode;
    @XmlElement(name = "sQLState")
    protected String sqlState;
    protected String message;

    /**
     * Obt�m o valor da propriedade errorCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Define o valor da propriedade errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Obt�m o valor da propriedade sqlState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQLState() {
        return sqlState;
    }

    /**
     * Define o valor da propriedade sqlState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQLState(String value) {
        this.sqlState = value;
    }

    /**
     * Obt�m o valor da propriedade message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define o valor da propriedade message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
