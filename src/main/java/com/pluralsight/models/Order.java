package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;
//order from customer

public class Order {
    // List to store all the sandwiches ,drink and chips  in the order

    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chipsList = new ArrayList<>();
// to add sandwich
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
//to add the drink
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
//to add the chips
    public void addChips(Chips chips) {
        chipsList.add(chips);
    }
//this help to calculate the price
    public double getTotalPrice() {
        double total = 0.0;
        //add up all sandwich  prices

        for (Sandwich sandwich: sandwiches){
            total += sandwich.getPrice();
        }
        //add up all drink prices

        for (Drink drink: drinks){
            total += drink.getPrice();
        }
        // add all the chips prices
        for (Chips chips: chipsList){
            total += chips.getPrice();
        }
        return total;
    }
//shows all the iteams and total price
    public String getOrderDetails() {
        String detail ="Order Details:\n";

        for (int i = 0; i < sandwiches.size(); i++) { // adding all the details for each sandwich, drink and chips
            detail += "Sandwich " + (i +1) + ":\n";
            detail += sandwiches.get(i) + "\n";
        }
        for (int i = 0; i < drinks.size(); i++) {
            detail += "Drink " + (i+1) + ": " + drinks.get(i) + "\n";
        }
        for (int i = 0; i < chipsList.size(); i++) {
            detail += "Chips " + (i + 1) + ": " + chipsList.get(i) + "\n";
        }
        detail += "Total Price: " + getTotalPrice() + "\n";//add total price
        return detail;
    }
}