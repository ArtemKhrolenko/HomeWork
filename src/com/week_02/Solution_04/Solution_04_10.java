package com.week_02.Solution_04;

import com.week_02.ArrayUtils;

import java.util.Arrays;

/**
 * обрезать массив по границам start и end
 */
public class Solution_04_10 {
    public static void main(String[] args) {
        final int RANGE = 7;
        int[] arr1 = ArrayUtils.generateMas(RANGE, 54);
        System.out.println("Массив 1: " + Arrays.toString(arr1));
        int start = 1;
        int end = 4;
        int[] arr2 = new int[Math.max(Math.min(end, RANGE - 1) - start + 1, 2)];
        int j = 0;
        for (int i = Math.min(start, arr1.length - 2); i <= Math.min(end, arr1.length - 1); i++){
            arr2[j] = arr1[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
