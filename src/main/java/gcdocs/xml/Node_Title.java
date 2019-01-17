package gcdocs.xml;

import javax.xml.bind.annotation.*;

/**
 * @author: JackDarth
 * This class represent the title in node.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Title {

    @XmlAttribute
    String language;
    @XmlValue
    String value;

    public Node_Title(){

    }

    public Node_Title(String language){
        this.language = language;
    }

    public Node_Title(String language, String value){
        this.language = language;
        this.value = value;
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
