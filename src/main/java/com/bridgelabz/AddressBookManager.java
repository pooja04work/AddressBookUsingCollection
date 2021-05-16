package com.bridgelabz;

import java.util.*;

public class AddressBookManager {
    FileIOService fileIOService = new FileIOService();
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

    public List<ContactPerson> getContactByAddressBook (String addressBookName){
        List contacts = addressbook.get(addressBookName);
        contacts.forEach(contact->System.out.println(contact));
        return contacts;
    }
    public  ContactPerson searchPerson(String addressBookName, String firstName){
        List<ContactPerson> contactByAddressBook = getContactByAddressBook(addressBookName);
        if (contactByAddressBook.size() == 0){
            return null;
        }
        Optional<ContactPerson> person1 = contactByAddressBook.stream().filter(person -> person.getFirstName().equals(firstName)).findAny();
        if (person1.isEmpty()){
            return null;
        }
        return person1.get();
    }

    public void writeDataInFile(){
        addressbook.forEach((addressBookName,contact)-> fileIOService.writeData(addressBookName, contact));
    }
}