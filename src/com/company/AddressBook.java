package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Entry> entries = new ArrayList<>();


    // Address Book Constructor
    public AddressBook() {
    }


    // Address Book Methods
    public void addEntry(Scanner userInput) {
        Entry entry = new Entry();
        System.out.println("Enter first name: ");
        entry.setFirstName(userInput.nextLine());
        System.out.println("Enter last name: ");
        entry.setLastName(userInput.nextLine());
        System.out.println("Enter phone number: ");
        String phoneString = userInput.nextLine();
        if(phoneString.length() > 6 && phoneString.length() < 11) {
            entry.setPhoneNumber(phoneString);
        } else {
            System.out.println("Not a valid phone number");
            return;
        }
        System.out.println("Enter email: ");
        String emailString = userInput.nextLine();
        if(entries.isEmpty()) {
            entry.setEmail(emailString);
        } else {
            int j = 0;
            for (int i = 0; i < entries.size(); i++) {
                String existingEmail = entries.get(i).getEmail();
                if (existingEmail.equalsIgnoreCase(emailString)) {
                    j = j + 1;
                }
            }
            if(j > 0) {
                System.out.println("Email already exists");
                return;
            } else {
                entry.setEmail(emailString);
            }
        }
        entries.add(entry);
    }


    public void removeEntry(Scanner userInput) {
        String emailSearch = userInput.nextLine();
        if (entries.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            int i = 0;
            for (Entry entry : entries) {
                if (entry.getEmail() != null && entry.getEmail().contains(emailSearch)) {
                    System.out.println("****************************");
                    System.out.println("Removed the following Entry");
                    System.out.println("First Name: " + entry.getFirstName());
                    System.out.println("Last Name: " + entry.getLastName());
                    System.out.println("Phone Number: " + entry.getPhoneNumber());
                    System.out.println("Email: " + entry.getEmail());
                    System.out.println("****************************");
                    entries.remove(entry);
                } else {
                    i = i + 1;
                }
            }
            if (i == entries.size()) {
                System.out.println("Entry not found");
            }
        }
    }

    public void searchFirstName(Scanner userInput) {
        String firstNameSearch = userInput.nextLine();
        for (Entry entry : entries) {
            if (entry.getFirstName() != null && entry.getFirstName().contains(firstNameSearch)) {
                System.out.println("****************************");
                System.out.println("First Name: " + entry.getFirstName());
                System.out.println("Last Name: " + entry.getLastName());
                System.out.println("Phone Number: " + entry.getPhoneNumber());
                System.out.println("Email: " + entry.getEmail());
                System.out.println("****************************");
            }
        }
    }



    public void searchLastName(Scanner userInput) {
        String lastNameSearch = userInput.nextLine();
        for (Entry entry : entries) {
            if (entry.getLastName() != null && entry.getLastName().contains(lastNameSearch)) {
                System.out.println("****************************");
                System.out.println("First Name: " + entry.getFirstName());
                System.out.println("Last Name: " + entry.getLastName());
                System.out.println("Phone Number: " + entry.getPhoneNumber());
                System.out.println("Email: " + entry.getEmail());
                System.out.println("****************************");
            }
        }
    }

    public void searchPhoneNumber(Scanner userInput) {
        String phoneSearch = userInput.nextLine();
        for (Entry entry : entries) {
            if (entry.getPhoneNumber() != null && entry.getPhoneNumber().contains(phoneSearch)) {
                System.out.println("****************************");
                System.out.println("First Name: " + entry.getFirstName());
                System.out.println("Last Name: " + entry.getLastName());
                System.out.println("Phone Number: " + entry.getPhoneNumber());
                System.out.println("Email: " + entry.getEmail());
                System.out.println("****************************");
            }
        }
    }

    public void searchEmail(Scanner userInput) {
        String emailSearch = userInput.nextLine();
        for (Entry entry : entries) {
            if (entry.getEmail() != null && entry.getEmail().contains(emailSearch)) {
                System.out.println("****************************");
                System.out.println("First Name: " + entry.getFirstName());
                System.out.println("Last Name: " + entry.getLastName());
                System.out.println("Phone Number: " + entry.getPhoneNumber());
                System.out.println("Email: " + entry.getEmail());
                System.out.println("****************************");
            }
        }
    }

    public void printBook() {
        if(entries.isEmpty()) {
            System.out.println("Address book is empty");
        }
        for(int i = 0; i < entries.size(); i++) {
            System.out.println("****************************");
            System.out.println("First Name: " + entries.get(i).getFirstName());
            System.out.println("Last Name: " + entries.get(i).getLastName());
            System.out.println("Phone Number: " + entries.get(i).getPhoneNumber());
            System.out.println("Email: " + entries.get(i).getEmail());
            System.out.println("****************************");
        }
    }

    public void clearBook() {
        entries.clear();
        System.out.println("Address book has been cleared");
    }


}
