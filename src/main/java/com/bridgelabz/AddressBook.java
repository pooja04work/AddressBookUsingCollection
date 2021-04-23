package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    List<ContactPerson> list = new ArrayList();
    AddressBookManager addressBookManager = new AddressBookManager();

    public void createAddressbook() {
        addressBookManager.CreateAddressbook();
    }
    public void getContacts() {
        System.out.println("Available adressbooks are" + addressBookManager.addressbook.keySet());
        System.out.println("from which addressbook you want to find details?? ");
        String addressBookName = scanner.next();
        addressBookManager.getContactByAddressBook(addressBookName);
    }
    /**
     * @mathod add() add new person and their contact detail to the address book
     * @return list contain all the details of the persons newly added.
     */
    public List<ContactPerson> add() {
        System.out.println("Add new Contact to ADDRESS BOOK:--");
        System.out.println("Available adressbooks are" + addressBookManager.addressbook.keySet());

        System.out.println("Enter the AddressBook Name: ");
        String addressBookName = scanner.next();
        System.out.println("enter the number of people you want to add in addressbook: ");
        int numberOfUser = Integer.valueOf(scanner.next());

        for (int i = 0; i < numberOfUser; i++) {
            ContactPerson person = new ContactPerson();

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

            addressBookManager.addContact(addressBookName, person);
            list.add(person);
        }
        return list;
    }
    /**
     * @mathod edit() perform edit operation in existing Contact of address book.
     * return the list after editing with new edited value.
     *return the list after editing with new edited value.
     */



    public void edit() {
        System.out.println("Add new Contact to ADDRESS BOOK:--");
        System.out.println("Available adressbooks are" + addressBookManager.addressbook.keySet());
        System.out.println("Enter the AddressBook Name: ");
        String addressBookName = scanner.next();

        System.out.println("Enter your First name:");
        String fname = scanner.next();
        List list = this.list;

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            ContactPerson person = (ContactPerson) iterator.next();

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
     * @method delete() deleted a person detail from the Addressbook using Name
     * @return list after deleting
     */
    public void delete() {
        System.out.println("Enter your First name:");
        String fname = scanner.next();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ContactPerson person = (ContactPerson) iterator.next();

            if (fname.equals(person.getFirstName())) {
                list.remove(person);
            }
        }
    }

    /**
     * @method searchByCityorState search people by there city
     * @ver count no p people available in a city
     */

    public void searchByCityOrState() {
        int count =0;
        System.out.println("All the people belongs to City = kokrajhar");
        for (int index = 0; index <list.size(); index++){
            if (list.get(index).getCity().equals("kokrajhar")){
                System.out.println(list.get(index) );
                count = index;
            }
        }
        System.out.println("number of contact person is : "+ count + "where city = kokrajhar");
    }

    /**
     * @method store the first name alphabatically in assending order
     * using streamAPI
     */

    public void sortByNameAlpha(){
        System.out.println("Available adressbooks are" + addressBookManager.addressbook.keySet());
        List<ContactPerson> sortedList = list.stream()
                                        .sorted((object1, object2) -> object1.getFirstName()
                                        .compareTo(object2.getFirstName()))
                                        .collect(Collectors.toList());
        System.out.println("Sorted List(sort the first name alphabatically): " + sortedList);
    }
    public void sortByzip(){
        System.out.println("Available adressbooks are" + addressBookManager.addressbook.keySet());
        List<ContactPerson> sortedList = list.stream()
                                        .sorted(Comparator.comparingInt(ContactPerson::getZip))
                                        .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
