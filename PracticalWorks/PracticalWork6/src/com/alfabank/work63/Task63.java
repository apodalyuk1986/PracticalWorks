package com.alfabank.work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
//        String text = "First second third fourth fifth sixth";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        text = text.trim();
        System.out.print("Enter the number: ");
        int numberOfWord = scanner.nextInt();
        System.out.println(getFirstCharacterOfWord(text, numberOfWord));
    }

    public static char getFirstCharacterOfWord(String str, int numberWord) {
        char symbol;
        int index = numberWord;
        int indexWord = 1;
        while (index > 1 && str.indexOf(' ') != -1) {
            str = str.substring(str.indexOf(" ") + 1);
            index--;
            indexWord++;
        }
        if (numberWord == indexWord) {
            symbol = str.charAt(0);
            return symbol;
        } else {
            symbol = ' ';
            System.out.println("Error word number!");
            return symbol;
        }
    }
}
