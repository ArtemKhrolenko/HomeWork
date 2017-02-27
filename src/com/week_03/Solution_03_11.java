package com.week_03;

import java.util.Scanner;

/**
 Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.
 */
public class Solution_03_11 {
    private static int[][] transpMatrix(int[][] matrix, int times){
        if (times > 1)
            matrix = transpMatrix(matrix, times - 1);
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                newMatrix[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        return newMatrix;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = MatrixUtils.genMatrix();
        System.out.println("Enter the angle: ");

        int times = scanner.nextInt() / 90;

        System.out.println("Times: " + times);

        System.out.println("Result Matrix: ");
        MatrixUtils.printMatrix(transpMatrix(matrix, times));
    }
}
