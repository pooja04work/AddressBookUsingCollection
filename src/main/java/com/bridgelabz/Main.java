package com.bridgelabz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wellcome to Address Book program.");
        AddressBook storeValue = new AddressBook("john", "kennedy", "Gauhati", "Assam", "xyz14@gmail.in", 78325, 100);
        storeValue.Display();
        storeValue.add();
        storeValue.edit();
        List values = storeValue.list;
        System.out.println("List after edit: " + values);
    }
}
