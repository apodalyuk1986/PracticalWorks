package com.alfabank.work31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight -> ");
        double weight = scanner.nextDouble();

        final double VALUE = 453.6;

        double ww = weight * VALUE;
        int kilo = (int)(ww / 1000);
        int gramm = (int)(ww - kilo * 1000);

        System.out.println("kg = " + kilo + "; gm = " + gramm);
    }
}
