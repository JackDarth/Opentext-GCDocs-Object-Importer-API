package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author: JackDarth
 * This class represent the category.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Category {

    @XmlAttribute
    private String name;
    @XmlAttribute
    private String clear;
    @XmlElement(name = "attribute")
    private List<Node_Category_Attribute> attributes;

    public String getClear() {
        return clear;
    }

    public void setClear(String clear) {
        this.clear = clear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node_Category_Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Node_Category_Attribute> attributes) {
        this.attributes = attributes;
    }
}
