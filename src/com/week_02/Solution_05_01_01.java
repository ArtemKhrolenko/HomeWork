package com.week_02;

import java.util.Arrays;

/**
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1
 */
public class Solution_05_01_01 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateMas(7, 54);
        System.out.println("Оригинальный массив: \n" + Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) count++;
        }
        System.out.println("Number of even ints: " + count);
    }
}
