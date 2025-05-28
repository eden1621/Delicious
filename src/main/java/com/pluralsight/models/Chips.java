package com.pluralsight.models;

import com.pluralsight.ui.OrderScreen;

public class Chips extends OrderScreen {
    private String name
    private double price = 1.50;
    public Chips(String name) {
        this.name = name;
    }
     @Override
    public String getDescription() {return name + "Chips";}
    @Override
    public double getPrice(){ return price;

    }
}
