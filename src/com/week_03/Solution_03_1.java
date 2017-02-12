package com.week_03;

/**
 * 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class Solution_03_1 {

    public static void main(String[] args) {
       int[][] matrix = new MatrixUtils().genMatrix();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] % 5 == 0)
                    matrix[i][j] = 8;
            }
        }
        System.out.println("\nResult matrix:");
        MatrixUtils.printMatrix(matrix);

    }
}
