package com.engeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Print "Write a message: "
        System.out.println("What is the main character called? ");


        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String name = scanner.nextLine();

        System.out.println("What is their job? ");
        String job = scanner.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time there was " + name + ", who was a " + job + ". \n" +
                "On the way to work, " + name + " reflected on life.\n" +
                "Perhaps Ada will not be a Data scientist forever.\n" +
                "\n ");

    }
}
