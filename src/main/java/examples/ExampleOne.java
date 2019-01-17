package examples;

import gcdocs.xml.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExampleOne {

    public static void main(String[] args) throws IOException, JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Import.class);
        Import importXml = new Import();
        ArrayList<Node> nodes = new ArrayList<Node>();

        // create the first node.
        Node node1 = new Node();
        Node_Title title1 = new Node_Title();
        Node_Security_Clearance security_clearance1 = new Node_Security_Clearance();
        Node_Description node_description_EN1 = new Node_Description();
        Node_Description node_description_FR1 = new Node_Description();


        node1.setType("folder");
        node1.setAction("create");

        title1.setLanguage("en_CA");
        title1.setValue("EXAMPLE ONE 1");

        node1.setLocation("Enterprise:Test");
        node1.setMediatypename("Folder");
        node1.setPhysicallocation("HS");

        // Create Description
        List<Node_Description> descriptions1 = new ArrayList<>();
        node_description_EN1.setLanguage("en_CA");
        node_description_EN1.setValue("EXAMPLE ONE DESCRIPTION");

        node_description_FR1.setLanguage("fr_CA");
        node_description_FR1.setValue("EXAMPLE ONE DESCRIPTION");

        descriptions1.add(node_description_EN1);
        descriptions1.add(node_description_FR1);

        node1.setCreated("20010703");
        node1.setModified("20010703");

        node1.setFromdate("20010703");
        node1.setTodate("20010703");

        // Create Security Clearance
        security_clearance1.setSecuritylevel(new Node_Security_level(40));

        // Add Description and Security Clearance object into node.
        node1.setDescriptions(descriptions1);
        node1.setSecurity_clearance(security_clearance1);

        // create the second node.
        Node node2 = new Node();
        Node_Title title2 = new Node_Title();
        Node_Security_Clearance security_clearance2 = new Node_Security_Clearance();
        Node_Description node_description_EN2 = new Node_Description();
        Node_Description node_description_FR2 = new Node_Description();


        node2.setType("folder");
        node2.setAction("create");

        title2.setLanguage("en_CA");
        title2.setValue("EXAMPLE ONE 1");

        node2.setLocation("Enterprise:Test");
        node2.setMediatypename("Folder");
        node2.setPhysicallocation("HS");

        // Create Description
        List<Node_Description> descriptions2 = new ArrayList<>();
        node_description_EN2.setLanguage("en_CA");
        node_description_EN2.setValue("EXAMPLE ONE DESCRIPTION");

        node_description_FR2.setLanguage("fr_CA");
        node_description_FR2.setValue("EXAMPLE ONE DESCRIPTION");

        descriptions2.add(node_description_EN2);
        descriptions2.add(node_description_FR2);

        node2.setCreated("20010703");
        node2.setModified("20010703");

        node2.setFromdate("20010703");
        node2.setTodate("20010703");

        // Create Security Clearance
        security_clearance2.setSecuritylevel(new Node_Security_level(40));

        // Add Description and Security Clearance object into node.
        node2.setDescriptions(descriptions2);
        node2.setSecurity_clearance(security_clearance2);

        // Add the created Node to list.
        nodes.add(node1);
        nodes.add(node2);

        // Add the list of Nodes to ImportXml object.
        importXml.setNodes(nodes);

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(importXml, System.out);
    }
}
