package com.pluralsight;
import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    // This method saves the receipt to a text file

    public void saveReceipt(Order order) {
        //path
        String path = "src/main/resources/receipts/";
        File directory = new File(path);//Create a folder (directory) if it doesn't exi
        if (!directory.exists()){
           // directory.mkdir();
        }
        String filename = path + "receipt-" + generateTimestamp() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("RECEIPT\n" + printAndGetDetail(order));
        } catch (IOException e) {
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }

    public String printAndGetDetail(Order order){
        String receipt = "====================\n"
                + order.getOrderDetails()
                + "====================\n";
        // Show the receipt on the screen

        System.out.println(receipt);
        return receipt;
    }
// to use in the receipt file name
    private static String generateTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return now.format(formatter);
    }
}
