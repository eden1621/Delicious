package com.pluralsight.ui;

import com.pluralsight.ReceiptWriter;
import com.pluralsight.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OrderScreen {
   private Order order;
   private ReceiptWriter receiptWriter;// writes the receipt for you

    public OrderScreen() {
     this.order = new Order();
     this.receiptWriter = new ReceiptWriter();
    }

    public void order() {

        while (true) {
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout"); // when user ready to pay
            System.out.println("5) View Order");//to view
            System.out.println("0) Cancel Order"); //to clear the order
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Please add Sandwich");
                    order.addSandwich(addSandwich());
                    System.out.println("Sandwich added");
                    break;
                }
                case 2: {
                    System.out.println("Please add dink");
                    order.addDrink(addDrink());
                    break;
                }
                case 3: {
                    System.out.println("Please add Chips");
                    order.addChips(addChips());
                    break;
                }
                case 4: {
                    System.out.println("Thank You for coming");
                    receiptWriter.saveReceipt(order);
                    break;
                }
                case 5: {
                    receiptWriter.printAndGetDetail(order);
                    break;
                }
                case 0: {
                    System.out.println("Ordered cancelled");
                    return;
                }
                default:
                    System.out.println("try again");
            }
        }
    }

    public Sandwich addSandwich() {
        String breadType = null;
        int size = 0;
        List<Topping> regularToppings = new ArrayList<>();
        List<Topping> meats = new ArrayList<>();
        List<Topping> cheeses = new ArrayList<>();
        List<Topping> sauces= new ArrayList<>();
        boolean isToasted = false;
        while (true) {
            System.out.println("1. Bread Type");
            System.out.println("2. Size");
            System.out.println("3. Regular Toppings");
            System.out.println("4. Meats");
            System.out.println("5. Cheeses");
            System.out.println("6. sauces");
            System.out.println("7. Extra Toppings");
            System.out.println("8. Toasted");
            System.out.println("0. Done");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Add Bread Type");
                    breadType = addBreadType();
                    break;
                }
                case 2: {
                    System.out.println("Add Size");
                    size =  addSize();
                    break;
                }
                case 3: {
                    System.out.println("Add Regular toppings");
                    regularToppings = addToppings(false);
                    break;
                }

                case 4: {
                    System.out.println("Add meats");
                    meats = addMeat();
                    break;
                }

                case 5: {
                    System.out.println("Add cheeses");
                    cheeses = addCheeses();
                    break;
                }

                case 6: {
                    System.out.println("Add sauces");
                    sauces = addSauces();
                    break;
                }
                case 7: {
                    System.out.println("Add Extra toppings");
                    regularToppings = addToppings(true);
                    break;
                }
                case 8: {
                    System.out.println("Toasted? ");
                    isToasted = addToasted();
                    break;

                }
                case 0: {
                    return new Sandwich(isToasted, size, breadType, meats, cheeses, regularToppings, sauces);
                }

            }
        }
    }

    public String addBreadType() {
        System.out.println("1. White bread");
        System.out.println("2. Wheat");
        System.out.println("3. rye");
        System.out.println("4. Wrap");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: return "white";
            case 2: return "wheat";
            case 3: return "rye";
            case 4: return "Wrap";
            default: {
                System.out.println("Invalid Brad Type");
                return null;
            }
        }
    }
//Prompts the user to add toppings to their order.
    public List<Topping> addToppings(boolean isExtra) {
        Scanner scanner1 = new Scanner(System.in);
        List<Topping> toppings = new ArrayList<>();
        while (true) {
            System.out.println("Add topping.");
            System.out.println("1. lettuce");
            System.out.println("2. peppers");
            System.out.println("3. onions");
            System.out.println("4. tomatoes");
            System.out.println("5. jalapeños");
            System.out.println("6. cucumbers");
            System.out.println("7. pickles");
            System.out.println("8. guacamole");
            System.out.println("9. mushrooms");
            System.out.println("0. Done ");//The process repeats until the user chooses "Done" by entering 0.

            int choice = scanner1.nextInt();

            switch (choice) {
                case 1:
                    toppings.add(new Topping("lettuce", false, isExtra));
                    break;
                case 2:
                    toppings.add(new Topping("peppers", false, isExtra));
                    break;
                case 3:
                    toppings.add(new Topping("onions", false, isExtra));
                    break;
                case 4:
                    toppings.add(new Topping("tomatoes", false, isExtra));
                    break;
                case 5:
                    toppings.add(new Topping("jalapeños", false, isExtra));
                    break;
                case 6:
                    toppings.add(new Topping("cucumbers", false, isExtra));
                    break;
                case 7:
                    toppings.add(new Topping("pickles", false, isExtra));
                    break;
                case 8:
                    toppings.add(new Topping("guacamole", false, isExtra));
                    break;
                case 9:
                    toppings.add(new Topping("mushrooms", false, isExtra));
                    break;
                case 0: {
                    System.out.println("Finished adding toppings.");
                    return toppings;
                }

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private List<Topping> addSauces() {
        Scanner scanner1 = new Scanner(System.in);
        List<Topping> sauces = new ArrayList<>();
        while (true) {
            System.out.println("Add sauces.");
            System.out.println("1. mayo");
            System.out.println("2. mustard");
            System.out.println("3. ketchup");
            System.out.println("4. ranch");
            System.out.println("5. thousand islands");
            System.out.println("6. vinaigrett");
            System.out.println("0. Done ");
            int choice = scanner1.nextInt();
            switch (choice) {
                case 1:
                    sauces.add(new Topping("mayo", false, false));
                    break;
                case 2:
                    sauces.add(new Topping("mustard", false, false));
                    break;
                case 3:
                    sauces.add(new Topping("ketchup", false, false));
                    break;
                case 4:
                    sauces.add(new Topping("ranch", false, false));
                    break;
                case 5:
                    sauces.add(new Topping("thousand islands", false, false));
                    break;
                case 6:
                    sauces.add(new Topping("vinaigrett ", false, false));
                    break;
                case 0: {
                    System.out.println("Finished adding sauces.");
                    return sauces;
                }
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }



    private List<Topping> addCheeses() {
                Scanner scanner1 = new Scanner(System.in);
                List<Topping> cheeses = new ArrayList<>();
                while (true) {
                    System.out.println("Add cheeses.");

                        System.out.println("1. american");
                        System.out.println("2. provolone");
                        System.out.println("3. cheddar");
                        System.out.println("4. swiss");
                        System.out.println("0. done");
                        int choice = scanner1.nextInt();

                        switch (choice) {
                            case 1:
                                cheeses.add(new Topping("american", false, false));
                                break;
                            case 2:
                                cheeses.add(new Topping("provolone", false, false));
                                break;
                            case 3:
                                cheeses.add(new Topping("cheddar", false, false));
                                break;
                            case 4:
                                cheeses.add(new Topping("swiss", false, false));
                                break;
                            case 0: {
                                System.out.println("Finished adding cheeses.");
                                return cheeses;
                            }
                            default:
                                System.out.println("Invalid choice. Please try again.");

                        }


            }
    }

    private List<Topping> addMeat() {
            Scanner scanner1 = new Scanner(System.in);
            List<Topping> meats = new ArrayList<>();
            while (true) {
                System.out.println("Add Meat.");
                System.out.println("1. steak");
                System.out.println("2. ham");
                System.out.println("3. salami");
                System.out.println("4. roast beef");
                System.out.println("5. chicken");
                System.out.println("6. bacon");
                System.out.println("0. Done ");
                int choice = scanner1.nextInt();

                switch (choice) {
                    case 1:
                        meats.add(new Topping("steak", false, false));
                        break;
                    case 2:
                        meats.add(new Topping("ham", false, false));
                        break;
                    case 3:
                        meats.add(new Topping("salami", false, false));
                        break;
                    case 4:
                        meats.add(new Topping("roast beef", false, false));
                        break;
                    case 5:
                        meats.add(new Topping("chicken", false, false));
                        break;
                    case 6:
                        meats.add(new Topping("bacon ", false, false));
                        break;
                    case 0: {
                        System.out.println("Finished adding toppings.");
                        return meats;
                    }
                    default:
                        System.out.println("Invalid choice. Please try again.");

                }


            }


        }

    private int addSize() {
        System.out.println("Select Sandwich Size:");
        System.out.println("1. 4 inch");
        System.out.println("2. 8 inch");
        System.out.println("3. 12 inch");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: return 4;
            case 2: return 8;
            case 3: return 12;
            default: {
                System.out.println("Invalid size option.");
                return 0;
            }
        }
    }

    public boolean addToasted(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want it to be toasted");
        System.out.println("1. yes");
        System.out.println("2. No");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: return true;
            case 2: return false;
        }
        return false;
    }


    public Drink addDrink() {
        String name = null;
        String size = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Select flavor");
        System.out.println("1. Fanta");
        System.out.println("2. Coke");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                name = "Fanta";
                System.out.println("You choose Fanta ");
                break;
            }
            case 2: {
                name = "Coke";
                System.out.println("You choose Coke ");
                break;
            }
            default:
                System.out.println("invalid choice");
        }

        System.out.println("\n ADD DRINK");
        System.out.println("1. Small size");
        System.out.println("2. Medium size");
        System.out.println("3. Large size");
        int sizeChoice = scanner.nextInt();
        switch (sizeChoice){
            case 1: {
                size = "small";
                System.out.println("You Added small drink ");
                break;
            }

            case 2: {
                size = "medium";
                System.out.println("You Added medium drink ");
                break;
            }

            case 3: {
                size = "large";
                System.out.println("You Added large drink ");
                break;
            }
            default:
                System.out.println("invalid choice");
        }
        return new Drink(size, name);
    }

    private Chips addChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chip type ( BBQ, Sour Cream, Plain): ");
        String type = scanner.nextLine();
        return new Chips(type);
    }


}











