package com.alfabank.work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number -> ");
        int number = scanner.nextInt();

        /*
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else {
            System.out.println("Other");
        }
        */

        switch (number) {
            case 1:
                System.out.println("One"); break;
            case 2:
                System.out.println("Two"); break;
            default:
                System.out.println("Other");
        }
    }
}
