package marathon.javadevelopment.introduction.javacore.inheritance.domain;

public class Address {
    private String street;
    private String zipCode;

public void print(){
    Person p = new Person();
    p.name = "Geisa";
}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}