package com.pluralsight.ui;
import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    // saveReceipt method: writes the order to a text file
    public static void saveReceipt(Order order) {
        // generate filename using current date/time (yyyyMMdd-HHmmss.txt)
        String filename = "src/main/resources/receipts/receipt-" + generateTimestamp() + ".txt";

        // try-with-resources to automatically close the BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            // write each sandwich's summary
            writer.write("RECEIPT\n");
            writer.write("====================\n");

            // loop through all sandwiches in the order and write them
            int sandwichNumber = 1;
            for (Sandwich sandwich : order.getSandwiches()) {
                writer.write("Sandwich #" + sandwichNumber + ":\n");
                writer.write(sandwich.getSummary() + "\n\n");
                sandwichNumber++;
            }

            // write drinks
            writer.write("Drinks: " + order.getDrinks() + "\n");

            // write chips
            writer.write("Chips: " + order.getChips() + "\n");

            // write total price
            writer.write(String.format("\nTotal: $%.2f\n", order.getTotal()));

        } catch (IOException e) {
            // handle IOException with error message
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }

    // generateTimestamp method:
    //   - create and return a string like "20250524-152045"
    private static String generateTimestamp() {
        // get current date and time
        LocalDateTime now = LocalDateTime.now();

        // format the date and time into a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

        // return the formatted string
        return now.format(formatter);
    }
}
