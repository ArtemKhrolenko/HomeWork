package com.week_02;

/**
 * Return true if the group of N numbers at the start and end of the array are the same.
 * For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
 * and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
 */
public class Solution_05_01_08 {
    public static void main(String[] args) {
        int n = 1;
        boolean result = false;
        int[] array = {5, 6, 45, 99, 13, 5, 6};
        for (int i = 0; i < n; i++){
            result = array[i] == array[array.length - 1 + i - n + 1];
            if (!result) break;
        }
        System.out.println(n == 0 || result);
    }
}
