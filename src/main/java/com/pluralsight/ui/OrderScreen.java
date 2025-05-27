package com.pluralsight.ui;

import com.pluralsight.models.Sandwich;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderScreen {
    private Sandwich sandwich;

    public OrderScreen() {
        this.sandwich = new Sandwich();
        this.sandwich.setToppings(new ArrayList<>());
        this.sandwich.setSauces(new ArrayList<>());
    }

    public void order() {

        while (true) {
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Please Choice Sandwich");
                    addSandwich();
                    break;
                }
                case 2: {
                    System.out.println("Please Choice dink");
                    //
                    break;
                }
                case 3: {
                    System.out.println("Please add Chips");
                    //
                    break;
                }
                case 4: {
                    System.out.println("Thank You for coming");
                    //
                    break;
                }
                case 0: {
                    System.out.println("Would like to cancel your order ");
                    //
                    break;
                }
                default:
                    System.out.println("try again");
            }
        }
    }

    public void addSandwich() {
        while (true) {
            System.out.println("1. Bread Type");
            System.out.println("2. Size");
            System.out.println("3. Toppings");
            System.out.println("4. Toasted");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Add Bread Type");
                    addBreadType();
                    break;
                }
                case 2: {
                    System.out.println("Add Size");
                    break;
                }
                case 3: {
                    System.out.println("Add Toppings");
                    addRegularToppings();
                    break;
                }
                case 4: {
                    System.out.println("Toasted");
                    break;
                }
            }
        }
    }

    public void addBreadType() {

            System.out.println("1. White bread");
            System.out.println("2. Wheat");
            System.out.println("3. rye");
            System.out.println("4. Wrap");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    sandwich.setBreadType("White");
                    System.out.println("You Added white Bread");

                    break;
                }
                case 2: {
                    sandwich.setBreadType("Wheat");
                    System.out.println("You Added Wheat Bread");

                    break;
                }
                case 3: {
                    sandwich.setBreadType("rye");
                    System.out.println("You Added rye");

                    break;
                }
                case 4: {
                    sandwich.setBreadType("wrap");
                    System.out.println("You Added Wrap");

                    break;

                }
            }
        }



        public void addRegularToppings() {
            while (true) {
                System.out.println("Add from the following Toppings");
                System.out.println("1. lettuce");
                System.out.println("2. peppers");

                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: {
                        sandwich.getToppings().add("lettuce");
                        System.out.println("lettuce added to topping");
                        break;
                    }

                    case 2: {
                        sandwich.getToppings().add("peppers");
                        System.out.println("peppers added to topping");
                        break;
                    }
                }
            }
        }
    }



