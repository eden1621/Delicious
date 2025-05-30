package com.pluralsight;
import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    public void saveReceipt(Order order) {
        String path = "src/main/resources/receipts/";
        File directory = new File(path);
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
        System.out.println(receipt);
        return receipt;
    }

    private static String generateTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return now.format(formatter);
    }
}
