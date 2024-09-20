package org.example;
import java.util.Scanner;

public class TimeAndInstructors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] courses = {
                {"CIS101", "Mon 9 am", "Khan"},
                {"CIS102", "Tue 10 am", "Smith"},
                {"CIS103", "Wed 11 am", "Johnson"},
                {"CIS104", "Thu 12 pm", "Doe"},
                {"CIS105", "Fri 1 pm", "Miller"}
        };

        System.out.println("Enter a course name (e.g., CIS101):");
        String courseName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i][0].equalsIgnoreCase(courseName)) {
                System.out.println("Course: " + courses[i][0]);
                System.out.println("Time: " + courses[i][1]);
                System.out.println("Instructor: " + courses[i][2]);
                found = true;
                // Check for duplicates
                for (int j = i + 1; j < courses.length; j++) {
                    if (courses[j][0].equalsIgnoreCase(courseName)) {
                        System.out.println("Course: " + courses[j][0]);
                        System.out.println("Time: " + courses[j][1]);
                        System.out.println("Instructor: " + courses[j][2]);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }
    }
}
