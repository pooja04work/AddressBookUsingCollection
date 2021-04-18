package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    String firstName;
    String lastName;
    String city;
    String state;
    String email;
    int zip;
    int phoneNo;
    Scanner scanner = new Scanner(System.in);
    List list = new ArrayList();

    public AddressBook(String firstName, String lastName, String city, String state, String email, int zip, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }

    public AddressBook() {

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

    /**
     * @mathod add() add new person and their contact detail to the address book
     * @return list contain all the details of the persons newly added.
     */
    public void add() {
        System.out.println("Add 2 new Contact to ADDRESS BOOK:------");
        for (int i = 0; i < 2; i++) {
            AddressBook person = new AddressBook();
            System.out.println("First Name: ");
            String firstName = scanner.next();
            person.setFirstName(firstName);

            System.out.println("Last Name: ");
            String lastName = scanner.next();
            person.setLastName(lastName);

            System.out.println("City: ");
            String city = scanner.next();
            person.setCity(city);

            System.out.println("State: ");
            String state = scanner.next();
            person.setState(state);

            System.out.println("EmailID: ");
            String email = scanner.next();
            person.setEmail(email);

            System.out.println("Zip: ");
            int zip = scanner.nextInt();
            person.setZip(zip);

            System.out.println("PhoneNumber: ");
            int phoneNo = scanner.nextInt();
            person.setPhoneNo(phoneNo);

            list.add(person);
        }
        System.out.println(list);
    }
    /**
     * @mathod edit() perform edit operation in existing Contact of address book.
     * return the list after editing with new edited value.
     */
    public void edit() {
        System.out.println("Enter your First name:");
        String fname = scanner.next();
        List list = this.list;

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            AddressBook person = (AddressBook) iterator.next();

            if (fname.equals(person.getFirstName())) {

                System.out.println("Choose field you want to add:");
                System.out.println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");

                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your lastname");
                        person.lastName = scanner.next();
                        System.out.println("new lastname: " + person.lastName);
                        break;
                    case 2:
                        System.out.println("Re-Correct your Phone Number");
                        person.phoneNo = scanner.nextInt();
                        System.out.println("new PhoneNo: " + person.phoneNo);
                        break;
                    case 3:
                        System.out.println("Re-Correct your City");
                        person.city = scanner.next();
                        System.out.println("new city: " + person.city);
                        break;
                    case 4:
                        System.out.println("Re-Correct your Zip");
                        person.zip = scanner.nextInt();
                        System.out.println("new zip: " + person.zip);
                        break;
                    case 5:
                        System.out.println("Re-Correct your State");
                        person.state = scanner.next();
                        System.out.println("new state: " + person.state);
                        break;
                }

            }
        }

    }
    /**
     * @mathod delete() deleted a person detail from the Addressbook using Name
     * @return list after deleting
     */
    public void delete() {
        System.out.println("Enter your First name:");
        String fname = scanner.next();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            AddressBook person = (AddressBook) iterator.next();

            if (fname.equals(person.getFirstName())) {
                list.remove(person);
            }
        }
    }

}
