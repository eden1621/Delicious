package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//The order class handles creating and managing a customer sandwich order
//IT allow users to add sandwiches , review the order and check out or cancel

public class Order {
// A list to store all sandwich added to the order

    private List<Sandwich> sandwiches = new ArrayList<>();

    // Starts the process of taking an order from the user
    // This method starts the ordering process by displaying a simple menu.

    public void takeOrder(Scanner scanner) {//to receive user input from the console
        boolean ordering = true; //

        while (ordering) {
            //show the order menu option

            System.out.println("\n-- Order Menu --");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();
            // It will help user to read the input

            switch (input) {
                case "1":
                    // Add a new sandwich to the order

                    Sandwich sandwich = Sandwich.createSandwich(scanner);
                    sandwiches.add(sandwich);
                    System.out.println("Sandwich added to your order.");
                    break;

                case "2":
                    // Show order summary and end the ordering process

                    showOrder();
                    ordering = false; // Exit loop after showing order
                    break;

                case "0":
                    // Cancel the order and clear all sandwiches from the list

                    System.out.println("Order canceled.");
                    sandwiches.clear(); // Optional: clear list when canceled
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid input. Please enter 1, 2, or 0.");
                    break;
            }
        }
    }

    // Displays the details of the order and the total price
    public void showOrder() {
        if (sandwiches.isEmpty()) {
            //let the user know if the order is empty
            System.out.println("Your order is empty.");
            return;
        }

        double total = 0.0;
        System.out.println("\nYour Order:");
        // Loop through each sandwich, print its details and add up the price

        for (Sandwich sandwich : sandwiches) {
            sandwich.printDetails(); // Show what the sandwich contains
            total += sandwich.calculatePrice();// Show what the sandwich contains
        }

        System.out.printf("Total: $%.2f\n", total);
    }
}

