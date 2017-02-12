package com.week_03;

import java.util.Arrays;

/**
 * Создать массив, который будет состоять из диагонали матрици
 */
public class Solution_03_4 {
    public static int[] arrayFromMatrix(int[][] matrix){
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            array[i] = matrix[i][i];
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.genMatrix();

        System.out.println("Array:\n" + Arrays.toString(arrayFromMatrix(matrix)));
    }
}
