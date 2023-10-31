package java11Assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Java11_05 {
	public static void main(String[] args) {
		ArrayList<Double> prices = new ArrayList<>();

        while (true) {
            System.out.println("Select your option \n1: Insert New Price \n2: View Purchase Total \n3: Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insertPrice(prices);
                    break;
                case 2:
                    viewTotal(prices);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
		
        }
	
	
	}
	
	public static void insertPrice(ArrayList<Double> prices) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert price: ");
            double price = scanner.nextDouble();
            prices.add(price);

            try (PrintWriter writer = new PrintWriter(new File("prices.txt"))) {
                for (Double p : prices) {
                    writer.println(p);
                }
                System.out.println("Price has been saved to the file");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } catch (Exception e) {
        	
        	System.out.println("Invalid input. Please enter a valid price.");
        }
    }

    public static void viewTotal(ArrayList<Double> prices) {
        double total = 0.0;
        for (Double price : prices) {
            total += price;
        }
        System.out.println("Total Price of all items is: " + total);
    }
 }




