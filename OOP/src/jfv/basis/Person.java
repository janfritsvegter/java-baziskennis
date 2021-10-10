package jfv.basis;

public class Person {
    private String firstName;
    private String lastName;
    private String streetName;
    private String bsnNumber;

    public Person(){}

    public Person(String firstName, String lastName, String streetName, String bsnNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.bsnNumber = bsnNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getBsnNumber() {
        return bsnNumber;
    }

    public String info() {
        String info = "Super info";
        return info;
    }
}
