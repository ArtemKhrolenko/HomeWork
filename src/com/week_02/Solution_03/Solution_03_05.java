package com.week_02.Solution_03;

import java.util.Scanner;

/**
 Given an int array length 2, return true if it does not contain a 2 or 3.
 */
public class Solution_03_05 {
    public static void main(String[] args) {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[2];
        System.out.println("Enter array with 2 elements: ");
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] == 2 || intArray[i] == 3){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}

