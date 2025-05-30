package com.pluralsight.ui;

import java.util.Scanner;
//Home screen
public class HomeScreen {
//run until the customer exit
    public void runHomeScreen() {

       while (true) {//Keep looping forever until user picks 0 to exit
           System.out.println("1) New Order");
           System.out.println("0) Exit");
           Scanner scanner = new Scanner(System.in);//Get input from the user
           int choice = scanner.nextInt();//what customer choose
           switch (choice) {
               case 1: {
                   System.out.println("Choose your order ");
                   OrderScreen orderScreen = new OrderScreen();
                   orderScreen.order();
                   break;
               }
               case 0: {
                   System.out.print("Goodbye");
                   return;
               }
               default:
                   System.out.println("try again"); // error if they type something else
           }
       }


    }

}
