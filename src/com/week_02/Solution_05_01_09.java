package com.week_02;

import java.util.Arrays;

/**
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 * You may modify and return the given array, or return a new array.
 .
 */
public class Solution_05_01_09 {
    public static void main(String[] args) {
        int[] array = {1};
        int n = 1;
        int tmpVar;
        for (int i = 1; i < n + 1; i++){
            tmpVar = array[0];
            for (int j = 0; j < array.length - 1; j++){
                array[j] = array [j + 1];
            }
            array[array.length - 1] = tmpVar;
        }
        System.out.println(Arrays.toString(array));
    }
}
