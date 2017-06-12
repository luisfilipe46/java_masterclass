package com.masterclass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone(
            "555");

    public static void main(String[] args) {
        boolean quit = false;

        printActions();

        while (!quit) {
            System.out.println("\nEnter action: (6 to show available" +
                    " actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord =
                mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newPhoneNumber = scanner.nextLine();

        if (mobilePhone.updateContact(name, newName, newPhoneNumber)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord =
                mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(name)) {
            System.out.println("Successfully updated");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord =
                mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName()
                + " phone number is " +
                existingContactRecord.getPhoneNumber());
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        Contact newContact = new Contact(name, phone);
        if (mobilePhone.insertContact(name, phone))
            System.out.println("Contact added: name = " + name +
                    ", phone = " + phone);
        else
            System.out.println("Cannot add, " + name + " already on" +
                    "list");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing contact" +
                "4 - to remove an existing contact" +
                "5 - quey if an existing contact exists" +
                "6 - to print a list of available actions."
        );
        System.out.println("Choose your action: ");
    }

}
