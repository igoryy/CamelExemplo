
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de tipoBloqueio.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="tipoBloqueio"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="FRAUDE_BLOQUEIO"/&amp;gt;
 *     &amp;lt;enumeration value="EXTRAVIO_VAREJO_PRE_INDENIZADO"/&amp;gt;
 *     &amp;lt;enumeration value="EXTRAVIO_VAREJO_POS_INDENIZADO"/&amp;gt;
 *     &amp;lt;enumeration value="EXTRAVIO_CORPORATIVO"/&amp;gt;
 *     &amp;lt;enumeration value="INTERNACIONAL_LDI"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "tipoBloqueio")
@XmlEnum
public enum TipoBloqueio {

    FRAUDE_BLOQUEIO,
    EXTRAVIO_VAREJO_PRE_INDENIZADO,
    EXTRAVIO_VAREJO_POS_INDENIZADO,
    EXTRAVIO_CORPORATIVO,
    INTERNACIONAL_LDI;

    public String value() {
        return name();
    }

    public static TipoBloqueio fromValue(String v) {
        return valueOf(v);
    }

}
