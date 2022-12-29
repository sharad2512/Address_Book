package com.bridelabz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
    }
}
