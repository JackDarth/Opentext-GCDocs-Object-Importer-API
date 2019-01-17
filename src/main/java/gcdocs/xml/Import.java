package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author JackDarth
 * Description: This is the first tag use in XML for GCDocs Object Importer.  Import tag contains number of nodes
 * object store in List object.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Import {

    /**
     * Each Import should have one or more nodes and store in Collection.
     */
    @XmlElement(name = "node")
    Collection<Node> nodes = new ArrayList<Node>();

    /**
     * Return all nodes in Import.
     * @return
     */
    public Collection getNodes() {
        return nodes;
    }

    /**
     * Set List of nodes in Import.
     * @param nodes
     */
    public void setNodes(Collection nodes) {
        this.nodes = nodes;
    }
}
