package com.pluralsight.models;

import java.util.List;

public class Sandwich implements Menu{
    private int size;
    private String bread;
    private List<Topping> meats;
    private List<Topping> cheeses;
    private List<Topping> regularToppings;
    private List<Topping> sauces;
    private boolean toasted;

    public Sandwich(boolean toasted, int size, String bread, List<Topping> meats, List<Topping> cheeses, List<Topping> regularToppings, List<Topping> sauces) {
        this.toasted = toasted;
        this.size = size;
        this.bread = bread;
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
    }

    @Override
    public double getPrice() {
        double basePrice = getBasePrice();
        double meatPrice = getMeatPrice();
        double cheesePrice = getCheesePrice();
        return basePrice + meatPrice + cheesePrice;
    }

    private double getMeatPrice() {
        double price  = 0.0;
        for (Topping meat: meats) {
            if (meat.isExtra()) {
                price += switch (size) {
                    case 4 -> 0.50;
                    case 8 -> 1.00;
                    case 12 -> 1.50;
                    default -> 0.0;
                };
            } else {
               price += switch (size) {
                    case 4 -> 1.00;
                    case 8 -> 2.00;
                    case 12 -> 3.00;
                    default -> 0.0;
                };
            }
        }
        return price;
    }

    private double getCheesePrice() {
        double price  = 0.0;
        for (Topping cheese: cheeses) {
            if (cheese.isExtra()) {
                price += switch (size) {
                    case 4 -> 0.75;
                    case 8 -> 1.50;
                    case 12 -> 2.25;
                    default -> 0.0;
                };
            } else {
                price += switch (size) {
                    case 4 -> 0.30;
                    case 8 -> 0.60;
                    case 12 -> 0.90;
                    default -> 0.0;
                };
            }
        }
        return price;
    }

    private double getBasePrice() {
        return switch (size) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0.0;
        };
    }

    public void addMeat(Topping meat) {
        meats.add(meat);
    }

    public void addCheese(Topping cheese) {
        cheeses.add(cheese);
    }

    public void addRegularTopping(Topping topping) {
        regularToppings.add(topping);
    }

    public void addSauce(Topping sauce) {
        sauces.add(sauce);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public List<Topping> getMeats() {
        return meats;
    }

    public void setMeats(List<Topping> meats) {
        this.meats = meats;
    }

    public List<Topping> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<Topping> cheeses) {
        this.cheeses = cheeses;
    }

    public List<Topping> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<Topping> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public List<Topping> getSauces() {
        return sauces;
    }

    public void setSauces(List<Topping> sauces) {
        this.sauces = sauces;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }



    @Override
    public String toString() {
        return size + "\" " + bread + " sandwich" +
                (toasted ? " (toasted)" : "") +
                "\nMeats: " + meats +
                "\nCheeses: " + cheeses +
                "\nToppings: " + regularToppings +
                "\nSauces: " + sauces +
                "\nPrice: $" + String.format("%.2f", getPrice());
    }
}