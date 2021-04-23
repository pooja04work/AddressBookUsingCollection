package com.bridgelabz;

import java.util.*;

public class AddressBookManager {

    Map<String, LinkedList> addressbook = new HashMap<String, LinkedList>();
    Scanner scanner = new Scanner(System.in);


    public void CreateAddressbook() {
        System.out.println("Enter the name of a addressbook: " );
        String addressBookName = scanner.next();
        if (addressbook.containsKey(addressBookName))
            System.out.println("addressbook is already present");
        else
            addressbook.put(addressBookName, new LinkedList<ContactPerson>());
        System.out.println(addressbook.keySet());
    }
    public  boolean addContact(String addressBookName, ContactPerson contactPerson ) {
        if(addressbook.containsKey(addressBookName) == false){
            throw new RuntimeException("Addressbook not present");
        }
        System.out.println("Addressbook name: " + addressBookName);
        addressbook.get(addressBookName).add(contactPerson);
        System.out.println(addressbook.get(addressBookName));
        return true;
    }

    public List getContactByAddressBook (String addressBookName){
        List contacts = addressbook.get(addressBookName);
        contacts.forEach(contact->System.out.println(contact));
        return contacts;
    }
}