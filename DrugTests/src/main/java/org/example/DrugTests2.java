package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class DrugTests2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEmployees = 30;
        int weeks = 52;

        int[] employeeCounts = new int[numEmployees];
        boolean[] selectedEmployees = new boolean[numEmployees];

        for (int week = 1; week <= weeks; week++) {
            int testedEmployee = 1 + (int) (Math.random() * numEmployees);

            employeeCounts[testedEmployee - 1]++;
            selectedEmployees[testedEmployee - 1] = true;

            System.out.print("Week " + week + ": ");
            for (int i = 0; i < numEmployees; i++) {
                if (selectedEmployees[i]) {
                    System.out.print(i + 1 + " ");
                    selectedEmployees[i] = false;
                }
            }
            System.out.println();
        }

        System.out.println("Number of times each employee was selected:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employeeCounts[i]);
        }

        System.out.println("Employees never selected:");
        for (int i = 0; i < numEmployees; i++) {
            if (employeeCounts[i] == 0) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
