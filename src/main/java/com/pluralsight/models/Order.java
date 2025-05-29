package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chipsList = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chips) {
        chipsList.add(chips);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Sandwich sandwich: sandwiches){
            total += sandwich.getPrice();
        }
        for (Drink drink: drinks){
            total += drink.getPrice();
        }
        for (Chips chips: chipsList){
            total += chips.getPrice();
        }
        return total;
    }

    public String getOrderDetails() {
        String detail ="Order Details:\n";
        for (int i = 0; i < sandwiches.size(); i++) {
            detail += "Sandwich " + (i +1) + ":\n";
            detail += sandwiches.get(i) + "\n";
        }
        for (int i = 0; i < drinks.size(); i++) {
            detail += "Drink " + (i+1) + ": " + drinks.get(i) + "\n";
        }
        for (int i = 0; i < chipsList.size(); i++) {
            detail += "Chips " + (i + 1) + ": " + chipsList.get(i) + "\n";
        }
        detail += "Total Price: " + getTotalPrice() + "\n";
        return detail;
    }
}