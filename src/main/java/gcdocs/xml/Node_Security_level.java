package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author: JackDarth
 * This class represent the security level use in security clearance.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Security_level {

    public Node_Security_level(){

    }

    public Node_Security_level(int level){
        this.value = level;
    }

    @XmlValue
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

