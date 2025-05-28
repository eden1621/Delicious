package com.pluralsight.models;

import java.util.Scanner;

public class Topping {


    private String addSize() {
        System.out.println("Select Sandwich Size:");
        System.out.println("1. 4 inch");
        System.out.println("2. 8 inch");
        System.out.println("3. 12 inch");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("you chose the size of 4 inches. ");
                return "4";
            case "2":
                System.out.println("you chose the size of 4 inches. ");
                return "8";
            case "3":
                System.out.println("you chose the size of 4 inches. ");
                return "12";

            default:
                System.out.println("Invalid size option.");
        }
    }
}
