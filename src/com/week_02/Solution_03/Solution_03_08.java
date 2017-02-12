package com.week_02.Solution_03;

import java.util.Arrays;
import java.util.Scanner;

/**
 Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 */
public class Solution_03_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[]{1, 2, 1, 5, 8, 9, 3};
        int[] resultArray = new int[3];
        resultArray[0] = intArray[intArray.length / 2 - 1];
        resultArray[1] = intArray[intArray.length / 2];
        resultArray[2] = intArray[intArray.length / 2 + 1];

        System.out.println(Arrays.toString(resultArray));
    }
}
