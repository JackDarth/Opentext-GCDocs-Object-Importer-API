package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author: JackDarth
 * This class represent the classification in node.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_RMClassification {

    @XmlAttribute
    private int classID;
    @XmlElement
    private Node_RMClassification_Status status;

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public Node_RMClassification_Status getStatus() {
        return status;
    }

    public void setStatus(Node_RMClassification_Status status) {
        this.status = status;
    }
}
