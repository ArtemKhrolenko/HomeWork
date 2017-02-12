package com.week_02.Solution_07;

import java.util.Arrays;

/**
 * Инвертировать массив (без использования допольнительного массива)
 */
public class Solution_07_01 {
    public static int[] arrayInvert(int[] inputArray){
        for (int i = 0; i < inputArray.length / 2; i++){
            inputArray[i] ^= (inputArray[inputArray.length - 1 - i] ^= inputArray[i]);
            inputArray[inputArray.length - 1 - i] ^= inputArray[i];
        }
        return inputArray;
    }
    public static void main(String[] args) {
        int[] arrayInt = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrayInvert(arrayInt)));
    }
}
