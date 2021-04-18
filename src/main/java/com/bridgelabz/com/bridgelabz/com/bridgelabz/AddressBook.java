package com.bridgelabz.com.bridgelabz.com.bridgelabz;

public class AddressBook {
    String firstName;
    String lastName;
    String city;
    String state;
    String email;
    int zip;
    int phoneNo;

    public AddressBook(String firstName, String lastName, String city, String state, String email, int zip, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }

    public void Display() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Zip: " + this.zip);
        System.out.println("Phone Number: " + this.phoneNo);
        System.out.println("EmailId: " + this.email);
    }
}
