package com.week_02.Solution_03;

import java.util.Scanner;

/**
 We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 */
public class Solution_03_09 {
    public static void main(String[] args) {
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[]{2, 1, 3, 3, 8, 2, 3};
        for (int i = 0; i < intArray.length - 1; i++){
            if (intArray[i] == 1 && intArray[i + 1] == 3) {
                if (i > 1 && i < intArray.length - 2)
                    continue;
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
