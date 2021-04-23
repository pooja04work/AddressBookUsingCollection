package com.bridgelabz;

public class ContactPerson {
    String firstName;
    String lastName;
    String city;
    String state;
    String email;
    int zip;
    int phoneNo;


    public ContactPerson(String firstName, String lastName, String city, String state, String email, int zip, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }

    public ContactPerson() {

    }

    /**
     * @mathod display() display the deails of the person we manually added
     */
    public void Display() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Zip: " + this.zip);
        System.out.println("Phone Number: " + this.phoneNo);
        System.out.println("EmailId: " + this.email);
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public int getZip() {
        return zip;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
                + ", email=" + email + ", zip=" + zip + ", phoneNo=" + phoneNo + "]";
    }
}
