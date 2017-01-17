package com.week_02;

/**
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
 */
public class Solution_05_01_02 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 13, 2, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 13)
              i++;
            else
                sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}

