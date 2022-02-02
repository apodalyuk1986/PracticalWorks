package com.alfabank.work22;

public class Task22 {
    public static void main(String[] args) {
        long milliseconds = System.currentTimeMillis();
        long seconds = milliseconds / 1000 % 60;
        long minutes = milliseconds / 1000 / 60 % 60;
        long hours = (2 + milliseconds / 1000 / 60 / 60) % 24;
        long days = (milliseconds / 1000 / 60 / 60 / 24 - 12) % 365;

        System.out.print("From the beginning of the year now: " + days + ":");
        System.out.print(hours + ":");
        System.out.print(minutes + ":");
        System.out.print(seconds);
    }
}
