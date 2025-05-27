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

    // getChips:
    //   - return list of chips
    public ArrayList<String> getChips() {
        return chips;
    }

    // getOrderSummary method:
    //   - return formatted string of all items and total
    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("Order Summary:\n");

        // List sandwiches
        summary.append("Sandwiches:\n");
        for (Sandwich s : sandwiches) {
            summary.append(s.getSummary()).append("\n\n");
        }

        // List drinks
        summary.append("Drinks: ").append(drinks).append("\n");

        // List chips
        summary.append("Chips: ").append(chips).append("\n");

        // Total price
        summary.append(String.format("Total Price: $%.2f", totalPrice));

        return summary.toString();
    }
}
