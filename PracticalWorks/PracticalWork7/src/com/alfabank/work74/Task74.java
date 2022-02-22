package com.alfabank.work74;

import java.util.Arrays;
import java.util.Scanner;

public class Task74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        int[][] matrix = createMatrix(size);
        printMatrix(matrix);
        transpositionMatrix(matrix);
        System.out.println();
        printMatrix(matrix);
    }

    public static void transpositionMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                matrix[i][j] = (int) (Math.random() * 50);
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
