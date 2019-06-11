package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * This class use to assign physical items to Box via its IDs.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Assign {

    @XmlAttribute
    private String type;
    @XmlAttribute
    private String id;
    @XmlElement(name = "id")
    private List<Node_Assign_ID> ids;

    public List<Node_Assign_ID> getIds() {
        return ids;
    }

    public void setIds(List<Node_Assign_ID> ids) {
        this.ids = ids;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
