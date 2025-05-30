package com.pluralsight.models;
// what kind of dink customer wants
public class Drink implements Menu {
    private String size; // "Small", "Medium", "Large"
    private String flavor; // What kind of flavor
// Constructor to create a new drink with size and flavor
    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    // Returns the flavor of the drink

    public String getFlavor() {
        return flavor;
    }
    // Changes the flavor of the drink

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }
    // Returns the size of the drink

    public void setSize(String size) {
        this.size = size;
    }
    // Calculates the price based on the drink's size

    public double getPrice() {
        return switch (size.toLowerCase()) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0.0;
        };
    }
    // Returns a string showing the drink's size, flavor, and price

    @Override
    public String toString() {
        return size + " " + flavor + " drink - $" + String.format("%.2f", getPrice());
    }
}