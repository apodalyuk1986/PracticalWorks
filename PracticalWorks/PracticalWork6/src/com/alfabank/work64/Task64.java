package com.alfabank.work64;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if (number > 0) System.out.println(convertDecimalToBinary(number));
        else System.out.println("Error number!");
    }

    public static String convertDecimalToBinary(int number) {
        String result = "";
        while (number > 0) {
            if (number % 2 == 0) {
                result = "0" + result;
            } else {
                result = "1" + result;
            }
            number /= 2;
        }
        return result;
    }
}
