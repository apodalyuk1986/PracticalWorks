package com.alfabank.work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int index = 0;
        while (index < text.length()) {
            char symbol = text.charAt(index);
            if ( text.indexOf(symbol) == text.lastIndexOf(symbol) ) {
                System.out.print(symbol + " ");
            }
            index++;
        }
    }
}
