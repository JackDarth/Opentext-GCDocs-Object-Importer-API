package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: JackDarth
 * This class represent the roles in node.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node_Roles {

    @XmlElement
    List<Node_Roles_Type> roles = new ArrayList<Node_Roles_Type>();

    public List<Node_Roles_Type> getRoles() {
        return roles;
    }

    public void setRoles(List<Node_Roles_Type> roles) {
        this.roles = roles;
    }
}
