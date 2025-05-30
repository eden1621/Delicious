package com.pluralsight.models;
//

public class Chips implements Menu{
    private String type;// type of chips
    public Chips(String type) {
        this.type = type;
    }
//return the fixed price of chips
    @Override
    public double getPrice() {
        return 1.50;
    }
//Returns a string showing the chip type and its price
    @Override
    public String toString() {//inherited from object
        return type + " chips - $" + String.format("%.2f", getPrice());
    }
}