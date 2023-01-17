package com.bridelabz.addressbook;

import java.util.*;

public class AddressBook extends Contact{
    ArrayList<Contact> al1 = new ArrayList();

    Scanner scan = new Scanner(System.in);

    public Contact addDetails() {
        Contact contact = new Contact();

        System.out.print("Enter first name :: ");
        firstname = scan.next();
        contact.setFirstname(firstname);

        System.out.print("Please Enter The Last Name :: ");
        lastname = scan.next();
        contact.setLastname(lastname);

        System.out.print("Please Enter The Address :: ");
        address = scan.next();
        contact.setAddress(address);

        System.out.print("Please Enter The City :: ");
        city = scan.next();
        contact.setCity(city);

        System.out.print("Please Enter The State :: ");
        state = scan.next();
        contact.setState(state);

        System.out.print("Please Enter The email ID :: ");
        email = scan.next();
        contact.setEmail(email);

        System.out.print("Please Enter The Zip Code :: ");
        zipCode = scan.nextInt();
        contact.setZipCode(zipCode);

        System.out.print("Please Enter The Phone Number :: ");
        phoneNo = scan.nextLong();
        contact.setPhoneNo(phoneNo);

        // System.out.println(obj);

        al1.add(contact);
        Iterator itr = al1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        return contact;
    }

    void editContact() {
        Contact contact = null;

        System.out.println("Enter the Contact Name which you want to Edit ");
        String name = scan.next();

        Iterator<Contact> itr = al1.iterator();

        while (itr.hasNext()) {
            Contact tempContact = itr.next();
            if (name.equals(tempContact.firstname)) {
                contact = tempContact;
            }
        }
        if (contact != null) {

            System.out.println("Enter your choice what you want to edit in contact edit press"
                    + " \n 1.PhoneNo \n 2.Firstname \n 3.Lastname \n 4.Address \n 5.City \n "
                    + "6.State \n 7. Email \n 8.ZipCode ");

            int ch = scan.nextInt();
            switch (ch) {

                case 1:
                    System.out.print("Please Enter The New Phone Number :: ");
                    phoneNo = scan.nextLong();
                    contact.setPhoneNo(phoneNo);
                    break;
                case 2:
                    System.out.print("Enter first name :: ");
                    firstname = scan.next();
                    contact.setFirstname(firstname);
                    break;
                case 3:
                    System.out.print("Please Enter The Last Name :: ");
                    lastname = scan.next();
                    contact.setLastname(lastname);
                    break;
                case 4:
                    System.out.print("Please Enter The Address :: ");
                    address = scan.next();
                    contact.setAddress(address);
                    break;
                case 5:
                    System.out.print("Please Enter The City :: ");
                    city = scan.next();
                    contact.setCity(city);
                    break;
                case 6:
                    System.out.print("Please Enter The State :: ");
                    state = scan.next();
                    contact.setState(state);
                    break;
                case 7:
                    System.out.print("Please Enter The email ID :: ");
                    email = scan.next();
                    contact.setEmail(email);
                    break;
                case 8:
                    System.out.print("Please Enter The Zip Code :: ");
                    zipCode = scan.nextInt();
                    contact.setZipCode(zipCode);
                    break;
                default:
                    System.out.println("Invalid input ");
            }

            System.out.println("Addressbook after editing contact ");
            al1.forEach(person -> System.out.println(person));

        } else {
            System.out.println("Name not found ");
        }
    }
}


