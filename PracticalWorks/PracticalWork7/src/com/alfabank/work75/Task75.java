package com.alfabank.work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        String numbers = scanner.nextLine();
        int[] array = countOfSequenceNumbers(numbers);
        System.out.println(Arrays.toString(array));
    }

    public static int[] countOfSequenceNumbers(String numbers) {
        int[] array = new int[9];
        for (int i = 0; i < numbers.length(); i++) {
            int temp = Integer.valueOf(String.valueOf(numbers.charAt(i)));
            if (temp > 0) {
                array[temp - 1]++;
            }
        }
        return array;
    }
}

