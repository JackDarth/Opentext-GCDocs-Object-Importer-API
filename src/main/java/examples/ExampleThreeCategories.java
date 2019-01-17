package examples;

import gcdocs.xml.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;
import java.util.List;

public class ExampleThreeCategories {

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

        // Create categories
        /**
         * Category
         * You must create categories in GCDocs before import.
         */
        Node_Category category1 = new Node_Category();
        Node_Category category2 = new Node_Category();
        Node_Category_Attribute attr1_1 = new Node_Category_Attribute();
        Node_Category_Attribute attr1_2 = new Node_Category_Attribute();
        Node_Category_Attribute attr2 = new Node_Category_Attribute();

        category1.setName("category1");
        category2.setName("category2");

        attr1_1.setName("ATTR 1.1");
        attr1_2.setName("ATTR 1.2");

        attr2.setName("ATTR 2");

        attr1_1.setValue("ATTR 1.1");
        attr1_2.setValue("ATTR 1.2");

        attr2.setValue("ATTR 2");

        List category1AllAttr = new ArrayList();
        List category2AllAttr = new ArrayList();

        category1AllAttr.add(attr1_1);
        category1AllAttr.add(attr1_2);

        category2AllAttr.add(attr2);

        category1.setAttributes(category1AllAttr);
        category2.setAttributes(category2AllAttr);

        List allCategories = new ArrayList();
        allCategories.add(category1);
        allCategories.add(category2);

        node1.setCategories(allCategories);

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
