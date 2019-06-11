package gcdocs.xml.locator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: JackDarth
 * This class represent the locator object.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Locator {

    @XmlElement(name = "Facility")
    String facility;
    @XmlElement(name = "Area")
    String area;
    @XmlElement(name = "BoxLocator")
    String boxlocator;
    @XmlElement(name = "RefRate")
    String refrate;
    @XmlElement(name = "TotalSpace")
    String totalspace;
    @XmlElement(name = "FreeSpace")
    String freespace;
    @XmlElement(name = "StorLocDepth")
    String storlocdepth;
    @XmlElement(name = "StorLocHeight")
    String storlocheight;
    @XmlElement(name = "StorLocLength")
    String storloclength;
    @XmlElement(name = "LocatorType_list")
    String locatortype_list;

    public Locator (String facility,String area,String boxlocator,String refrate,String totalspace,String freespace,String storlocdepth,String storlocheight,String storloclength,String locatortype_list) {

        this.facility = facility;
        this.area = area;
        this.boxlocator = boxlocator;
        this.refrate = refrate;
        this.totalspace = totalspace;
        this.freespace = freespace;
        this.storlocdepth = storlocdepth;
        this.storlocheight = storlocheight;
        this.storloclength = storloclength;
        this.locatortype_list = locatortype_list;
    }


    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBoxlocator() {
        return boxlocator;
    }

    public void setBoxlocator(String boxlocator) {
        this.boxlocator = boxlocator;
    }

    public String getRefrate() {
        return refrate;
    }

    public void setRefrate(String refrate) {
        this.refrate = refrate;
    }

    public String getTotalspace() {
        return totalspace;
    }

    public void setTotalspace(String totalspace) {
        this.totalspace = totalspace;
    }

    public String getFreespace() {
        return freespace;
    }

    public void setFreespace(String freespace) {
        this.freespace = freespace;
    }

    public String getStorlocdepth() {
        return storlocdepth;
    }

    public void setStorlocdepth(String storlocdepth) {
        this.storlocdepth = storlocdepth;
    }

    public String getStorlocheight() {
        return storlocheight;
    }

    public void setStorlocheight(String storlocheight) {
        this.storlocheight = storlocheight;
    }

    public String getStorloclength() {
        return storloclength;
    }

    public void setStorloclength(String storloclength) {
        this.storloclength = storloclength;
    }

    public String getLocatortype_list() {
        return locatortype_list;
    }

    public void setLocatortype_list(String locatortype_list) {
        this.locatortype_list = locatortype_list;
    }
}
