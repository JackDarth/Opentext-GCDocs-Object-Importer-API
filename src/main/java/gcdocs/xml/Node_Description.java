package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author: JackDarth
 * This class represent the description in node.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Description {

    @XmlAttribute
    private String language;
    @XmlValue
    private String value;

    public Node_Description(){

    }

    public Node_Description(String language){
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
