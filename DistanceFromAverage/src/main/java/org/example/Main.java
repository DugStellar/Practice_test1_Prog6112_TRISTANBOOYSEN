package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[15];
        int count = 0;
        double sum = 0;

        System.out.println("Enter double values (enter 9999 to quit):");
        while (true) {
            double number = scanner.nextDouble();
            if (number == 9999) {
                break;
            }
            numbers[count] = number;
            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No numbers were entered.");
        } else {
            double average = sum / count;

            System.out.println("Count of numbers entered: " + count);
            System.out.println("Average of the numbers: " + average);

            System.out.println("Entered values and their distance from the average:");
            for (int i = 0; i < count; i++) {
                double distance = numbers[i] - average;
                System.out.println(numbers[i] + " - " + distance);
            }
        }
    }
}