package com.week_02.Solution_03;

import java.util.Arrays;
import java.util.Scanner;

/**

 Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
 */
public class Solution_03_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[]{1, 2, 3, 4};
        int[] resultArray = new int[2];
        resultArray[0] = intArray[intArray.length / 2 - 1];
        resultArray[1] = intArray[intArray.length / 2];
        System.out.println(Arrays.toString(resultArray));
    }
}

