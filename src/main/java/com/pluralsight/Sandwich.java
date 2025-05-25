package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

    private List<Sandwich> sandwiches = new ArrayList<>();

    // Starts the process of taking an order from the user
    public void takeOrder(Scanner scanner) {
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n-- Order Menu --");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    Sandwich sandwich = Sandwich.createSandwich(scanner);
                    sandwiches.add(sandwich);
                    System.out.println("Sandwich added to your order.");
                    break;

                case "2":
                    showOrder();
                    ordering = false; // Exit loop after showing order
                    break;

                case "0":
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
            System.out.println("Your order is empty.");
            return;
        }

        double total = 0;
        System.out.println("\nYour Order:");

        for (Sandwich sandwich : sandwiches) {
            sandwich.printDetails();
            total += sandwich.calculatePrice();
        }

        System.out.printf("Total: $%.2f\n", total);
    }
}
