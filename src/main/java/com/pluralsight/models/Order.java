package com.pluralsight.models;

import java.util.ArrayList;

public class Order {
    // create List for order items (sandwiches, drinks, and chips)
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<String> drinks;
    private ArrayList<String> chips;

    // store total price
    private double totalPrice;

    // constructor:
    //   - initialize the class properties
    public Order() {
        sandwiches = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
        totalPrice = 0.0;
    }

    // addSandwich method:
    //   - add sandwich to list
    //   - add sandwich price to total
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
        totalPrice += sandwich.getPrice();
    }

    // addDrink method:
    //   - add drink to list
    //   - assume each drink costs $1.50
    public void addDrink(String drink) {
        drinks.add(drink);
        totalPrice += 1.50;
    }

    // addChips method:
    //   - add chips to list
    //   - assume each chips bag costs $1.00
    public void addChips(String chip) {
        chips.add(chip);
        totalPrice += 1.00;
    }

    // getTotal method:
    //   - return total price of order
    public double getTotal() {
        return totalPrice;
    }

    // getSandwiches:
    //   - return list of sandwiches
    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }

    // getDrinks:
    //   - return list of drinks
    public ArrayList<String> getDrinks() {
        return drinks;
    }

    public void setChips(ArrayList<String> chips) {
        this.chips = chips;
    }

    // getChips:
    //   - return list of chips
    public ArrayList<String> getChips() {
        return chips;
    }

    //summary of the order with all items and the total cost
    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder(); // A tool to build the summary text
        summary.append("===== Your Order Summary =====\n");

        // Add sandwiches to the summary
        summary.append("Sandwiches:\n");
        for (Sandwich sandwich : sandwiches) {
            summary.append(sandwich.getSummary()); // Add info about each sandwich
            summary.append("\n\n"); // Extra line
        }

        // Add drinks to the summary
        summary.append("Drinks: ").append(drinks).append("\n");

        // Add chips to the summary
        summary.append("Chips: ").append(chips).append("\n");

        // Add total price
        summary.append(String.format("Total Price: $%.2f\n", totalPrice));

        return summary.toString(); // Give back the full summary as a string
    }

}
