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
    @XmlElement
    private String recorddate;
    @XmlElement
    private String statusdate;

    public String getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(String recorddate) {
        this.recorddate = recorddate;
    }

    public String getStatusdate() {
        return statusdate;
    }

    public void setStatusdate(String statusdate) {
        this.statusdate = statusdate;
    }

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
