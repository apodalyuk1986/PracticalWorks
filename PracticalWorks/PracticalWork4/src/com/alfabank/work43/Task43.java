package com.alfabank.work43;

public class Task43 {
    public static void main(String[] args) {
        int digit = 1;
        // String values = "";
        while (digit <= 8) {
            // values = digit + " " + values;
            int value = digit;
            while (value >= 1) {
                System.out.print(value + " ");
                value--;
            }

            // System.out.println(values);
            System.out.println();
            digit++;
        }
    }
}
