package gcdocs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: JackDarth
 * This class represent the node object.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Node {

    String keynum;
    @XmlElement
    String location;
    @XmlAttribute
    String type;
    @XmlAttribute
    String action;
    @XmlElement
    String mediatypename;
    @XmlElement
    String physicallocation;
    @XmlElement
    String created;
    @XmlElement
    String modified;
    @XmlElement
    String keywords;
    @XmlElement
    String fromdate;
    @XmlElement
    String todate;
    @XmlElement
    String temporaryID;
    @XmlElement
    String offsiteID;
    @XmlElement
    String RecordType;
    @XmlElement
    Node_Assign assign;
    @XmlElement
    Node_AssignBox assignBox;
    @XmlElement(name = "securityclearance")
    Node_Security_Clearance security_clearance;
    @XmlElement(name = "rmclassification")
    Node_RMClassification rmClassification;
    @XmlElement
    Node_Ownergroup ownergroup;
    @XmlElement
    String uniqueID;

    @XmlElement(name = "title")
    Collection<Node_Title> titles = new ArrayList<Node_Title>();
    @XmlElement(name = "description")
    Collection<Node_Description> descriptions = new ArrayList<Node_Description>();
    @XmlElement(name = "category")
    Collection<Node_Category> categories = new ArrayList<Node_Category>();

    public Node(){
        // contructor.
    }

    public Node(String action, String type){
        this.action=action;
        this.type=type;
    }

    public Node(String location, String type, String action, String mediatypename, String physicallocation, String created, String modified,
                String keywords, String fromdate, String todate, List<Node_Title> titles, Node_Security_Clearance security_clearance, Node_RMClassification rmClassification,
                List<Node_Description> descriptionList, List<Node_Category> categoryList){
        this.location = location;
        this.type = type;
        this.action = action;
        this.mediatypename = mediatypename;
        this.physicallocation = physicallocation;
        this.created = created;
        this.modified = modified;
        this.keywords = keywords;
        this.fromdate = fromdate;
        this.todate = todate;
        this.titles = titles;
        this.security_clearance = security_clearance;
        this.rmClassification = rmClassification;
        this.descriptions = descriptionList;
        this.categories = categoryList;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Node_AssignBox getAssignBox() {
        return assignBox;
    }

    public void setAssignBox(Node_AssignBox assignBox) {
        this.assignBox = assignBox;
    }

    public Node_Assign getAssign() {
        return assign;
    }

    public void setAssign(Node_Assign assign) {
        this.assign = assign;
    }

    public String getKeynum() {
        return keynum;
    }

    public void setKeynum(String keynum) {
        this.keynum = keynum;
    }

    public Node_Ownergroup getOwnergroup() {
        return ownergroup;
    }

    public void setOwnergroup(Node_Ownergroup ownergroup) {
        this.ownergroup = ownergroup;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMediatypename() {
        return mediatypename;
    }

    public void setMediatypename(String mediatypename) {
        this.mediatypename = mediatypename;
    }

    public String getPhysicallocation() {
        return physicallocation;
    }

    public void setPhysicallocation(String physicallocation) {
        this.physicallocation = physicallocation;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public Collection<Node_Title> getTitles() {
        return titles;
    }

    public void setTitles(Collection<Node_Title> titles) {
        this.titles = titles;
    }

    public Node_Security_Clearance getSecurity_clearance() {
        return security_clearance;
    }

    public void setSecurity_clearance(Node_Security_Clearance security_clearance) {
        this.security_clearance = security_clearance;
    }

    public Node_RMClassification getRmClassification() {
        return rmClassification;
    }

    public void setRmClassification(Node_RMClassification rmClassification) {
        this.rmClassification = rmClassification;
    }

    public Collection<Node_Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Collection<Node_Description> descriptions) {
        this.descriptions = descriptions;
    }

    public Collection<Node_Category> getCategories() {
        return categories;
    }

    public void setCategories(Collection<Node_Category> categories) {
        this.categories = categories;
    }

    public String getTemporaryID() {
        return temporaryID;
    }

    public void setTemporaryID(String temporaryID) {
        this.temporaryID = temporaryID;
    }

    public String getOffsiteID() {
        return offsiteID;
    }

    public void setOffsiteID(String offsiteID) {
        this.offsiteID = offsiteID;
    }

    public String getRecordType() {
        return RecordType;
    }

    public void setRecordType(String recordType) {
        RecordType = recordType;
    }
}
