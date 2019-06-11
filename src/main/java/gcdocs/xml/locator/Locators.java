package gcdocs.xml.locator;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Collection;

@XmlRootElement
@XmlSeeAlso({Locator.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class Locators {

    /**
     * Each Locators should have one or more locator and store in Collection.
     */
    @XmlElement(name = "Locator")
    Collection<Locator> locators = new ArrayList<Locator>();

    public Collection<Locator> getLocators() {
        return locators;
    }

    public void setLocators(Collection<Locator> locators) {
        this.locators = locators;
    }
}
