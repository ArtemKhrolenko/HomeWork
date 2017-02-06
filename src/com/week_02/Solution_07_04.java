package com.week_02;

import java.util.Arrays;

/**
 * Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
 Количество позиций и массив указывает пользователь
 */
public class Solution_07_04 {
    public static int[] arrayShift(int[] inputArray, int shift){
        int tmpVar;
        for (int i = 0; i < shift; i++){
            tmpVar = inputArray[inputArray.length - 1];
            for (int j = inputArray.length - 1; j > 0; j--){
                inputArray[j] = inputArray [j-1];
            }
            inputArray[0] = tmpVar;
        }
        return inputArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayShift(new int[]{1,2,3,4,5}, 2)));
    }
}
