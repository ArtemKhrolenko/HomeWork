package com.week_03;

import java.util.Random;
import java.util.Scanner;

/**
 * Generate MAtrix n x n
 */
public class MatrixUtils {

    public static int[][] genMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Origin matrix: ");
        fillIntMatrix(matrix);

//        System.out.println("\nResult matrix:");
//        printMatrix(matrix);
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.printf("%-5d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillIntMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = (int) (Math.random() * 47);
            }
        }
        printMatrix(matrix);
    }

    private static void fillBoolMatrix(boolean[][] matrix){
        System.out.println("Origin matrix: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = new Random().nextBoolean();
            }
        }
    }
}
