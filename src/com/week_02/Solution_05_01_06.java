package com.week_02;

/**
 *Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
 * Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
 */
public class Solution_05_01_06 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 3};
        int count = 0;
        for (int i = 0; i < array1.length; i++){
            int diff = Math.abs(array1[i] - array2[i]);
            if(diff > 0 && diff < 3)
                count++;
        }
        System.out.println("Count = " + count);

    }
}
