package com.week_02;

import java.util.Scanner;

/**
 Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
 */
public class Solution_03_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[]{1, 2, 1};

        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == 3 && i > 0 && intArray[i - 1] == 2){
                intArray[i] = 0;
                break;
            }
        }
    }

}
