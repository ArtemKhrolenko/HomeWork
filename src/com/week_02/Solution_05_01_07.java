package com.week_02;

/**
 * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
 */
public class Solution_05_01_07 {
    public static void main(String[] args) {
        int[] array = {2, 4, 2, 5};
        int counter = 1;
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++){
            if ((array[i] % 2 == 0 && array[i + 1] % 2 == 0) || (array[i] % 2 != 0 && array[i + 1] % 2 != 0)){
                counter++;
                if (counter == 3) break;
            }
            else counter = 1;
        }
        System.out.println(counter == 3);
    }
}
