
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de statusPlp.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusPlp"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Aberta"/&amp;gt;
 *     &amp;lt;enumeration value="Fechada"/&amp;gt;
 *     &amp;lt;enumeration value="Postada"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "statusPlp")
@XmlEnum
public enum StatusPlp {

    @XmlEnumValue("Aberta")
    ABERTA("Aberta"),
    @XmlEnumValue("Fechada")
    FECHADA("Fechada"),
    @XmlEnumValue("Postada")
    POSTADA("Postada");
    private final String value;

    StatusPlp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusPlp fromValue(String v) {
        for (StatusPlp c: StatusPlp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
