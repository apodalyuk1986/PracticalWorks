package com.alfabank.work73;

import java.util.Arrays;
import java.util.Scanner;

public class Task73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        if (size > 0) {
            printMatrix(createMatrix(size));
        } else {
            System.out.println("No matrix!");
        }
    }

    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        int index = 1;
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                matrix[i][j] = index++;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
