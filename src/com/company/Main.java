package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to your Address Book");

        AddressBook entries = new AddressBook();

        String answer;

        do{
            System.out.println("What would you like to do?");
            System.out.println("1. Add an entry\n2. Remove an entry\n3. Search for a specific entry\n4. Print contents of your address book\n5. Delete the contents of your address book\n6. Quit\n(Enter the number of the corresponding option)");

            answer = userInput.nextLine();

            if(answer.equalsIgnoreCase("1")) {
                // ADD
                entries.addEntry(userInput);
            } else if(answer.equalsIgnoreCase("2")) {
                // REMOVE
                System.out.println("Enter the email of the Entry you would like to remove");
                entries.removeEntry(userInput);
            } else if(answer.equalsIgnoreCase("3")) {
                // SEARCH
                System.out.println("Which option would you like to use to search by? (Enter the corresponding number)");
                System.out.println("1. First Name\n2. Last Name\n3. Phone Number\n4. Email");
                String option = userInput.nextLine();
                if(option.equalsIgnoreCase("1")) {
                    System.out.println("Enter first name of Entry");
                    entries.searchFirstName(userInput);
                } else if(option.equalsIgnoreCase("2")) {
                    System.out.println("Enter last name of Entry");
                    entries.searchLastName(userInput);
                } else if(option.equalsIgnoreCase("3")) {
                    System.out.println("Enter phone number of Entry");
                    entries.searchPhoneNumber(userInput);
                } else if(option.equalsIgnoreCase("4")) {
                    System.out.println("Enter email of Entry");
                    entries.searchEmail(userInput);
                } else {
                    System.out.println("Not a valid input");
                }
            } else if(answer.equalsIgnoreCase("4")) {
                // PRINT
                entries.printBook();
            } else if(answer.equalsIgnoreCase("5")) {
                // CLEAR
                entries.clearBook();
            } else {
                // INVALID RESPONSE
                System.out.println("Not a valid option");
            }
        } while (!answer.equalsIgnoreCase("6"));

    }
}
