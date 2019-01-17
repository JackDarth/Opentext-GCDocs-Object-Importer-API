package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author: JackDarth
 * This class represent the type use in rules.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Roles_Type {

    public Node_Roles_Type(String type, String value){
        this.type = type;
        this.value = value;
    }

    @XmlAttribute
    private String type;
    @XmlValue
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
