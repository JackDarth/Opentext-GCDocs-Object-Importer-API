# Opentext-GCDocs-Object-Importer-API

The **Java API** give you the ability to build and generate XML importing files for **GCDocs Object Importer**. It has Node structure in object oriented design which ease you on building the XML files. Also, this API is open source which allow any of you to contribute your new idea.

**Example One** Includes the following metadata
* title
* security clearance
* node description
* node type
* node action
* language
* location
* media type
* physical location
* create date
* modified date
* from date
* to date

```
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
```

**Example Two** Includes the following metadata
* RMClassification
* RMClassification Status

```
public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Import.class);
        Import importXml = new Import();
        ArrayList<Node> nodes = new ArrayList<Node>();

        // create the first node.
        Node node1 = new Node();
        Node_Title title1 = new Node_Title();
        Node_Security_Clearance security_clearance1 = new Node_Security_Clearance();
        Node_RMClassification rmClassification = new Node_RMClassification();
        Node_RMClassification_Status rmClassification_status = new Node_RMClassification_Status();

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

        // Create Classification
        rmClassification.setClassID(123456); // <-- Use existing Classification in GCDOCS.
        rmClassification_status.setStatus("ACTIVE"); // <-- Use existing Classification status in GCDOCS.
        rmClassification.setStatus(rmClassification_status);
        node1.setRmClassification(rmClassification);

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
```

**Example Three** Includes the following metadata
* category
* category attributes

```
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
```

**Example Four** Includes the following metadata
* owner group

```
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
```
