package com.alfabank.work72;

import java.util.Arrays;

public class Task72 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));
        System.out.println("Sum: " + sumOddElementsArray(array));
    }

    public static int sumOddElementsArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                sum += i;
            }
            if (i < 0) {
                sum = -1;
                return sum;
            }
        }
        return sum;
    }
}
