package org.example;

import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i + 1);

            System.out.println("Enter data for student #" + (i + 1));
            for (int j = 0; j < students[i].getCourses().length; j++) {
                System.out.print("Enter course ID for course #" + (j + 1) + ": ");
                String courseID = scanner.nextLine();
                System.out.print("Enter credit hours for course #" + (j + 1) + ": ");
                int creditHours = scanner.nextInt();
                System.out.print("Enter letter grade for course #" + (j + 1) + ": ");
                char letterGrade = scanner.next().toUpperCase().charAt(0);

                while (letterGrade != 'A' && letterGrade != 'B' && letterGrade != 'C' && letterGrade != 'D' && letterGrade != 'F') {
                    System.out.println("Invalid letter grade. Please enter A, B, C, D, or F.");
                    System.out.print("Enter letter grade for course #" + (j + 1) + ": ");
                    letterGrade = scanner.next().toUpperCase().charAt(0);
                }

                students[i].setCourse(j, new CollegeCourse(courseID, creditHours, letterGrade));
                scanner.nextLine(); // Consume the newline character
            }
        }
    }
}