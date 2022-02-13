package com.alfabank.work41;

public class Task41 {
    public static void main(String[] args) {
        int value1 = 3;
        int value2 = 2;
        int value3 = 1;
        int maxValue = value1;

        if (maxValue < value2) {
            maxValue = value1;
        }
        if (maxValue < value3) {
            maxValue = value3;
        }
        System.out.println("Max = " + maxValue);
    }
}
