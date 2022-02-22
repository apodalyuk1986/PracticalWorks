package com.alfabank.work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.println(Arrays.toString(createArray(size)));
    }

    public static int[] createArray(int size) {
        if (size <= 0) {
            return new int[0];
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        return array;
    }
}
