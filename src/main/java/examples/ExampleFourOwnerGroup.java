package examples;

import gcdocs.xml.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;

public class ExampleFourOwnerGroup {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Import.class);
        Import importXml = new Import();
        ArrayList<Node> nodes = new ArrayList<Node>();

        // create the first node.
        Node node1 = new Node();
        Node_Title title1 = new Node_Title();
        Node_Security_Clearance security_clearance1 = new Node_Security_Clearance();

        node1.setType("folder");
        node1.setAction("create");

        title1.setLanguage("en_CA");
        title1.setValue("EXAMPLE TWO RM CLASSIFICATION");

        node1.setLocation("Enterprise:Test");
        node1.setMediatypename("Folder");
        node1.setPhysicallocation("HS");

        node1.setCreated("20010703");
        node1.setModified("20010703");

        node1.setFromdate("20010703");
        node1.setTodate("20010703");

        // Set Owner Group <-- Used existing group in GCDOCS.
        Node_Ownergroup group = new Node_Ownergroup();
        group.setValue("Default Group");
        node1.setOwnergroup(group);

        // Create Security Clearance
        security_clearance1.setSecuritylevel(new Node_Security_level(40));

        // Add Security Clearance object into node.
        node1.setSecurity_clearance(security_clearance1);

        // Add the created Node to list.
        nodes.add(node1);

        // Add the list of Nodes to ImportXml object.
        importXml.setNodes(nodes);

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(importXml, System.out);
    }
}
