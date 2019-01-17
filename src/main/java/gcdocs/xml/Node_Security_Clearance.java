package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author: JackDarth
 * This class represent the security clearance in node.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Security_Clearance {

    @XmlElement
    private Node_Security_level securitylevel;

    public Node_Security_level getSecuritylevel() {
        return securitylevel;
    }

    public void setSecuritylevel(Node_Security_level securitylevel) {
        this.securitylevel = securitylevel;
    }
}
