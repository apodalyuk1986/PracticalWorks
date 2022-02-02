package com.alfabank.work24;

public class Task24 {
    public static void main(String[] args) {
        int number = 123;
        int invertedNumber = number % 100 % 10 * 100 + number / 10 % 10 * 10 + number / 100;
        System.out.println(number + " - " + invertedNumber + " = " + (number - invertedNumber));
    }
}
