package com.week_02.Solution_03;

import java.util.Arrays;
import java.util.Scanner;

/**
 Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 */
public class Solution_03_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[3];
        System.out.println("Enter array with 3 elements: ");
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = scanner.nextInt();
        }

        for(int i = 0; i < intArray.length / 2; i++){
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
