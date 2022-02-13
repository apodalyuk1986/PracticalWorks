package com.alfabank.work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int currentNumber;
        int result = 0;
        int index = 1;
        while (number / index > 0) {
            currentNumber = number / index % 10;
            result += currentNumber * currentNumber;
            index *= 10;
        }
        System.out.println("Result: " + result);
    }
}
