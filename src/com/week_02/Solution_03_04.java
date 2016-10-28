package com.week_02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Khrolenko on 28.10.2016.
 */
public class Solution_03_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstIntArray  = new int[3];
        int[] secondIntArray = new int[3];
        int[] resultIntArray = new int[2];
        System.out.println("Enter first array with 3 elements: ");
        for (int i = 0; i < firstIntArray.length; i++){
            firstIntArray[i] = scanner.nextInt();
        }

        System.out.println("Enter second array with 3 elements: ");
        for (int i = 0; i < secondIntArray.length; i++){
            secondIntArray[i] = scanner.nextInt();
        }
        resultIntArray[0] = firstIntArray[1];
        resultIntArray[1] = secondIntArray[1];
        System.out.println(Arrays.toString(resultIntArray));
    }
}
