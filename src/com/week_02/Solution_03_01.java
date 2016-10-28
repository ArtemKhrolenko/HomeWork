package com.week_02;

import java.util.Scanner;

/**
 Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more
 */
public class Solution_03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the array length: ");
        int arrayLength = scanner.nextInt();

        int[] intArray = new int[arrayLength];
        System.out.println("Type the int array: ");
        for (int i = 0; i < arrayLength; i++){
            intArray[i] = scanner.nextInt();
        }

        System.out.println(intArray[0] == 6 || intArray[arrayLength - 1] == 6);
    }
}

