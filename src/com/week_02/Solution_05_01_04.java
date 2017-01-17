package com.week_02;

import java.util.Arrays;

/**
 * Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
 * The given n may be 0, in which case just return a length 0 array.
 * You do not need a separate if-statement for the length-0 case;
 * the for-loop should naturally execute 0 times in that case, so it just works.
 * The syntax to make a new int array is: new int[desired_length]
 */
public class Solution_05_01_04 {
    public static void main(String[] args) {
        int n = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
