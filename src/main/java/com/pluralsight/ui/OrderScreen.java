package com.pluralsight.ui;

import com.pluralsight.models.Sandwich;

import java.util.ArrayList;
import java.util.Scanner;

import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;

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
                    addSize();
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
            System.out.println("0. Done");


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
                    addSize();
                    break;
                }
                case 3: {
                    System.out.println("Add Toppings");

                    break;
                }
                case 4: {
                    System.out.println("Toasted? ");
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

    public void addToppings() {
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Add from the following Toppings");
            System.out.println("1. lettuce");
            System.out.println("2. peppers");
            System.out.println("3. onions");
            System.out.println("4. tomatoes");
            System.out.println("5. jalapeños");
            System.out.println("6. cucumbers");
            System.out.println("7. pickles");
            System.out.println("8. guacamole");
            System.out.println("9. mushrooms");
            System.out.print("Your choice: ");

            String choice = scanner1.nextLine();

            switch (choice) {
                case "1": {
                    sandwich.getToppings().add("lettuce");
                    System.out.println("lettuce added to topping");
                    break;
                }

                case "2": {
                    sandwich.getToppings().add("peppers");
                    System.out.println("peppers added to topping");
                    break;
                }
                case "3": {
                    sandwich.getToppings().add("onions");
                    System.out.println("onions added to topping");
                    break;

                }
                case "4": {
                    sandwich.getToppings().add("tomatoes");
                    System.out.println("tomatoes added to topping");
                    break;
                }
                case "5": {
                    sandwich.getToppings().add("jalapeños");
                    System.out.println("jalapeños added to topping");
                    break;
                }
                case "6": {
                    sandwich.getToppings().add("cucumbers");
                    System.out.println("cucumbers added to topping");
                    break;

                }
                case "7": {
                    sandwich.getToppings().add("pickles");
                    System.out.println("pickles added to topping");
                    break;
                }
                case "8": {
                    sandwich.getToppings().add("guacamole");
                    System.out.println("guacamole added to topping");
                    break;
                }
                case "9": {
                    sandwich.getToppings().add("mushrooms");
                    System.out.println("mushrooms added to topping");
                    break;
                }
                case "0": {

                    System.out.println("Finished adding toppings.");
                    break;
                }

                default:
                    System.out.println("Invalid choice. Please try again.");
                    return;


            }
        }
    }

    private String addSize() {
        System.out.println("Select Sandwich Size:");
        System.out.println("1. 4 inch");
        System.out.println("2. 8 inch");
        System.out.println("3. 12 inch");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("you chose the size of 4 inches. ");
                return "4";
            case "2":
                System.out.println("you chose the size of 4 inches. ");
                return "8";
            case "3":
                System.out.println("you chose the size of 4 inches. ");
                return "12";

            default:
                System.out.println("Invalid size option.");
        }
    }
        public void addDrink() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n ADD DRINK");

            System.out.println("1. Small size");
            System.out.println("2. Medium size");
            System.out.println("3. Large size");
            String choice = scanner.nextLine();
            Switch (choice);
            case 1: {
                addDrink().setSize("small");
                System.out.println("You Added small drink ");
                break;

                case 2: {
                    addDrink().setSize("medium");
                    System.out.println("You Added medium drink ");
                    break;

                    case 3:
                        addDrink().setSize("large");
                        System.out.println("You Added large drink ");
                        break;


        System.out.print("Flavor: ");
        String flavor = scanner.nextLine();

        String drink = "Drink - Size: " + size + ", Flavor: " + flavor;
        System.out.println("Drink added.");




        }
}

}       public void addchips(){
        System.out.print("How many chips would you like to add? ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();;
        chips.setchoice(choice);
        System.out.println("Added " + chips.getQuantity() + " chips.");
    }


}










