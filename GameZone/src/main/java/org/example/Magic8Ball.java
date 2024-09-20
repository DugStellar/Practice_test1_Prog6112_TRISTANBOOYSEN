package org.example;

import java.lang.Math;

public class Magic8Ball {

    // declaring the random instance, use static to "save" the value when using in main
    static int rand= (int)(Math.random() * 8);

    public static void main(String[] args) {

        // run the code in main and print out the randomly decided fortune-telling
        switch(rand) {

            case 0:
                System.out.println("Lonely, I am so lonely...");
                break;
            case 1:
                System.out.println("Expect good food~");
                break;
            case 2:
                System.out.println("Business downfall; bad work vibes");
                break;
            case 3:
                System.out.println("Luck in wealth!");
                break;
            case 4:
                System.out.println("Take extra care in health :|");
                break;
            case 5:
                System.out.println("Rise and fall, be wary of incidents");
                break;
            case 6:
                System.out.println("Overcome your challenges; success awaits. ");
                break;
            case 7:
                System.out.println("Gain a partner; lose a partner");
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }
}
