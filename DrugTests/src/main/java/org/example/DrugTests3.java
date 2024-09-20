package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class DrugTests3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEmployees = 30;
        int weeks = 52;

        int[] employeeCounts = new int[numEmployees];
        boolean[] selectedEmployees = new boolean[numEmployees];

        for (int week = 1; week <= weeks; week++) {
            int testedEmployee = 1 + (int) (Math.random() * numEmployees);

            if (selectedEmployees[testedEmployee - 1]) {
                // If the employee was selected last week, select a new one
                do {
                    testedEmployee = 1 + (int) (Math.random() * numEmployees);
                } while (selectedEmployees[testedEmployee - 1]);
                System.out.println("Duplicate selection avoided. New employee selected: " + testedEmployee);
            }

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
    }
}
