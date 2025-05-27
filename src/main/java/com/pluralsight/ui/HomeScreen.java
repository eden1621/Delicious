package com.pluralsight.ui;

import java.util.Scanner;

public class HomeScreen {

    public void runHomeScreen() {

       while (true) {
           System.out.println("1) New Order");
           System.out.println("0) Exit");
           Scanner scanner = new Scanner(System.in);
           int choice = scanner.nextInt();
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
                   System.out.println("try again");
           }
       }


    }

}
