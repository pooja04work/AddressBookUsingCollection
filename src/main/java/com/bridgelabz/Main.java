package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wellcome to Address Book program.");
        ContactPerson storeValue = new ContactPerson("john", "kennedy", "Gauhati", "Assam", "xyz14@gmail.in", 78325, 100);
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        storeValue.Display();

        int switchValue = 1;
        while(switchValue != 0) {
            System.out.println("Select a Option: ");
            System.out.println("1. New AddressBook\n    2. add on exisiting Address Book\n  3. get the contact detail\n 4. edit contact detail\n    5. delete contact details\n 6. exit" );
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
                    System.out.println("thaks! visit again!!");
                    switchValue = 0;
            }
        }

    }
}