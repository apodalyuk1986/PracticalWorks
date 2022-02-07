package com.alfabank.work32;

public class Task32 {
    public static void main(String[] args) {
        double depositAmount = 7777;
        int percentRate = 12;
        int months = 8;
        double profit = (double) percentRate / 12 * months / 100 * depositAmount;
        System.out.println("Profit for " + months + " months: " + profit);
        System.out.println("Deposit amount with profit: " + (depositAmount + profit));
    }
}
