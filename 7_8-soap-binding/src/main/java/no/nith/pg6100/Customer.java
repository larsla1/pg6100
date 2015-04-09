package no.nith.pg6100;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
