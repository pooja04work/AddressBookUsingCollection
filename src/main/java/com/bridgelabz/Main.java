package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wellcome to Address Book program.");
        ContactPerson storeValue = new ContactPerson("john", "kennedy", "Gauhati", "Assam", "xyz14@gmail.in", 78325, 100);
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        AddressBookManager addressBookManager = new AddressBookManager();

        storeValue.Display();

        int switchValue = 1;
        while(switchValue != 0) {
            System.out.println("Select a Option: ");
            System.out.println("1.New AddressBook\n2.add on exisiting Address Book\n"
                    + "3.get the contact detail\n4.edit contact detail\n"
                    + "5.delete contact details\n6.search contact by city\n"
                    + "\"7.sort by name.\n8.sort by zip\n9.exit" );
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addressBook.createAddressbook();
                    break;

                case 2:
                    addressBook.add();
                    break;

                case 3:
                    addressBook.getContacts();
                    break;

                case 4:
                    addressBook.edit();
                    break;

                case 5:
                    addressBook.delete();
                    break;

                case 6:
                    addressBook.searchByCityOrState();
                    break;

                case 7:
                	addressBook.sortByNameAlpha();
                	break;

                case 8:
                    addressBook.sortByzip();
                    break;
                case 9:
                    System.out.println("Thank U! visit again.");
                    switchValue = 0;
            }
        }

    }
}
