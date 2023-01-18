package com.bridelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        // ArrayList al1 = new ArrayList();
        AddressBook obj = new AddressBook();
        obj.addDetails();
        System.out.println("----------------------------------------------------------------"
                + "-------------------------------------------------------------------");

        String ch;
        do {
            Scanner scan = new Scanner(System.in);

            // obj.addElement();

            System.out.println("Enter choice \n 1.Add Contact \n 2.Edit Contact \n 3.Delete contact");
            int choice;
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    obj.addDetails();
                    break;
                case 2:
                    obj.editContact();
                    break;
                case 3:
                    obj.deleteContact();
                    break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("Do You Want Add More Contact (PRESS y to contune)");
            ch = scan.next();
        } while (ch.equals("y") || ch.equals("Y"));
    }
}