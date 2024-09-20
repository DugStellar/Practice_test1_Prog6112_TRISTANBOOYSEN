package org.example;
import java.util.*;
class str3 {
    public static void main(String args[]) {
        {
            String s1 = new String("Java");
            String s2 = "2all";
            String s3 = s1 + s2;
            System.out.println("S1 =" + s1);
            System.out.println("S2 =" + s2);
            System.out.println("Concatenation Operator = " + s1 + s2);
            System.out.println("s3 = " + s3);

            byte num[] = {65, 66, 67, 68};
            String s4 = new String(num);
            System.out.println("S4 = " + s4);
        }
    }
}