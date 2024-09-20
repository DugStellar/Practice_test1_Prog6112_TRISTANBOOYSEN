package org.example;

import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        double[] prices = {25, 22, 15, 8};

        System.out.println("Available services:");
        for (int i = 0; i < services.length; i++) {
            System.out.println(i + 1 + ". " + services[i] + " - $" + prices[i]);
        }

        System.out.print("Enter the number of the desired service: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= services.length) {
            System.out.println("You selected: " + services[choice - 1] + " - $" + prices[choice - 1]);
        } else {
            System.out.println("Error: Invalid service choice.");
        }
    }
}
