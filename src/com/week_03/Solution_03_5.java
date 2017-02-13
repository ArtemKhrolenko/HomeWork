package com.week_03;

/**
 * а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 * b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class Solution_03_5 {

    private static int[][] convertMatrix(int[][] inputMatrix, boolean isRow){
        int largeRow = 0; //largest row
        int smallRow = 0; //smallest row

        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        int tempsum = 0;

        for (int i = 0; i < inputMatrix.length; i++){
            for (int j = 0; j < inputMatrix[0].length; j++){
                tempsum += isRow? inputMatrix[i][j] : inputMatrix[j][i];
                if (tempsum > maxsum){
                    maxsum = tempsum;
                    largeRow = isRow? i : j;
                }

                if (tempsum < minsum){
                    minsum = tempsum;
                    smallRow = isRow? i : j;
                }
            }
            tempsum = 0;
        }

        for (int i = 0; i < inputMatrix[0].length; i++){
            if (isRow){
                inputMatrix[largeRow][i] ^= (inputMatrix[smallRow][i] ^= inputMatrix[largeRow][i]);
                inputMatrix[smallRow][i] ^= inputMatrix[largeRow][i];
            }
            else {
                inputMatrix[i][largeRow] ^= (inputMatrix[i][smallRow] ^= inputMatrix[i][largeRow]);
                inputMatrix[i][smallRow] ^= inputMatrix[i][largeRow];
            }

        }
        int[][] resultMatrix = new int[inputMatrix.length][inputMatrix[0].length];
        for (int i = 0; i < inputMatrix.length; i++)
            System.arraycopy(inputMatrix[i], 0, resultMatrix[i], 0, inputMatrix.length);

        return resultMatrix;
    }

    public static void main(String[] args) {
       int[][] matrixy =  MatrixUtils.genMatrix();
       //a
        System.out.println("Result Matrix with Raws exchange:");
        MatrixUtils.printMatrix(convertMatrix(matrixy, true));

        //b
        System.out.println("Result Matrix with Collumns exchange:");
        MatrixUtils.printMatrix(convertMatrix(matrixy, false));
    }
}
