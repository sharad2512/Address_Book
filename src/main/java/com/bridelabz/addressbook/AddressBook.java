package com.bridelabz.addressbook;

import java.util.*;

public class AddressBook extends Contact {

    Scanner scanner = new Scanner(System.in);

    public Contact createContact(ArrayList al1) {
        Contact contact = new Contact();

        System.out.print("Enter first name :: ");
        firstname = scanner.next();
        contact.setFirstname(firstname);

        System.out.print("Please Enter The Last Name :: ");
        lastname = scanner.next();
        contact.setLastname(lastname);

        System.out.print("Please Enter The Address :: ");
        address = scanner.next();
        contact.setAddress(address);

        System.out.print("Please Enter The City :: ");
        city = scanner.next();
        contact.setCity(city);

        System.out.print("Please Enter The State :: ");
        state = scanner.next();
        contact.setState(state);

        System.out.print("Please Enter The email ID :: ");
        email = scanner.next();
        contact.setEmail(email);

        System.out.print("Please Enter The Zip Code :: ");
        zipCode = scanner.nextInt();
        contact.setZipCode(zipCode);

        System.out.print("Please Enter The Phone Number :: ");
        phoneNo = scanner.nextLong();
        contact.setPhoneNo(phoneNo);

        al1.add(contact);

        return contact;
    }

    void addMultipleContacts(ArrayList al1) {
        AddressBook obj = new AddressBook();
        String ch;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("PRESS 'y' to contune)");
            System.out.println("Enter 1.to add Contact ");
            int choice;
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    obj.createContact(al1);
                    break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("PRESS 'y' to contune)");
            ch = scan.next();
        } while (ch.equals("y") || ch.equals("Y"));

        System.out.println(al1);
    }
}


