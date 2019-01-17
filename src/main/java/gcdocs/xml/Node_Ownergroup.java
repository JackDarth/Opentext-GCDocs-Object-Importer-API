package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author: JackDarth
 * This class represent the owner group or permission in node.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Ownergroup {

    @XmlValue
    private String value;

    public Node_Ownergroup(){

    }

    public Node_Ownergroup(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
