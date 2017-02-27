package com.week_03;

/**
 * а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 * b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class Solution_03_5 {
    private static int[][] convertMatrix(boolean isRow){
        int largeRow = 0; //largest row
        int smallRow = 0; //smallest row

        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        int tempsum = 0;

        int[][] resultMatrix = new int[matrixy.length][matrixy[0].length];
        for (int i = 0; i < matrixy.length; i++)
            System.arraycopy(matrixy[i], 0, resultMatrix[i], 0, matrixy.length);

        for (int i = 0; i < resultMatrix.length; i++){
            for (int j = 0; j < resultMatrix[0].length; j++){
                tempsum += isRow? resultMatrix[i][j] : resultMatrix[j][i];
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

        for (int i = 0; i < resultMatrix[0].length; i++){
            if (isRow){
                resultMatrix[largeRow][i] ^= (resultMatrix[smallRow][i] ^= resultMatrix[largeRow][i]);
                resultMatrix[smallRow][i] ^= resultMatrix[largeRow][i];
            }
            else {
                resultMatrix[i][largeRow] ^= (resultMatrix[i][smallRow] ^= resultMatrix[i][largeRow]);
                resultMatrix[i][smallRow] ^= resultMatrix[i][largeRow];
            }
        }
        return resultMatrix;
    }

    private static int[][] matrixy = MatrixUtils.genMatrix();

    public static void main(String[] args) {

       //a
        System.out.println("Result Matrix with Raws exchange:");
        MatrixUtils.printMatrix(convertMatrix(true));

        //b
        System.out.println("Result Matrix with Collumns exchange:");
        MatrixUtils.printMatrix(convertMatrix(false));
        //test
    }
}
