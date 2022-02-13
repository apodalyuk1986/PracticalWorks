package com.alfabank.work44;

public class Task44 {
    public static void main(String[] args) {
        int index = 0;
        int number = 1;
        while (index < 10) {
            if (number % 3 == 0 | number % 4 == 0) {
                System.out.println(number);
                index++;
            }
        if (number > 300) break;
        number++;
        }
    }
}
