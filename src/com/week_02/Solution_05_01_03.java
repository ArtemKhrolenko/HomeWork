package com.week_02;

/**
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 */
public class Solution_05_01_03 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 13, 2, 4};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1 || arr[i] == 3)
                flag = true;
        }
        System.out.println(flag);
    }
}
