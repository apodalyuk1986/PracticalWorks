package com.alfabank.work45;

public class Task45 {
    public static void main(String[] args) {
        int firstMultiplier = 0;
        int secondMultiplier = 0;
        System.out.print("*| ");
        do {
            do {
                int result = firstMultiplier * secondMultiplier;
                if (result == 0 & firstMultiplier != 0) System.out.print((firstMultiplier) + "  ");
                if (result == 0 & firstMultiplier == 9) System.out.print("\n_  _  _  _  _  _  _  _  _  _");
                if (result == 0 & secondMultiplier != 0) System.out.print((secondMultiplier) + "| ");
                if (result < 10 & result > 0) System.out.print((result) + "  ");
                if (result >= 10) System.out.print((result) + " ");
                firstMultiplier++;
            } while (firstMultiplier < 10);
            System.out.println();
            firstMultiplier = 0;
            secondMultiplier++;
        } while (secondMultiplier < 10);
    }
}
