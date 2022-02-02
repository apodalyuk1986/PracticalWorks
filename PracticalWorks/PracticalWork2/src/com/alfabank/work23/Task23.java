package com.alfabank.work23;

public class Task23 {
    public static void main(String[] args) {
        int firstVariable = 123;
        int secondVariable = 456;
        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);
        firstVariable = firstVariable + secondVariable - (secondVariable = firstVariable);
        System.out.println("Change of variables in places.!");
        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);
    }
}
