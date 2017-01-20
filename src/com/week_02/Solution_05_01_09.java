package com.week_02;

/**
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 * You may modify and return the given array, or return a new array.
 .
 */
public class Solution_05_01_09 {
    public static void main(String[] args) {
        int[] array = {6, 2, 5, 3};
        int n = 2;
        int tmpVar;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < array.length - 1; j++){
                tmpVar = array[j + 1];
                array[j + 1] = array [j];
                array[j] = array[array.length - 1];
            }
        }


    }
}
