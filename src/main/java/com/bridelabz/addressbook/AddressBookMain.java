package com.bridelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook obj = new AddressBook();
        obj.addDetails();
        System.out.println("----------------------------------------------------------------"
                + "-------------------------------------------------------------------");
        String ch;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter choice \n 1.Add Contact \n 2.Edit Contact");
            int choice;
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    obj.addDetails();
                    break;
                case 2:
                    obj.editContact();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("Do you want to add more contact (Press y to contune)");
            ch = scan.next();
        } while (ch.equals("y") || ch.equals("Y"));
    }
}