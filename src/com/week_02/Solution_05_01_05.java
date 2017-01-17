package com.week_02;

/**
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 */
public class Solution_05_01_05 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 5, 13, 2, 4};
        boolean flag1 = false;
        boolean flag4 = false;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
           if (arr[i] == 1) flag1 = true;
           if (arr[i] == 4) flag4 = true;

        }
        System.out.println(flag);
        System.out.println(flag1 ^ flag4);
    }

}
