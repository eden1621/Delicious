package com.pluralsight.models;
import java.util.ArrayList;

public class Sandwich {
    // store bread type (white, wheat, rye, wrap)
    private String breadType;

    // store sandwich size (4, 8, or 12 inches)
    private int size;

    // store if sandwich is toasted
    private boolean isToasted;

    // store meats, cheeses, toppings, sauces
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private ArrayList<String> toppings;
    private ArrayList<String> sauces;


 
    // keep track of total price
    private double totalPrice;

    public Sandwich() {}

    // constructor: takes bread type, size, toasted
    //   - initialize properties
    //   - set base price based on size
    public Sandwich(String breadType, int size, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.isToasted = isToasted;

        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();

        // set base price based on sandwich size
        if (size == 4) {
            totalPrice = 4.00;
        } else if (size == 8) {
            totalPrice = 6.00;
        } else if (size == 12) {
            totalPrice = 8.00;
        } else {
            totalPrice = 0.00; // unknown size
        }
    }

    // addMeat method:
    //   - add meat(s)
    //   - price increases based on size and whether it's extra
    public void addMeat(String meat, boolean isExtra) {
        meats.add(meat);
        if (isExtra) {
            // extra meat costs more depending on size
            if (size == 4) {
                totalPrice += 1.00;
            } else if (size == 8) {
                totalPrice += 1.50;
            } else if (size == 12) {
                totalPrice += 2.00;
            }
        }
    }

    // addCheese method:
    //   - add cheese(s)
    //   - price depends on size and whether it's extra
    public void addCheese(String cheese, boolean isExtra) {
        cheeses.add(cheese);
        if (isExtra) {
            if (size == 4) {
                totalPrice += 0.50;
            } else if (size == 8) {
                totalPrice += 1.00;
            } else if (size == 12) {
                totalPrice += 1.50;
            }
        }
    }

    // addTopping method:
    //   - add topping(s)
    //   - no extra charge
    public void addTopping(String topping) {
        toppings.add(topping);
    }

    // addSauce method:
    //   - add sauce(s)
    //   - no extra charge
    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    // getPrice method:
    //   - return current total price
    public double getPrice() {
        return totalPrice;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public ArrayList<String> getSauces() {
        return sauces;
    }

    public void setSauces(ArrayList<String> sauces) {
        this.sauces = sauces;
    }

    // getSummary method:
    //   - return a string with all sandwich details and price
    public String getSummary() {
        return "Sandwich Summary:\n" +
                "Bread: " + breadType + "\n" +
                "Size: " + size + " inches\n" +
                "Toasted: " + (isToasted ? "Yes" : "No") + "\n" +
                "Meats: " + meats + "\n" +
                "Cheeses: " + cheeses + "\n" +
                "Toppings: " + toppings + "\n" +
                "Sauces: " + sauces + "\n" +
                String.format("Total Price: $%.2f", totalPrice);
    }
}

