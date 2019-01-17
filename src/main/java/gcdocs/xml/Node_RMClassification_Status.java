package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author: JackDarth
 * This class represent the status use in classification.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_RMClassification_Status {

    @XmlValue
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
