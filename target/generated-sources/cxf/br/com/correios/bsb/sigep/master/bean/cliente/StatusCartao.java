
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de statusCartao.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusCartao"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Desconhecido"/&amp;gt;
 *     &amp;lt;enumeration value="Normal"/&amp;gt;
 *     &amp;lt;enumeration value="Suspenso"/&amp;gt;
 *     &amp;lt;enumeration value="Cancelado"/&amp;gt;
 *     &amp;lt;enumeration value="Irregular"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "statusCartao")
@XmlEnum
public enum StatusCartao {

    @XmlEnumValue("Desconhecido")
    DESCONHECIDO("Desconhecido"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Suspenso")
    SUSPENSO("Suspenso"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Irregular")
    IRREGULAR("Irregular");
    private final String value;

    StatusCartao(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCartao fromValue(String v) {
        for (StatusCartao c: StatusCartao.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
