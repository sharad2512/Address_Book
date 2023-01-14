package com.bridelabz.addressbook;


import java.util.ArrayList;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        AddressBook addressBook = new AddressBook();
        ArrayList al1 = new ArrayList();
        AddressBook obj = new AddressBook();
        obj.createContact(al1);
        obj.addMultipleContacts(al1);

    }
}
