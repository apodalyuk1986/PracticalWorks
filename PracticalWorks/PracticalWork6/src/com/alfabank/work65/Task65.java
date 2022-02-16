package com.alfabank.work65;

public class Task65 {
    public static void main(String[] args) {
        int height = 4;
        printPyramid(height);
    }

    public static void printPyramid(int height) {
        int indexMain = 1;
        while (indexMain <= height) {
            int index1 = 1;
            while (index1 <= height - indexMain) {
                System.out.print(" ");
                index1++;
            }
            int index2 = 1;
            while (index2 <= indexMain) {
                System.out.print(index2);
                index2++;
            }
            int index3 = 1;
            while (index3 < indexMain) {
                System.out.print(indexMain - index3);
                index3++;
            }
            System.out.println();
            indexMain++;
        }
    }
}