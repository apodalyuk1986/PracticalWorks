package com.alfabank.work62;

public class Task62 {
    public static void main(String[] args) {
        int number = 25;
        System.out.println("Result -> " + latestDigit(number));
    }

    public static String latestDigit(int number) {
        if (number < 10 && number > -10) {
            return "No result";
        }
//        String numbers = String.valueOf(number);
        String numbers = String.valueOf(Math.abs(number) % 100);
//        return "" + numbers.charAt(numbers.length() - 1) + numbers.charAt(numbers.length() - 2);
//        return "" + numbers.charAt(1) + numbers.charAt(0);
        return new StringBuilder(numbers).reverse().toString();
    }
}
